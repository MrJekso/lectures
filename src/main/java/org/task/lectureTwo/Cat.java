package org.task.lectureTwo;

public class Cat extends Bot implements  InterfaceActions{
    public Cat(int height, int length){
        super(height,length);
    }
    @Override
    public boolean OvercomeObstacle(Hurdle hurdle) {
        if (hurdle.getClass() == Wall.class) {
            if (this.jump((Wall) hurdle)) {
                System.out.printf("Кошка перепрыгнула препятствие высотой %d м\n", hurdle.getValueHurdle());
                return true;
            } else {
                System.out.printf("Кошка не смогла перепрыгнуть %d м\n", hurdle.getValueHurdle());
                return false;
            }
        }
        if (hurdle.getClass() == Racecourse.class) {
            if (this.run((Racecourse) hurdle)) {
                System.out.printf("Кошка пробежала %d м\n", hurdle.getValueHurdle());
                return true;
            } else {
                System.out.printf("Кошка не смогла пробежать %d м\n", hurdle.getValueHurdle());
                return false;
            }
        }
        return false;
    }
    @Override
    public boolean jump(Wall wall) {
        if(this.height >= wall.getValueHurdle()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean run(Racecourse racecourse) {
        if (this.length >= racecourse.getValueHurdle()) {
            return true;
        } else {
            return false;
        }
    }
}