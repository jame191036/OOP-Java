package game;

public class Skill extends MoveSet {

    // Constructor that passes values to the parent MoveSet class
    public Skill(String nameSkill, boolean isMagic, boolean isAoe, int minRequired, int dmg, int acc, int usageMP) {
        super(nameSkill, isMagic, isAoe, minRequired, dmg, acc, usageMP);
    }
}
