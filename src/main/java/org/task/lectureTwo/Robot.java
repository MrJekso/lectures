package org.task.lectureTwo;

public class Robot extends Bot implements InterfaceActions {

    public Robot(int height,int length){
        super(height,length);
    }

    @Override
    public boolean OvercomeObstacle(Hurdle hurdle) {
        if (hurdle.getClass() == Wall.class) {
            if (this.jump((Wall) hurdle)) {
                System.out.printf("Робот перепрыгнул препятствие высотой %d м\n", hurdle.getValueHurdle());
                return true;
            } else {
                System.out.printf("Робот не смог перепрыгнуть %d м\n", hurdle.getValueHurdle());
                return false;
            }
        }
        if (hurdle.getClass() == Racecourse.class) {
            if (this.run((Racecourse) hurdle)) {
                System.out.printf("Робот пробежал %d м\n", hurdle.getValueHurdle());
                return true;
            } else {
                System.out.printf("Робот не смог пробежать %d м\n", hurdle.getValueHurdle());
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
