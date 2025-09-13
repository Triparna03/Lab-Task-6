import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the size of the array
        int n = scan.nextInt();

        // Create an array to hold n integers
        int[] arr = new int[n];

        // Read each integer and store it in the array
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        // Print each element of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
