import java.util.Scanner;

public class Order3Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three Integers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int temporary;
        if(number1 > number2) {
            temporary = number1;
            number1 = number2;
            number2 = temporary;
        }
        if(number2 > number3) {
            temporary = number2;
            number2 = number3;
            number3 = temporary;
        }
        if(number1 > number2) {
            temporary = number1;
            number1 = number2;
            number2 = temporary;
        }
        System.out.println(number1 + " " + number2 + " " + number3);

        input.close();
    }
}
