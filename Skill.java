public class Skill extends MoveSet {
    public static void main(String[] args) {
        Skill skill_1 = new Skill();
        Skill skill_2 = new Skill();

        skill_1.setNameSkill("skill_A");
        skill_1.setIsMagic(false);
        skill_1.setIsAoe(false);
        skill_1.setminRequired(3);
        skill_1.setDmg(40);
        skill_1.setAcc(5);
        skill_1.setUsageMP(0);

        skill_2.setNameSkill("skill_B");
        skill_2.setIsMagic(false);
        skill_2.setIsAoe(false);
        skill_2.setminRequired(3);
        skill_2.setDmg(40);
        skill_2.setAcc(5);
        skill_2.setUsageMP(0);
    }
}
