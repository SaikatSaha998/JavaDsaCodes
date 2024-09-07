import java.util.ArrayList;
import java.util.List;

public class SubSet {
   public static void main(String[] args) {
     int[] arr = {1, 2, 3, 4};
     System.out.println(subset(arr));
   }
   static List<List<Integer>> subset(int[] arr) {
    List<List<Integer>> outer = new ArrayList<>();
    // first adding an empty list in the outer list.
    outer.add(new ArrayList<>());
    // itterating over original number array 
    for(int num : arr) { 
        // size of the outer list
        int n = outer.size(); 
        for(int i = 0; i < n; i++) {
            // creating an inner list that will contain the previous inner list copies for corresponding index.
            List<Integer> inner = new ArrayList<>(outer.get(i));
            // then we'll add original array numbers into the copy of inner lists.
            inner.add(num);
            // adding the inner list into the outer list
            outer.add(inner);
        }
    }
    return outer;
    }
}


