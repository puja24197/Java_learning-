import java.util.Scanner;

public class ArrayMix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
      
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}
