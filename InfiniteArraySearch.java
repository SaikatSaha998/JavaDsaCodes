//Question: Find the target element from an infinite array without using [array.length] method.
//Source: GFG
public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,10,13,17,19,21,24,29,55,90,101,200};
        int target = 17;
        int res = ans(arr,target);
        System.out.println(res);
    }
    static int ans(int[] array, int target) {
        int start = 0;
        int end = 1;
        
        //First the search space is two and then just doubling the search space and apply binary search
        while(target > array[end]) {
            int newStart = end + 1; // newStart basically acts as a temp variable.
            end = end + (end - start + 1) *2; // we are using the old start value not the newStart to calculate the new Search space.
            start = newStart;
        }
        int ans = binarySearch(array, target, start, end); //traditional binary search apply.

    return ans;
    }
    static int binarySearch(int[] array, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(array[mid] < target) {
                start = mid + 1;
            }
            else if(array[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
    return -1;
    }
}
