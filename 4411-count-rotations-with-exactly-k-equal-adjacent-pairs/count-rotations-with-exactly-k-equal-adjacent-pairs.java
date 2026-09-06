class Solution {
    public int countRotations(String s, int k) {
        int ans = 0; 
        for ( int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            int score = 0;
            for ( int j = 0; j <  rotated.length() - 1; j++) {
                if (rotated.charAt(j) == rotated.charAt(j+1)) {
                    score++;
                }
        }
            if (score == k) {
            ans++;
}
    }
        return ans;
    }
}