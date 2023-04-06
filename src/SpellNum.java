import java.util.Scanner;
public class SpellNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        boolean check = true;
        String result;
        while (check) {
            result = "";
            System.out.println("enter a number :");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid number");
                System.out.println("Enter again :");
                scanner.next();
            }
            num = scanner.nextInt();
            String stringnum = Integer.toString(num);
            if (num >= 100) {
                switch (stringnum.charAt(0)) {
                    case '1':
                        result += "one hundred";
                        break;
                    case '2':
                        result += "two hundred";
                        break;
                    case '3':
                        result += "three hundred";
                        break;
                    case '4':
                        result += "four hundred";
                        break;
                    case '5':
                        result += "five hundred";
                        break;
                    case '6':
                        result += "six hundred";
                        break;
                    case '7':
                        result += "seven hundred";
                        break;
                    case '8':
                        result += "eight hundred";
                        break;
                    case '9':
                        result += "nine hundred";
                        break;
                }
            }
            if (num >= 20) {
                switch (stringnum.charAt(1)) {
                    case '2':
                        result += " twenty";
                        break;
                    case '3':
                        result += " thirty";
                        break;
                    case '4':
                        result += " fourty";
                        break;
                    case '5':
                        result += " fifty";
                        break;
                    case '6':
                        result += " sixty";
                        break;
                    case '7':
                        result += " seventy";
                        break;
                    case '8':
                        result += " eighty";
                        break;
                    case '9':
                        result += " ninety";
                        break;
                }
            }
            if (num >= 10 && stringnum.charAt(1) == '1') {
                switch (stringnum.charAt(2)) {
                    case '0':
                            result += " ten";
                        break;
                    case '1':
                        result += " eleven";
                        break;
                    case '2':
                        result += " twelve";
                        break;
                    case '3':
                        result += " thirteen";
                        break;
                    case '4':
                        result += " fourteen";
                        break;
                    case '5':
                        result += " fifteen";
                        break;
                    case '6':
                        result += " sixteen";
                        break;
                    case '7':
                        result += " seventeen";
                        break;
                    case '8':
                        result += " eighteen";
                        break;
                    case '9':
                        result += " nineteen";
                        break;
                }
            }
            if (num > 0 && stringnum.charAt(1) != '1') {
                switch (stringnum.charAt(2)) {
                    case '1':
                        result += " one";
                        break;
                    case '2':
                        result += " two";
                        break;
                    case '3':
                        result += " three";
                        break;
                    case '4':
                        result += " four";
                        break;
                    case '5':
                        result += " five";
                        break;
                    case '6':
                        result += " six";
                        break;
                    case '7':
                        result += " seven";
                        break;
                    case '8':
                        result += " eight";
                        break;
                    case '9':
                        result += " nine";
                        break;
                }
            }
            System.out.println(result);
        }
    }
}
