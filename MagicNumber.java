import java.util.*;

// Question : Find the nth magic number.

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(magicNum(num));
    }
    static int magicNum(int n) {
        int ans = 0;
        int base = 5;
        while(n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
