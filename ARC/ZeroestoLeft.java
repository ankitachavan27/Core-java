import java.util.Scanner;
import java.util.Arrays;

public class ZeroestoLeft {
    public  static int[] moveZeroes(int arr[]){
        int  nonZeroIndex =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for(int i = nonZeroIndex;i<arr.length;i++){
            arr[i]=0;

        }
        return arr;

    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int arr1[] = moveZeroes(arr);
        System.out.println("array is sorted:"+(Arrays.toString(arr1)));
      
        sc.close();
    }
}
