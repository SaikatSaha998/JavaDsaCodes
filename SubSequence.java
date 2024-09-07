import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        //subseq("", "abcd");
        System.out.println(subseqReturn("", "abc"));
    }
    static void subseq(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subseq(ch + processed, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    } 

    static ArrayList<String> subseqReturn(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subseqReturn(ch + processed, unprocessed.substring(1));
        ArrayList<String> right = subseqReturn(processed, unprocessed.substring(1));
        
        left.addAll(right);
        return left;
    } 
}
