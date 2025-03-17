
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Player extends Status {

    public static void main(String[] args) {
        Player swordMan = new Player();
        Player magician = new Player();

        swordMan.setName("swordMan");
        swordMan.setHP(500);
        swordMan.setMP(200);
        swordMan.setAtk(40);
        swordMan.setAtkMagic(0);
        swordMan.setAgi(2);
        swordMan.setDef(100);
        swordMan.setDefMagic(40);

        magician.setName("magician");
        magician.setHP(300);
        magician.setMP(600);
        magician.setAtk(10);
        magician.setAtkMagic(60);
        magician.setAgi(5);
        magician.setDef(40);
        magician.setDefMagic(100);

        // Export to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("players.dat"))) {
            out.writeObject(swordMan);
            out.writeObject(magician);
            System.out.println("Players exported successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
