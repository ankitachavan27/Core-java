

public class Twosumunsorted {

   
    public static void main(String[] args) {
        int arr[] ={9,7,3,2,1,14};
        int target =10;
        int left = 0;
        int right = 1;
       
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum!=target){
                right++;
                if(right == arr.length){
                    left++;
                    right= left+1;

                }

            }
            else{
                    

                System.out.println(arr[left]+" "+arr[right]);
        
                break;
                
            }
       
        }
    }    
}
