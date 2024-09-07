public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        int start = 0; 
        int end = nums.length - 1;
          
        while (start < end) {
            int mid = start + (end - start) / 2;
              
            // If middle element is greater than the rightmost element, the pivot is in the right half
            if (nums[mid] > nums[end]) {
                // If target lies within the left sorted portion
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid; // Narrow down to left half
                } else {
                    start = mid + 1; // Search in the right half
                }
            }
              
            // If middle element is less than the rightmost element, the left half is sorted properly
            else if (nums[mid] < nums[end]) {
                // If target lies within the right sorted portion
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // Narrow down to right half
                } else {
                    end = mid; // Search in the left half
                }
            }
              
            // If middle element equals the rightmost element, we can't determine the pivot
            // so we reduce the search space by moving the right pointer one step to the left
            else {
                end--;
            }
        }
          
    // After the loop ends, left == right,
    // checking if we have found the target
    return nums[start] == target;
    }
}
