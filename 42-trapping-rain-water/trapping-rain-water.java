class Solution {
    public int trap(int[] h) {
       int s[]=new int [h.length];
       int a[]=new int [h.length];
       s[0]=h[0];
       a[h.length-1]=h[h.length-1];
       for(int i=1;i<h.length;i++)
       {
            s[i]=Math.max(s[i-1],h[i]);
            // a[h.length-1-i]=Math.max(a[h.length-1-i+1],h[h.length-1-i]);
           
       }
       for(int i=h.length-2;i>=0;i--)
       {
            
            a[i]=Math.max(a[i+1],h[i]);
            //  System.out.print(a[i]);
       }
       int c=0;
       for(int i=0;i<h.length;i++)
       {
            int m=Math.min(s[i],a[i]);
            System.out.print(m);
            c+=(m-h[i]);
       }

    return c; 
    }
}