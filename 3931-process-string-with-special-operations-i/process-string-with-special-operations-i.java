class Solution {
    public String processStr(String s) {
        StringBuilder b=new StringBuilder();
        for(char i:s.toCharArray())
        {
            if(Character.isLowerCase(i))
            {
                b.append(i);
            }
            else if(i=='*')
            {
                if(b.length()>0)
                b.deleteCharAt(b.length()-1);
            }
            else if(i=='#')
            {
                b.append(b);
            }
            else
            {
                b.reverse();
            }
        }
        return b.toString();
    }
}