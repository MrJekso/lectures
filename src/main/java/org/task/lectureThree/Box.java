package org.task.lectureThree;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    public ArrayList<T> fruits = new ArrayList<>();

    public float getWeight(){
        if(fruits.size() > 0 )
            return fruits.size() * fruits.get(0).getWeight();
        else
            return 0;
    }

    public boolean compare(Box box){
        if(Math.abs(this.getWeight() - box.getWeight()) < 0.0001)
            return true;
        else
            return false;
    }

    public void moveFruits(Box box){
        this.fruits.stream().forEach(i->box.addFruit(i));
        this.fruits.clear();
    }

    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }
    @Override
    public String toString(){
        return this.fruits.toString();
    }
}
