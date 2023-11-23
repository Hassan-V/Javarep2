//Shafin ALam - 252 - F - BSE
package Shafin_Lab2;
public class SwapArrays {
    public static void main(String[] args) {
        // Initialize two arrays of size 4
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        System.out.println("Original Arrays:");
        System.out.println("Array1: " + java.util.Arrays.toString(array1));
        System.out.println("Array2: " + java.util.Arrays.toString(array2));

        // Swap the elements of the arrays
        for (int i = 0; i < 4; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        System.out.println("Arrays after swapping:");
        System.out.println("Array1: " + java.util.Arrays.toString(array1));
        System.out.println("Array2: " + java.util.Arrays.toString(array2));
    }
}
