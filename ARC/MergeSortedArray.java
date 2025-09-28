public class MergeSortedArray {
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int p1 = m - 1;            // pointer to last valid element in arr1
        int p2 = n - 1;            // pointer to last element in arr2
        int p = m + n - 1;         // pointer to the end of arr1 (combined size)

        // Merge from end to start
        while (p1 >= 0 && p2 >= 0) {
            if (arr1[p1] > arr2[p2]) {
                arr1[p] = arr1[p1];//234
                //125
                p1--;
            } else {
                arr1[p] = arr2[p2];
                p2--;
            }
            p--;
        }

        // Copy any remaining elements from arr2
        while (p2 >= 0) {
            arr1[p] = arr2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[6];  // Allocate enough space for merged array
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        int[] arr2 = {2, 5, 6};
        merge(arr1, 3, arr2, 3);

        // Print merged array
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
