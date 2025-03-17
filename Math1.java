
import java.util.Scanner;

public class math1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        keyboard.close();

        // int sumNumber = 0;
        // for (int i = 0; i <= number; i++) {
        //     sumNumber += i;
        // }

        System.out.println(number/2 * (2 + (number - 1)));
    }
}
