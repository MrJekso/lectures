package org.task.lectureOne;

import java.util.Arrays;
import java.util.Random;

public class StartPoint {
    public static void run() {
        Random random = new Random();

        Animal[] animal = new Animal[15];

        Animal.countAnimal = animal.length;

        int num;
        for (int i = 0; i < animal.length; i++) {
            num = random.nextInt(1, 3);
            if (num == 1) {
                animal[i] = new Cat();
                Animal.countCat++;
            } else if (num == 2) {
                animal[i] = new Dog();
                Animal.countDog++;
            } else if (num == 3) {
                animal[i] = new Tiger();
                Animal.countTiger++;
            }
        }

        Arrays.stream(animal).forEach(i -> {
            i.run(random.nextInt(1, 1000));
            i.swim(random.nextInt(1, 1000));
            System.out.println();
        });
    }
}
