class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Binary search
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int result = r;
        while(l<=r) {
            int k = (l+r)/2;

            int totalHours = 0;

            for(int p : piles) {
            totalHours += Math.ceil((double) p/k);
            }

            if(totalHours > h) {
            l = k+1;
            } else {
            result = k;
            r = k-1;
            }

        }

        return result;
        //total count 
        // h <=size 
        // take max value
        
        //min value
        // h > size
        
        // total count - piles[i] >= h 
        //i++
        // total count - piles[i] <= h 
        // min value = math.min(minValue,piles[i]);
        
        
    }
}
