class Solution {
    public long maxTotalValue(int[] n, int k) {
        long a=Long.MIN_VALUE;
        long b=Long.MAX_VALUE;
        int i=0,j=n.length-1;
        while(i<=j)
        {
            a=Math.max(a,(Math.max(n[i],n[j])));
            b=Math.min(b,(Math.min(n[i],n[j])));
            i++;j--;
        }
        System.out.print(a);
        return (a-b)*k;
    }
}