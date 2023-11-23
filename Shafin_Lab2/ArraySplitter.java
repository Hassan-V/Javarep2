//Shafin ALam - 252 - F - BSE
package Shafin_Lab2;
import java.util.Arrays;
public class ArraySplitter {
    public static void main(String[] args) {
        double[] numbers = {5.5, 2.0, 9.8, 4.1, 3.7, 8.6, 6.4};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        double key = 4.1;
        splitArray(numbers, key);

        System.out.println("Array after splitting:");
        System.out.println(Arrays.toString(numbers));
    }

    public static void splitArray(double[] arr, double key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int length1 = index + 1;
            int length2 = arr.length - length1;

            double[] part1 = Arrays.copyOfRange(arr, 0, length1);
            double[] part2 = Arrays.copyOfRange(arr, length1, arr.length);

            System.out.println("Key found at index " + index);
            System.out.println("First part: " + Arrays.toString(part1));
            System.out.println("Second part: " + Arrays.toString(part2));
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
