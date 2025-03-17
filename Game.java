
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Player player = new Player();  // Now correctly imported
        Skill skill = new Skill();     // Now correctly imported

        System.out.println(player);

        // Scanner keyboard = new Scanner(System.in);
        // Player player = new Player();
        // Skill skill = new Skill();

        // boolean selectPlayer = false;

        // System.out.println(player);

        // if (!selectPlayer) {
        //     while (true) {
        //         String select = keyboard.next();


        //         if (select.equals("1") || select.equals("2")) {

        //             selectPlayer = true;
        //         }

        //         break;
        //     }
        // }

    }

    public int random() {
        int number = (int) (Math.random() * 6) + 1;
        return number;
    }
}
