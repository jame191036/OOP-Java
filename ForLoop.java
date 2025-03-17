
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            int point = keyboard.nextInt();
            keyboard.close();            

            if (point > 20000) {
                leftSideTriangle();
            } else {
                rightSideTriangle();
            }
        } catch (Exception ex) {

        }
    }

    public static void leftSideTriangle() {
        for (int i = 0; i < 6; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightSideTriangle() {
        int n = 6; // Number of rows

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
                // n--;
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
