import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {3,4,71,0,6};
        selection(arr, arr.length, 0, 0);// here r is pass as arr.length because max element should be at the end position and that is arr.length-1 and that is r-1 according to our code.
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int r, int c, int max) {
        if(r == 0) {
            return;
        }
        if(r > c) {
            if(arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
}
