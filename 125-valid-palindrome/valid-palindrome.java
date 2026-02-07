class Solution {
    public boolean isPalindrome(String s) {
        
        String clean=s.toLowerCase().replaceAll("[^a-z0-9]","");
        // System.out.println(clean);
        int n=clean.length();
        for (int i=0;i<n;i++)
        {
            if(clean.charAt(i)!=clean.charAt(n-1-i))
            return false;

        }
        return true;
    }
}