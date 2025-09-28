import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {
    public static ArrayList<Integer>twoSum(int[] arr,int target){
        int left =0;
        int right = arr.length-1;

        while(left<right){
            int current_sum = arr[left]+arr[right];
            if(current_sum == target){
                ArrayList<Integer>result = new ArrayList<>();
                result.add(left+1);
                result.add(right+1);
                return result;
            }
            else if(current_sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        ArrayList<Integer>result = new ArrayList<>();
        result.add(-1);
        result.add(-1);
        return result;
    }
 
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];

        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int target = 9;
        ArrayList<Integer>result = twoSum(arr,target);
        for(int num:result){
            System.out.println(num +" ");
        }
       System.err.println(); 
        sc.close();
    }
    
}
 