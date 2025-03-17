public class Status {
    private String name;
    private int HP;
    private int MP;
    private int Atk;
    private int AtkMagic;
    private int Agi;
    private int def;
    private int defMagic;

    public Status() {
        this.Agi = Agi;
        this.Atk = Atk;
        this.AtkMagic = AtkMagic;
        this.HP = HP;
        this.MP = MP;
        this.def = def;
        this.defMagic = defMagic;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    public int getAtkMagic() {
        return AtkMagic;
    }

    public void setAtkMagic(int AtkMagic) {
        this.AtkMagic = AtkMagic;
    }

    public int getAgi() {
        return Agi;
    }

    public void setAgi(int Agi) {
        this.Agi = Agi;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDefMagic() {
        return defMagic;
    }

    public void setDefMagic(int defMagic) {
        this.defMagic = defMagic;
    }
}
