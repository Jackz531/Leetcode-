class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans= new StringBuilder(strs[0]);
        if (strs == null || strs.length == 0) return "";
        for(String s:strs)
        {
            if (s=="")
            return s;
            while (ans.length()>s.length())
            ans.deleteCharAt(ans.length()-1);
            while (!ans.toString().equals(s.substring(0, ans.length()))) {
                // Python: ans = ans[:-1]
                ans.deleteCharAt(ans.length() - 1);
            }
            
            // Optimization: If ans becomes empty, stop early
            if (ans.length() == 0) return "";
        }
        return ans.toString();
    }
}