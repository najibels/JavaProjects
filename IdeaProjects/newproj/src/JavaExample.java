
import java.util.Scanner;
public class JavaExample{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any hexadecimal number: ");
        String hexnum = scanner.nextLine();
        scanner.close();

        //converting hex to decimal by passing base 16
        int num = convertHexToDecimal(hexnum);

        System.out.println("Decimal equivalent of given hex number: "+num);
    }

    private static int convertHexToDecimal(String hexnum) {
        int num = Integer.parseInt(hexnum,16);
        return num;
    }
}