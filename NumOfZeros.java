public class NumOfZeros {
    public static void main(String[] args) {
        System.out.println(zeros(10230900));
    }
    static int zeros(int num) {
        return helper(num, 0);
    }
    static int helper(int num, int count) {
        if(num == 0) {
            return count;
        }
        int rem = num % 10;
        if(rem == 0) {
            return helper(num/10, count+1);
        }
        return helper(num/10, count);
    }
}
