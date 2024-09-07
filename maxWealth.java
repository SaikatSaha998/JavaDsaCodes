//Leetcode
public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            { 2, 3, 10 }, { 3, 5, 6 }, { 1, 3, 4 }
        };

        System.out.println(solution(accounts));
    }

    static int solution(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
