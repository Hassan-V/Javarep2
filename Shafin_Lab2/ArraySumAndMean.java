package Shafin_Lab2;
//Shafin ALam - 252 - F - BSE
public class ArraySumAndMean {
    public static void main(String[] args) {
        double[] numbers = {5.5, 2.0, 9.8, 4.1, 3.7, 8.6, 6.4};
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.length;
        System.out.println("Array of Real Numbers:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of elements: " + sum);
        System.out.println("Mean of elements: " + mean);

    }
}
