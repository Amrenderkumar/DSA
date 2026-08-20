class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0; int j = 0;
        Map<Character, Integer> map = new HashMap();
        char[] n = s.toCharArray();
        int i = 0; 
        for(; i<n.length; i++){
                int idx = map.getOrDefault(n[i], -1);
                if(idx!= -1 && idx>= j){
                    res = Math.max(res, i - 1 - j + 1);
                    j = idx + 1;
                }
           map.put(n[i], i);
        }
        return Math.max(res, i - 1 - j + 1);
    }
}