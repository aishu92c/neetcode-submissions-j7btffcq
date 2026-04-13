class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // each key is the sorted version of a string, and the value is a list of strings belonging to that anagram group.
        Map<String,List<String>> values = new HashMap<>();

        for(int i=0; i< strs.length ;i++) {

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            values.putIfAbsent(sortedString,new ArrayList<>());
            values.get(sortedString).add(strs[i]);
        }

        return new ArrayList<>(values.values());        
    }
}
