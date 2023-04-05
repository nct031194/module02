import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        float bmi;
        float height;
        float weight;
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
       while (check) {
            System.out.println("Enter height :");
            while (!scanner.hasNextFloat()) {
                System.out.println("Invalid");
                scanner.next();
            }
            height = scanner.nextFloat();

            System.out.println("Enter weight :");
            while (!scanner.hasNextFloat()) {
                System.out.println("Invalid");
                scanner.next();
            }
            weight = scanner.nextFloat();
            bmi = weight / height / height;
            System.out.println("Your BMI : " + bmi);
            if (bmi <= 30) {
                if (bmi >= 25) System.out.println("Overweight");
                if (bmi < 25 && bmi >= 18.5) System.out.println("Normal");
                if (bmi < 18.5) System.out.println("Underweight");
            }
        }
    }
}
