//Shafin ALam - 252 - F - BSE
package Shafin_Lab2;
import java.util.Scanner;
import java.util.ArrayList;
public class StringArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a string");
            System.out.println("2. Display all elements");
            System.out.println("3. Display the largest string");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String inputString = scanner.nextLine();
                    stringList.add(inputString);
                    break;

                case 2:
                    System.out.println("All elements in the list:");
                    for (String str : stringList) {
                        System.out.println(str);
                    }
                    break;

                case 3:
                    if (stringList.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        String largestString = stringList.get(0);
                        for (String str : stringList) {
                            if (str.length() > largestString.length()) {
                                largestString = str;
                            }
                        }
                        System.out.println("The largest string is: " + largestString);
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
