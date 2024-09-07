// Question Skipping a particular character.
public class SkipChar {
    public static void main(String[] args) {
        String str = "aaabcgdhfkuhajdha";
        System.out.println(skip(str));
    }
    static String skip(String str) {
        if(str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);

        if(ch == 'a') {
            return skip(str.substring(1));
        }
        return ch + skip(str.substring(1));
    }
}
