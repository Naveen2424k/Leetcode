class Solution {
    public int removeCoveredIntervals(int[][] n) {
        int c=0,m=0;
        Arrays.sort(n,(a,b)->{
            if (a[0]==b[0])return b[1]-a[1];
            return a[0]-b[0];
        });
        for(int i[]:n)
        {
            if(i[1]>m){
                m=i[1];
                c++;
            }
        }
        return c;
    }
}