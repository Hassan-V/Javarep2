package Shafin_Lab2;
//Shafin ALam - 252 - F - BSE
import java.util.Scanner;
public class HashCodeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to calculate its hash code (or type 'exit' to quit):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int hashCode = input.hashCode();
            System.out.println("Hash code of '" + input + "': " + hashCode);
        }

        scanner.close();
    }
}
