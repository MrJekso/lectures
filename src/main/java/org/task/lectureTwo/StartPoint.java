package org.task.lectureTwo;

import java.util.Random;

public class StartPoint {
    public static void run() {
        Hurdle[] hurdle = new Hurdle[5];
        Random random = new Random();
        int num;
        for (int i = 0; i < hurdle.length; i++){
            num = random.nextInt(0,2);
            if(num == 0) {
                hurdle[i] = new Wall(random.nextInt(1,5));
            }else{
                hurdle[i] = new Racecourse(random.nextInt(15,85));
            }
        }

        Bot[] bots = new Bot[3];
        bots[0] = new People(2,50);
        bots[1] = new Robot(3,75);
        bots[2] = new Cat(1,35);

        for(Bot b: bots){
            tests(hurdle,b);
        }
    }
    public static void tests(Hurdle[] hurdles, Bot  bot){
        System.out.println("---началось тестирование---");
        for(Hurdle e:hurdles){
            boolean result = bot.OvercomeObstacle(e);
            if(!result)
                break;
        }
    }
}
