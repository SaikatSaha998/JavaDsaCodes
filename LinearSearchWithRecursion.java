import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {3,6,81,2,90,90,5};
        //System.out.println(search(arr, 7, 0));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(searchAll(arr, 90, 0, list));
    }
    static int search(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return search(arr, target, index+1);
    }
    static int revsearch(int[] arr, int target, int index) {
        if(index == -1) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return revsearch(arr, target, index-1);
    }
    static ArrayList<Integer> searchAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return searchAll(arr, target, index+1, list);
    }
}
