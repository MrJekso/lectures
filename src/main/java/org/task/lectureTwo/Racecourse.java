package org.task.lectureTwo;

public class Racecourse extends Hurdle {
    public Racecourse(int value){
        this.valueHurdle = value;
    }

    @Override
    public int getValueHurdle(){
        return this.valueHurdle;
    }
}
