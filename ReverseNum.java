public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(2345));
    }
    static int reverse(int num) {
        int digits = (int)(Math.log10(num)) + 1;
        return helper(num, digits);
    }

    static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n / 10, digits-1);
    }


}
