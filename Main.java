import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        String c = keyboard.next();
        int b = keyboard.nextInt();
        String line = keyboard.nextLine();

        keyboard.close();
        
        System.out.println(a + c + b + line);
        listMenu(a, c, b);
    }

    public static void listMenu(int a, String c, int b) {
        System.out.println("Hello World");
        sum(a, b, c);
    }

    public static void sum(int a, int b, String c) {
        // System.out.println(a + b);
        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "x":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                throw new AssertionError();
        }
    }

}
