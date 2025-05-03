package org.task.lectureThree;

import java.util.Arrays;
import java.util.stream.Stream;

public class StartPoint {
    public static void run(){
        System.out.println("---задача первая---");
        Builder<Double> builder = new Builder<>();
        Double[] test = new Double[]{1.1,2.2,3.3};
        System.out.println(Arrays.toString(test));
        builder.exchange(test,2,1);
        System.out.println(Arrays.toString(test));

        System.out.println("---задача вторая---");
        System.out.printf("Текущие имя класс у массива: %s\n",test.getClass());
        System.out.printf("Имя класса нового массива после обработки: %s\n",builder.transformInArrayList(test).getClass());

        System.out.println("---задача третья---");
        Box<Orange> firstBoxOrange = new Box<>();
        Box<Orange> lastBoxOrange = new Box<>();
        Box<Apple> firstBoxApple = new Box<>();
        Box<Apple> lastBoxApple = new Box<>();

        for(int i = 0; i < 10; i++){
            firstBoxOrange.addFruit(new Orange());
            firstBoxApple.addFruit(new Apple());
        }
        System.out.println("Первая коробка с яблоками: " +firstBoxApple);
        System.out.println("Вторая коробка с яблоками: " + lastBoxApple);
        System.out.println("Переложили яблоки из первой коробки во вторую");
        firstBoxApple.moveFruits(lastBoxApple);
        System.out.println("Первая коробка с яблоками: " +firstBoxApple);
        System.out.println("Вторая коробка с яблоками: " + lastBoxApple);
        System.out.println("Сравним коробку апельсинов с яблоками");
        if(firstBoxOrange.compare(lastBoxApple)){
            System.out.println("Вес одинаковый");
        }else {
            System.out.println("Вес различается");
        }
        System.out.println("Добавим яблок в первую коробку");
        for(int i = 0; i < 10; i++){
            firstBoxApple.addFruit(new Apple());
        }
        System.out.println("Теперь сравним две коробки с яблоками в одинаковом количестве");
        if(firstBoxApple.compare(lastBoxApple)){
            System.out.println("Вес одинаковый");
        }else {
            System.out.println("Вес различается");
        }
    }
}
