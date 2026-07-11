class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestCustomer = 0;
        int customerWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            customerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {

                customerWealth += accounts[i][j];

                if (customerWealth > richestCustomer) {
                    richestCustomer = customerWealth ;

                }
            }
        }

        return richestCustomer;
    }
}