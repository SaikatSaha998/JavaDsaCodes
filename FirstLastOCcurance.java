public class FirstLastOCcurance {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 7, 7, 8, 8};
        int res[] = searchRange(nums, 7);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
    return ans;
    }

    static int search(int[] nums, int target, boolean isFirstOccurance) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(target > nums[mid]) {
                start = mid + 1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                ans = mid;
                if(isFirstOccurance) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
    return ans;
    }
}
