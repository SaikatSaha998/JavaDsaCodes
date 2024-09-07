public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 13, 15, 18, 23};
        int ans = floor(arr, 1);
        System.out.println(ans);
    }
    
    // Floor means greatest number of the numbers that are lowest or equal to the target element.
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
    return end;
    }
}
