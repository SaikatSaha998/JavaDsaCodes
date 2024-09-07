public class CheckPallindrome {
    public static void main(String[]  args) {
        System.out.println(check(12321));
    }

    static boolean check(int n) {
        if(n == rev(n)) {
            return true;
        }
        return false;
    }

    
    static int rev(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }    
    static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
