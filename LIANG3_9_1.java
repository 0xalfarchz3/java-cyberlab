import java.util.Scanner;

public class LIANG3_9_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn9 = input.nextInt();

        int d9 = isbn9 % 10;
        int sisa = isbn9 / 10;
        
        int d8 = sisa % 10;
        sisa = sisa / 10;
        
        int d7 = sisa % 10;
        sisa = sisa / 10;
        
        int d6 = sisa % 10;
        sisa = sisa / 10;
        
        int d5 = sisa % 10;
        sisa = sisa / 10;
        
        int d4 = sisa % 10;
        sisa = sisa / 10;
        
        int d3 = sisa % 10;
        sisa = sisa / 10;
        
        int d2 = sisa % 10;
        sisa = sisa / 10;
        
        int d1 = sisa % 10;

        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + String.format("%09d", isbn9));

        if (checksum == 10) {
            System.out.println("X");
        } else {
            System.out.println(checksum);
        }

        input.close();
    }
}