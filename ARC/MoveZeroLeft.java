import java.util.Scanner;

public class MoveZeroLeft {
    public static void moveZeroes(int arr[]) {
        int nonZeroIndex = 0;

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the rest with zeroes
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);

        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
