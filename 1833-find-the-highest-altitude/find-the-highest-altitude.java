class Solution {
    public int largestAltitude(int[] g) {
        int c=0;
        int m=0;
        for(int i=0;i<g.length;i++)
        {
            c+=g[i];
            m=Math.max(m,c);
        }
        return m;
    }
}