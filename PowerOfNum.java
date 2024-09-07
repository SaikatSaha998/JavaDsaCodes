public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
    static int power(int base, int pow) {
        int ans = 1;
        while(pow > 0) {
            if((pow & 1) == 1) {
                ans *= base;
            }
            base *= base;
            pow = pow >> 1;
        }
        return ans;
    }
}
