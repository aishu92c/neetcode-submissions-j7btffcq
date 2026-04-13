class Solution {
    public boolean isAnagram(String s, String t) {

        // base condition
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> trackingValues = new HashMap<>();

        for (int i =0; i< s.length() ; i++) {
            trackingValues.put(s.charAt(i),trackingValues.getOrDefault(s.charAt(i),0) +1);
        }
        for (int i =0; i< t.length() ; i++) {

            if(trackingValues.get(t.charAt(i)) != null && trackingValues.get(t.charAt(i)) > 0 ) {
                trackingValues.put(t.charAt(i),trackingValues.get(t.charAt(i))-1);

            } else {
                return false;
            }
            
        }
        return true;

    }
}