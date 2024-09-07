public class PrintNumber {
    public static void main(String[] args) {
        print(1);
        print2(5);
    }
    static void print(int n) {
        if(n > 5) {
            return ;
        }
        System.out.println(n);
        print(n+1);
    }
    static void print2(int n) {
        if(n < 1) {
            return;
        }
        System.out.println(n);
        print2(n-1);
    }
}
