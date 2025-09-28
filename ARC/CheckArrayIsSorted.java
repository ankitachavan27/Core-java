import java.util.Scanner;

public class CheckArrayIsSorted {
    public static boolean IsSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        boolean IsSort = IsSorted(arr);
        System.out.println("array is sorted:"+IsSort);
      
        sc.close();
    }
    
}
