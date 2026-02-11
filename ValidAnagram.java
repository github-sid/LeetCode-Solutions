class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        int[] count = new int[26];

        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int num:count){
            if(num != 0)
            {
                return false;
            }
        
        
        } 
        //  char[] ss = s.toCharArray();

        // Arrays.sort(ss);

        // char[] tt = t.toCharArray();

        // Arrays.sort(tt);
        // for(int i =0; i<ss.length;i++)
        // {
        //     if(ss[i] != tt[i])
        //     {
        //         return false;
        //     }
        // }
        
        return true;             
    }
}
