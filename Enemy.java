
public class Enemy extends Status {

    public static void main(String[] args) {
        Enemy enemy = new Enemy();

        enemy.setName("bird");
        enemy.setHP(500);
        enemy.setMP(200);
        enemy.setAtk(40);
        enemy.setAtkMagic(0);
        enemy.setAgi(3);
        enemy.setDef(100);
        enemy.setDefMagic(100);
    }
}
