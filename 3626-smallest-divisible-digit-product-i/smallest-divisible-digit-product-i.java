class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=0;i<10;i++)
        {
                
            int k=n+i;
            int p=1;
            while(k!=0)
            {
                p*=(k%10);

                k/=10;
            }

            if(p%t==0)return n+i;
        }
        return 0;
    }
}