public class SearchInMountain {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 6, 5, 0};
        int peak = peakElement(array);
        int target = 5;
        int firstTry = orderAgnosticBinarySearch(array, target, 0, peak);
        int secondTry = orderAgnosticBinarySearch(array, target, peak + 1, array.length - 1);
        if(firstTry != -1) {
            System.out.println(firstTry);
        }
        else {
            System.out.println(secondTry);
        }

    }
    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) /  2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else { 
                start = mid + 1;
            }
        }
    return start;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = true;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            else if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
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
