package HomeWorkApp1;
/**
 * Java Core.  Homework 1
 * @author Telepov Vladislav
 * @version Date: 16.05.2022 г.
 */

public class Member {
    private final int skill;
    private final String name;
    public boolean finished;

    public Member(String name, int skill) {
        this.skill = skill;
        this.name = name;
        finished = false;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    @Override
    public String toString(){
        return "Имя: " + name + ", " + "Навыки: " + skill;
    }
 }
