import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 0, 55, 3};
        // arr = mergeSort(arr);
        // System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        
        while(s <= e) {
            while(arr[s] < pivot) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
