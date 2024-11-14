class Solution
{
    public int solution(String s)
    {
        StringBuilder stack = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(stack.length() > 0 && stack.charAt(stack.length()-1)==c)
                stack.deleteCharAt(stack.length()-1);
            else
                stack.append(c);
        }
        
        if(stack.length()==0)
            return 1;
        else
            return 0;
    }
}