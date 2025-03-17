package game;

public class MoveSetbuff {
    
    private String name;
    private int HP, MP, Atk, AtkMagic, Agi, Def, DefMagic, lucky;

    // Constructor
    public MoveSetbuff(String name, int HP, int MP, int Atk, int AtkMagic, int Agi, int Def, int DefMagic, int lucky) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.Atk = Atk;
        this.AtkMagic = AtkMagic;
        this.Agi = Agi;
        this.Def = Def;
        this.DefMagic = DefMagic;
        this.lucky = lucky;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getAtk() {
        return Atk;
    }

    public int getAtkMagic() {
        return AtkMagic;
    }

    public int getAgi() {
        return Agi;
    }

    public int getDef() {
        return Def;
    }

    public int getDefMagic() {
        return DefMagic;
    }

    public int getLucky() {
        return lucky;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    public void setAtkMagic(int AtkMagic) {
        this.AtkMagic = AtkMagic;
    }

    public void setAgi(int Agi) {
        this.Agi = Agi;
    }

    public void setDef(int Def) {
        this.Def = Def;
    }

    public void setDefMagic(int DefMagic) {
        this.DefMagic = DefMagic;
    }

    public void setLucky(int lucky) {
        this.lucky = lucky;
    }

    @Override
    public String toString() {
        return "Buff Name: " + name + "\n"
                + "HP: " + HP + "\n"
                + "MP: " + MP + "\n"
                + "Attack: " + Atk + "\n"
                + "Magic Attack: " + AtkMagic + "\n"
                + "Agility: " + Agi + "\n"
                + "Defense: " + Def + "\n"
                + "Magic Defense: " + DefMagic + "\n"
                + "Luck: " + lucky;
    }
}
