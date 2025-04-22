package org.task.lectureOne;

public class Tiger extends  Cat implements InterfaceAnimal {
    @Override
    public void run(int obstacleLength){
        if(obstacleLength <= 1000){
            System.out.printf("Тигр пробежала %s м\n", obstacleLength);
        }else{
            System.out.printf("Тигр не может пробежать %s м\n",obstacleLength);
        }
    }
    @Override
    public void swim(int obstacleLength){
        System.out.printf("Тигры не умеют плавать\n");
    }
}
