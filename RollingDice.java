import java.util.ArrayList;

public class RollingDice {
    public static void main(String[] args) {
        // System.out.println(Dice("", 4));
        // System.out.println(DiceFace("", 8, 8 ));
        System.out.println(DiceCount("", 4, 6));
    }
    static ArrayList<String> Dice(String p, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(Dice(p+i, target-i));
        }
        return list;
    }

    static ArrayList<String> DiceFace(String p, int target, int face) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= face && i <= target; i++) {
            list.addAll(Dice(p+i, target-i));
        }
        return list;
    }

    static int DiceCount(String p, int target, int face) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list.size();
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= face && i <= target; i++) {
            list.addAll(Dice(p+i, target-i));
        }
        return list.size();
    }
}
