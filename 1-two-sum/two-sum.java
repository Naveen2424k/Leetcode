class Solution {
    public int[] twoSum(int[] n, int t) {
        int l = n.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            int c=t-n[i];
            if(m.containsKey(c))
            {
                return new int[]{m.get(c),i};
            }
            m.put(n[i],i);
        }
    
     return new int[]{};  
    }
}
