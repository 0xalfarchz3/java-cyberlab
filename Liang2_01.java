import java.util.Scanner;

public class Liang2_01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a deree in Celsius : ");
        double celsius = input.nextDouble();

        double fahrenheit = 9.0 / 5 * celsius + 32;

        System.out.println(celsius + "Celsius is " + fahrenheit + "fahrenheit");
        input.close();
    }

    public Liang2_01() {
    }
}
