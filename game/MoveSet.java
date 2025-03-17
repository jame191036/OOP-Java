package game;

public class MoveSet {
    private String nameSkill;
    private boolean isMagic;
    private boolean isAoe;
    private int minRequired;
    private int dmg;
    private int acc;
    private int usageMP;

    // Constructor
    public MoveSet(String nameSkill, boolean isMagic, boolean isAoe, int minRequired, int dmg, int acc, int usageMP) {
        this.nameSkill = nameSkill;
        this.isMagic = isMagic;
        this.isAoe = isAoe;
        this.minRequired = minRequired;
        this.dmg = dmg;
        this.acc = acc;
        this.usageMP = usageMP;
    }

    // Getters and Setters
    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public boolean isMagic() {
        return isMagic;
    }

    public void setIsMagic(boolean isMagic) {
        this.isMagic = isMagic;
    }

    public boolean isAoe() {
        return isAoe;
    }

    public void setIsAoe(boolean isAoe) {
        this.isAoe = isAoe;
    }

    public int getMinRequired() {
        return minRequired;
    }

    public void setMinRequired(int minRequired) {
        this.minRequired = minRequired;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getUsageMP() {
        return usageMP;
    }

    public void setUsageMP(int usageMP) {
        this.usageMP = usageMP;
    }

    @Override
    public String toString() {
        return "Skill: " + nameSkill + "\nMagic: " + isMagic + "\nAoE: " + isAoe + "\nMinRequired: " + minRequired +
               "\nDamage: " + dmg + "\nAccuracy: " + acc + "\nUsage MP: " + usageMP;
    }
}
