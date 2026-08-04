class Solution {
    static int a[];
    
    public boolean canVisitAllRooms(List<List<Integer>> r) {
        a=new int [r.size()];
      Queue<Integer> q=new LinkedList<>();
       q.offer(0);

        a[0]=1;
        while(!q.isEmpty())
        {
            int p=q.poll();
            
            
             for(int  i:r.get(p))
                {
                    if(a[i]==0)
                    {
                        a[i]=1;
                        q.add(i);
                    }
                    
                    
                }
        }
               
               
        // }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
             if(a[i]==0)return false;
        }
        return true;
    }
}