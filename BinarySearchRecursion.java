import java.util.*;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 100, 300, 500, 789};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index you want to search: ");
        int index = sc.nextInt();
        int ans = search(arr, index, 0, arr.length - 1);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if(start > end) {
            return -1;
        }
        if(mid == target) {
            return arr[mid];
        }
        if(target > mid) {
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
}
