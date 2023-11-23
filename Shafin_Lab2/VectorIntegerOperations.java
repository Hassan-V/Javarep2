package Shafin_Lab2;
import java.util.Vector;
import java.util.Collections;
public class VectorIntegerOperations {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();

        // Add integer objects to the vector
        integerVector.add(25);
        integerVector.add(10);
        integerVector.add(47);
        integerVector.add(3);
        integerVector.add(65);
        integerVector.add(2);

        // a) Sort the vector
        Collections.sort(integerVector);

        // b) Display the largest number (the last element after sorting)
        int largest = integerVector.lastElement();

        // c) Display the smallest number (the first element after sorting)
        int smallest = integerVector.firstElement();

        System.out.println("Sorted Vector: " + integerVector);
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }
}
