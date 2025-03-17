
import java.util.Scanner;

public class ChocolateBar {

    public static void main(String[] args) {
        Cocao cocao = new Cocao();
        Bar bar = new Bar();

        Scanner keyboard = new Scanner(System.in);
        String country = keyboard.next();
        keyboard.close();

        cocao.setOrigin("Robusta");
        cocao.setCountry(country);
        bar.setMold("Heart");
        bar.setWeight(300);
        bar.setHeight(3);
        bar.setWidth(20);

        String cc = cocao.getCountry();

        if (cc.equals("Thailand")) {
            System.out.println("made in Thailand");
        } else {
            System.out.println("made in china");
        }

        System.out.println(cocao.getOrigin() + " " + cocao.getCountry() + " "
                + bar.getMold() + " " + bar.getWeight() + " " + bar.getHeight() + " "
                + bar.getWidth());
    }
}
