package org.task.lectureOne;

public class Cat extends Animal implements InterfaceAnimal {
    @Override
    public void run(int obstacleLength){
        if(obstacleLength <= 200){
            System.out.printf("Кот пробежала %s м\n", obstacleLength);
        }else{
            System.out.printf("Кот не может пробежать %s м\n",obstacleLength);
        }
    }
    @Override
    public void swim(int obstacleLength){
        System.out.printf("Коты не умеют плавать\n");
    }
}
