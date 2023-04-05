
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean check = true;
        while (check) {
            System.out.println("Enter a year to check :");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid year");
                System.out.println("Enter a year to check :");
                scanner.next();
            }
            year = scanner.nextInt();
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                if (year % 4 == 0) {
                    System.out.println(year + " is a leap year");
                }
                else {
                    System.out.println(year + " is not a leap year");
                }
            }
        }
    }
}
