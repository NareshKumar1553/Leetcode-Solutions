class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        int count = 0;
        for(Map.Entry<Character, Integer> e:map.entrySet()){
            if(e.getValue()%2 != 0)
                count++;
        }
        return count <= k;
    }
}