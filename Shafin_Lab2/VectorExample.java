//Shafin ALam - 252 - F - BSE
package Shafin_Lab2;
import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        // Initialize a Vector with 10 integers
        Vector<Integer> integerVector = new Vector<>();

        integerVector.add(1);
        integerVector.add(2);
        integerVector.add(3);
        integerVector.add(4);
        integerVector.add(5);
        integerVector.add(6);
        integerVector.add(7);
        integerVector.add(8);
        integerVector.add(9);
        integerVector.add(10);

        // Display all the integers
        System.out.println("Integers in the Vector:");
        for (int num : integerVector) {
            System.out.print(num + " ");
        }
        System.out.println();  // Print a new line

        // Calculate the sum of integers
        int sum = 0;
        for (int num : integerVector) {
            sum += num;
        }

        System.out.println("Sum of Integers: " + sum);
    }
}
