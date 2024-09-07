public class BitwiseOperators {
    public static void main(String[] args) {
        EvenOrOdd(6);
        int[] nums = {-2, 4, -6, -2, 4};

        System.out.println(uniqueNum(nums));
       
    }
    static void EvenOrOdd(int num) {
        if((num & 1) == 1) {
            System.out.println("Odd");
        }
        else {
            System.out.println("even");
        }
    }
    static int uniqueNum(int[] arr) {
        int ans = 0;
        for(int i : arr) {
            ans ^= i;
        }
        return ans; 
    }
}
