class Solution {
    public int maxProduct(int[] n) {
        int m=0;
        PriorityQueue<Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:n)p.add(i);
        int k=p.poll();

        while(!p.isEmpty())
        {
            int q=p.poll();
            m=Math.max(m,((k-1)*(q-1)));
            k=q;
        }
        return m;
    }
}