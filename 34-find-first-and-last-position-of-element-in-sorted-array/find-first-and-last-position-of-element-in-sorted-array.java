class Solution {
    private int f(int n[],int t)
    {   
        int a=-1;
        int l=0,r=n.length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(n[m]==t)
            {
                a=m;
                r=m-1;
            }
            else if(n[m]<t)
            {
                l=m+1;
            }
            else{
                r=m-1;
            }
            
            
        }
        return a;
    }
     private int l(int n[],int t)
    {   
        int a=-1;
        int l=0,r=n.length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(n[m]==t)
            {
                a=m;
                l=m+1;
            }
            else if(n[m]<t)
            {
                l=m+1;
            }
            else{
                r=m-1;
            }
            
            
        }
        return a;
    }
    public int[] searchRange(int[] n, int t) {

        return new int[] {f(n ,t),l(n,t)};
    }
}