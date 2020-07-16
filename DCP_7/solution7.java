class Solution {
    public int solve(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        char[] ch = s.toCharArray();
        int[] dp = new int[ch.length];
        dp[0] = 1;
        for (int i = 1; i < ch.length; i++) {
            int x = ch[i-1] - '0';
            int y = ch[i] - '0';
            if (1 <= y && y <= 9) {
                dp[i] = dp[i-1];
            }
            int xy = x * 10 + y;
            if (10 <= xy && xy <= 26) {
                dp[i] = i == 1 ? (dp[i] + 1) : (dp[i] + dp[i-2]);
            }
        }
        return dp[dp.length-1];
    }
}
