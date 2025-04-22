package org.task.lectureTwo;

public class Wall extends Hurdle {
    public Wall(int value){
        this.valueHurdle = value;
    }

    @Override
    public int getValueHurdle(){
        return this.valueHurdle;
    }
}