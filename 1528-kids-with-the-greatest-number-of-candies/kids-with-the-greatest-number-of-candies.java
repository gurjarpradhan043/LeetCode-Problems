class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maximumCandies = 0;
        ArrayList<Boolean> result = new ArrayList<>();

        //maximuxCandies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= maximumCandies) {
                maximumCandies = candies[i];
                }
            }

            //compare with maximumCandies
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies >= maximumCandies ) {
                    result.add(true);
                }
                else {
                    result.add(false);
                }
            }

            return result;

        } 
    }
