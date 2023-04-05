import java.util.Scanner;
public class VNDUSD {
    public static void main(String[] args) {
        int rate = 23000;
        double vnd;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of USD to exchange :");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid USD");
            System.out.println("Enter again :");
            scanner.next();
        }
        usd = scanner.nextDouble();
        vnd = usd * rate;
        System.out.println(usd + "$ exchanged to " + vnd + "VND");
    }
}
