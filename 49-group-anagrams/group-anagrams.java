class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();
        for(String s:strs)
        {
            int[] count= new int[26];
            for(int i=0;i<s.length();i++)
            {
                count[s.charAt(i)-'a']++;
            }
            String key= Arrays.toString(count);
            if( map.containsKey(key))
                map.get(key).add(s);
            else
            { 
                List<String> tempList = new ArrayList<>();
                        tempList.add(s);
                        map.put(key,tempList);
            }
        }
    
        return new ArrayList<>(map.values());
    }
}