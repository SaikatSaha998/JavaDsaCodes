public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int ans = search(arr,4);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = true;
            if(target == nums[mid]) {
                return mid;
            }
            else if(isAsc) {
                if(target > nums[mid]) {
                    start = mid + 1;
                }
                else  {
                    end = mid - 1;
                }
            } else {
                if(target > nums[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
    return start;
    }
}

