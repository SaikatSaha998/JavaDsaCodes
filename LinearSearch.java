import java.util.*;

@SuppressWarnings("unused")
public class LinearSearch {

    static int search1(String name, char character) {
        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == character) {
                return i;
            }
        }
        return -1;
    }
    
    static int search2(int [] arr, int searchElement) {
        if(arr.length == 0) {
            return -1;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement) {
               // System.out.println("Element is present at index : " + i);
                return i;
            }
        }
        return -1;
    }

    static char search3(String name, int  pos) {
        if(pos < 0 || pos > name.length()) {
            System.out.println("Wrong index");
        }

        return name.toCharArray()[pos];
    }

    static int search4(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int peakElementMountainArray(int[] arr) {
        int max = 0;
        if(arr.length == 1) {
            return 0;
        }
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static int search5(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] search6(int[][] arr, int search_ele) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == search_ele) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int search7(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static int search8(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array : ");
        // int size = sc.nextInt();
        // int arr [] = new int [size];

        // System.out.println("Enter array elements: ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the elements you want to search : ");
        // int search_el = sc.nextInt();
        // int res = search2(arr, search_el);
        // String name = "Saikat";
        // char c = 'k';
        // int res = search1(name, c);
        // if(res == -1) {
        //     System.out.println("Element is not present");
        // }
        // else {
        //     System.out.println("Element is present at index: " + res);
        // }
        // char res = search3("Saikat", 0);
        // System.out.println(res);
        // int[] arr = {7,8,1,5,96,3,78};
        // int ans = search6(arr);
        // System.out.println(ans);
        int[][] arr = {
            {1, 4, 5, 7},
            {56, 8, 0, 45},
            {2, 4, 78, 12}
        };
        System.out.println(search8(arr));
        // int target = 100;
        // int ans[] = search6(arr, target);
        // System.out.println(Arrays.toString(ans));


    }

}

// Best Case: O(1)
// Worst case: O(N)