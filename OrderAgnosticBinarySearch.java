public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
       // int[] arr = {78, 56, 45, 33, 29, 20, 12, 9, 6, 0};
        int[] arr = {2, 5, 8, 9, 12, 45, 67, 90};
        int ans = orderAgnosticbs(arr, 90);
        System.out.println(ans);
    }
    static int orderAgnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            else if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                }
                else  {
                    end = mid - 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            
        }
    return -1;
        
    }   
}

// Best case: O(1)
// Worst case: O(logN)
