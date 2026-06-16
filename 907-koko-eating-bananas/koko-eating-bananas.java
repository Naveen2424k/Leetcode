class Solution {
    public int minEatingSpeed(int[] p, int h) {

        int l=1,r=Integer.MAX_VALUE,m=10000;
        while(l<=r)
        {
            int k=l+(r-l)/2,t=0;
            for(int i=0;i<p.length;i++)
            {
                t=t+(p[i]/k);

                if(p[i]%k!=0)t++;
            }
            // System.out.println(t);
            if(t<=h)
            {
                r=k-1;
            }
            else{
                l=k+1;
            }
            
        }
        // System.out.print(l);
        return l;
    }
}    