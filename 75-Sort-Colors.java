class Solution {
    public void sortColors(int[] nums) {
        bubbleSort(nums,nums.length);
        
    }
    static void bubbleSort(int[] arr, int n) {
        // Base case
        if (n == 1) {
            return;
        }

        // One pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively sort the remaining array
        bubbleSort(arr, n - 1);
    }
}