public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 239, 1, 567, 13450, 270 };
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int digits(int num) {
        if( num < 0) {
            num = num * -1;
        }
        if(num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // static int digits(int num) {
    //     if(num < 0) {
    //         num = num * -1;
    //     }
    //     if(num == 0) {
    //         return 1;
    //      }
    //     int   count = 0;
    //     while(num > 0) {
    //         count++;
    //         num = num / 10;
    //     }
    //     return count;
    // }

    static boolean even(int num) {
        int count = digits(num);
        return count % 2 == 0;
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for(int num : arr) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
}
