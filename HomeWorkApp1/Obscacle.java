package HomeWorkApp1;
/**
 * Java Core.  Homework 1
 * @author Telepov Vladislav
 * @version Date: 19.05.2022 г.
 */

public enum Obscacle {
    RUNING("Бег", 55), CLIMBING("Велогонки", 55), JUMPING("Прыжки", 60),
    SWINIMNG("Плаванье", 50);
    private String obstacle;
    private int skill;
    Obscacle(String obstacle, int skill){
        this.obstacle = obstacle;
        this.skill = skill;
    }

    public boolean ablePass(int skill){
        return (skill > 10 && skill >= this.skill );
    }

}
