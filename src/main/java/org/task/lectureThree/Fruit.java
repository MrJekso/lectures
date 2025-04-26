package org.task.lectureThree;

public class Fruit {
    protected float weight;
    protected String name;

    public float getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
