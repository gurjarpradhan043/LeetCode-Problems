class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;

        long[] ugly = new long[n];
        int[] idx = new int[k];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;

           
            for (int j = 0; j < k; j++) {
                next = Math.min(next, ugly[idx[j]] * primes[j]);
            }

            ugly[i] = next;

            
            for (int j = 0; j < k; j++) {
                while (ugly[idx[j]] * primes[j] <= ugly[i]) {
                    idx[j]++;
                }
            }
        }

        return (int) ugly[n - 1];
    }
}