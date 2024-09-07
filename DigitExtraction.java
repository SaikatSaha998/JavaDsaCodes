public class DigitExtraction {
    public static void main(String[] args) {
        String str = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.print(orderChecking(str));
    }

    static String digits(String str) {
        str = str.replaceAll("[^0-9]", " ");
        str = str.replaceAll(" +", " ");
        if (str.equals(""))
            return "false";
 
        return str;
    }

    static boolean orderChecking(String str) {
        str = digits(str);
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < str.length(); i++) {
            char currentDigit = str.charAt(i);
            char previousDigit = str.charAt(i - 1);

            if (currentDigit < previousDigit) {
                increasing = false;
            } else if (currentDigit > previousDigit) {
                decreasing = false;
            }
            if (!increasing && !decreasing) {
                return false;
            }
        }

        if (increasing) {
            return true;
        }
    return false;
    }
}
