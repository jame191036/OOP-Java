public class MoveSet {
    String nameSkill;
    boolean isMagic;
    boolean isAoe;
    int minRequired;
    int dmg;
    int acc;
    int usageMP;

    public MoveSet() {
        this.acc = acc;
        this.dmg = dmg;
        this.isAoe = isAoe;
        this.isMagic = isMagic;
        this.nameSkill = nameSkill;
        this.usageMP = usageMP;
        this.minRequired = minRequired;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public boolean isIsMagic() {
        return isMagic;
    }

    public void setIsMagic(boolean isMagic) {
        this.isMagic = isMagic;
    }

    public boolean isIsAoe() {
        return isAoe;
    }

    public void setIsAoe(boolean isAoe) {
        this.isAoe = isAoe;
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

    public int getminRequired() {
        return minRequired;
    }

    public void setminRequired(int minRequired) {
        this.minRequired = minRequired;
    }
}