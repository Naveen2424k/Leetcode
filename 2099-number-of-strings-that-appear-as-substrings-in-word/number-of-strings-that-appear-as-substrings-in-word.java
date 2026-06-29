class Solution {
    public int numOfStrings(String[] p, String w) {
        int c=0;
        for(String i:p)
        {
            if(w.indexOf(i)!=-1)
            {
                c++;
            }
        }
        return c;
    }
}