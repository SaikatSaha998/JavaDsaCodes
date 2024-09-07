public class fibonacci {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
