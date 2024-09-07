import java.util.Arrays;

public class SquareOfElements {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 10};
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        System.out.println(Arrays.toString(nums));
    }
}
