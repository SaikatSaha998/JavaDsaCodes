public class MountainArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 6, 5, 1, 0};
        int ans = mountainArray(array);
        System.out.println(ans);
    }
    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                //In this case when arr[mid] > arr[mid+1] that means we are in the decreasing part,so arr[mid] might be the possible answer or the answer is lying on the left of arr[mid]
                end = mid;
            }
            else {
                //This case we are in the increasing part but this time we do start = mid + 1 because we know that arr[mid+1] is already greater than arr[mid], so no need to include the arr[mid] because we are searching for peak element.
                start = mid + 1;
            }
        }
    return arr[start];//can return any one start or end because at the end start and end are going to point the same element.
    }
}
