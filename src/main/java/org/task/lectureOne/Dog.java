package org.task.lectureOne;

public class Dog extends Animal implements InterfaceAnimal{
    @Override
    public void run(int obstacleLength){
        if(obstacleLength <= 500){
            System.out.printf("Собака пробежала %s м\n", obstacleLength);
        }else{
            System.out.printf("Собака не может пробежать %s м\n",obstacleLength);
        }
    }
    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength <= 500){
            System.out.printf("Собака проплыла %s м\n", obstacleLength);
        }else{
            System.out.printf("Собака не может пробежать %s \n",obstacleLength);
        }
    }
}