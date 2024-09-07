import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        //System.out.println(str.substring(0, 1));
        System.out.println(permutation("", str));
    }
    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutation(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutation(f + ch + s, up.substring(1)));
        }
        return list;
    }

    // static ArrayList<ArrayList<Integer>> permutationArray(int[] p, int[] up) {
    //     List<List<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());
    
    //     ArrayList<String> list = new ArrayList<>();
    //     int first = up[0];
    //     for(int i = 0; i <= p.length; i++) {
    //         int[] f = Arrays.copyOfRange(p, 0, i);
    //         int[] s = Arrays.copyOfRange(p, i, p.length);
    //         list.addAll(permutation(f + s, up.substring(1)));
    //     }
    //     return list;
    // }
}
