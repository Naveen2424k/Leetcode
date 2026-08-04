class Solution {
    public List<Integer> findMissingElements(int[] n) {
        int m=1000,max=-1;
        for(int i:n)
        {
            m=Math.min(m,i);
            max=Math.max(max,i);
        }
        Arrays.sort(n);
        List<Integer> l=new ArrayList<>();
       int j=0;
       for(int i=m;i<=max;i++)
       {
            if(i!=n[j])
            {
                l.add(i);

            }
            else
            j++;
       }
        return l;
    }
}