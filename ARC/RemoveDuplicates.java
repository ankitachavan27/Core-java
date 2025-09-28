import java.util.Scanner;

public class RemoveDuplicates {
    public static int  removeDuplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int arr1 = removeDuplicate(arr);
        System.out.println("array is sorted:"+arr1);
      
        sc.close();
    }
}
