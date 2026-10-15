import java.util.Scanner;

public class ClassifyBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in metres: ");
        double height = input.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Error: Weight and height must be positive numbers.");
        } else {
            double bmi = weight / (height * height);
            System.out.printf("BMI is : %.2f\n", bmi);

            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25.0) {
                System.out.println("Normal");
            } else if (bmi < 30.0) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }

        input.close();
    }
}
