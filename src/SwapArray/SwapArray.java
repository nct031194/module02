package SwapArray;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwapArray {

    static void reservearray(int a[]){
        int[] b = new int [a.length];
        int j = a.length;
        for (int i = 0; i < a.length ; i++){
            b[i] = a[j-1];
            j--;
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array :");
        while(!scanner.hasNextInt()){
            System.out.println("Invalid number ");
            System.out.println("enter again...");
            scanner.next();
        }
        size = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("Elements of array:");
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n Reserve array :");
        reservearray(array);

    }
}
