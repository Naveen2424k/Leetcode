class Solution {
    public int longestConsecutive(int[] n) {
        
         Set<Integer> s=new HashSet<>();
         int m=0;
         for(int i:n)s.add(i);

         for(int i:s)
         {
            if(!s.contains(i-1))
            {
                int c=1;
                int cu=i+1;
                while(s.contains(cu))
                {
                    c++;
                    cu++;
                }

                m=Math.max(m,c);
            }
         }
        return m;
    }
}