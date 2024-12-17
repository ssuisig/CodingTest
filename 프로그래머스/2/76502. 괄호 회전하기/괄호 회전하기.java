import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i < s.length(); i++){
            for(int j=0; j < s.length(); j++){
                try{
                    if(s.charAt((j+i)%s.length()) == '(')
                        st.push('(');
                    if(s.charAt((j+i)%s.length()) == ')' && st.peek() == '(')
                        st.pop();
                    if(s.charAt((j+i)%s.length()) == '{')
                        st.push('{');
                    if(s.charAt((j+i)%s.length()) == '}'&& st.peek() == '{')
                        st.pop();
                    if(s.charAt((j+i)%s.length()) == '[')
                        st.push('[');
                    if(s.charAt((j+i)%s.length()) == ']'&& st.peek() == '[')
                        st.pop();
                }
                catch (Exception e){
                    st.push(' ');
                    break;
                }
                
            }
            if(st.isEmpty())
                answer++;
            st.clear();
        }
        
        return answer;
    }
}