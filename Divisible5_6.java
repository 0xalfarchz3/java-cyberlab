import java.util.Scanner;

public class Divisible5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // PENTING: Cek "both" harus di paling atas sesuai hint
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by both 5 and 6");
        } 
        else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5 but not 6");
        } 
        else if (number % 6 == 0) {
            System.out.println(number + " is divisible by 6 but not 5");
        } 
        else {
            System.out.println(number + " is divisible by neither 5 nor 6");
        }

        input.close();
    }
    
}