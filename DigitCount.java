public class DigitCount {
    public static void main(String[] args) {
        //int num = 0;
        //System.out.println(counter(num));
        System.out.println(counter2(12, 2));
    }
    static int counter(int n) {
        int count = 0;
        while(n > 0) {
            n = n >> 1;
            count++;
        }
        return count;
    }
    static int counter2(int num, int base) {
        return (int)(Math.log(num) / Math.log(base)) + 1;
    }
}
