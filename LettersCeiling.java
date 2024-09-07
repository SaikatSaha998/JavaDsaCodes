public class LettersCeiling {
    public static void main(String[] args) {
        char[] arr = {'c', 'h', 'j'};
        char ans = lettersCeiling(arr, 'c');
        System.out.println(ans);
    }

    static char lettersCeiling(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > letters[mid]) {
                start = mid + 1;
            }
            else if(target < letters[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
    return letters[start % letters.length];
    }
}
