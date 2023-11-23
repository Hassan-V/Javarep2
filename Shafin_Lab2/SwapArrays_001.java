////Shafin ALam - 252 - F - BSE
//package Shafin_Lab2;
//import java.util.Arrays;
//public class SwapArrays_001 {
//    private int[] array1;
//    private int[] array2;
//
//    public SwapArrays_001() {
//        // Initialize two arrays of size 4
//        array1 = new int[]{1, 2, 3, 4};
//        array2 = new int[]{5, 6, 7, 8};
//    }
//
//    public void mergeArrays(int[] newArray) {
//        if (newArray.length != 4) {
//            System.out.println("Error: The new array must have a size of 4.");
//            return;
//        }
//
//        // Merge the new array with array1
//        for (int i = 0; i < 4; i++) {
//            array1[i] += newArray[i];
//        }
//    }
//
//    public void printArrays() {
//        System.out.println("Array1: " + Arrays.toString(array1));
//        System.out.println("Array2: " + Arrays.toString(array2));
//    }
//
//    public static void main(String[] args) {
//        SwapArrays swapArrays = new SwapArrays();
//
//        System.out.println("Original Arrays:");
//        swapArrays.printArrays();
//
//        int[] newArray = {10, 20, 30, 40};
//        swapArrays.mergeArrays(newArray);
//
//        System.out.println("Arrays after merging:");
//        swapArrays.printArrays();
//    }
//}
