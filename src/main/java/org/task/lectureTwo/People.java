package org.task.lectureTwo;

public class People extends Bot implements InterfaceActions{
    public People(int height,int length){
        super(height,length);
    }
    @Override
    public boolean OvercomeObstacle(Hurdle hurdle) {
        if (hurdle.getClass() == Wall.class) {
            if (this.jump((Wall) hurdle)) {
                System.out.printf("Человек перепрыгнул препятствие высотой %d м\n", hurdle.getValueHurdle());
                return true;
            } else {
                System.out.printf("Человек не смог перепрыгнуть %d м\n", hurdle.getValueHurdle());
                return false;
            }
        }
        if (hurdle.getClass() == Racecourse.class) {
            if (this.run((Racecourse) hurdle)) {
                System.out.printf("Человек пробежал %d м\n", hurdle.getValueHurdle());
                return true;
            } else {
                System.out.printf("Человек не смог пробежать %d м\n", hurdle.getValueHurdle());
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
        if(this.length >= racecourse.getValueHurdle()){
            return true;
        }else {
            return false;
        }
    }
}