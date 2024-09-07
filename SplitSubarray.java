public class SplitSubarray {
    public static void main(String[] args) {

    }
    static int splitSearchSum(int nums[], int m) {
        int start = 0;
        int end = 0;

        // finding the range for my answer.
        for(int i = 0; i <= nums.length - 1; i++) {

            // min value will be the max element from the array.
            start = Math.max(start,nums[i]);
            // max value will be sum of all elements from the array.
            end += nums[i];
        }
        while(start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if(pieces <= m) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
    return start; // start and end will point to the same answer.
    }
}
