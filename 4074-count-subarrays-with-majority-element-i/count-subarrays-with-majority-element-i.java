class Solution {
    public int countMajoritySubarrays(int[] n, int t) {
        
        int c=0;
        for(int i=0;i<n.length;i++)
        {   int q=0;
            
             
            for(int j=i;j<n.length;j++)
            {
                if(n[j]==t)
                    q++;
                int l=(j-i+1);
                if(q>(l/2))c++;
                
            }
            
        }
        return c;
    }
}