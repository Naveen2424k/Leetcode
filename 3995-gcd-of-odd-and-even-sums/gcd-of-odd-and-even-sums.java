class Solution {
    private static int g(int a,int b )
    {
        if(b==0)return a;
        else
        return g(b,Math.abs(a-b));
    }
    public int gcdOfOddEvenSums(int n) {
        int o=1,e=2,s=0,ss=0;
        s+=o;
        ss+=e;
        for(int i=1;i<n;i++)
        {
                o+=2;
                s+=o;
                e+=2;
                ss+=e;
        }
        // System.out.print(o+" ");
        return g(s,ss);

    }
}