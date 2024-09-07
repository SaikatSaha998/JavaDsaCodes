public class findSingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4};
        int ans = search(nums);
        System.out.println(ans);
    }
    static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums.length == 1) {
                return nums[0];
            }
            if(nums[nums.length - 1] != nums[nums.length - 2]) {
                return nums[nums.length - 1];
            }
            if(nums[0] != nums[1]) {
                return nums[0];
            }
            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            if((mid > start && (mid % 2 == 0 && nums[mid] != nums[mid - 1])) || 
            (mid < end && (mid % 2 == 1 && nums[mid] != nums[mid + 1]))) {
                start = mid + 1;
               }
            else {
                end = mid - 1; 
            }
        }
    return nums[0];
    }
}
