class Solution {
    public String fun(int len, String s){
        if(len == 0)
            return s;
        else{
            return fun(len/2, String.valueOf(len%2)+ s);
        }
    }
    public int[] solution(String s) {
        int[] answer = new int[2];
        int len;
        String b;
    
        while(!s.equals("1")){
            len = s.length();
            s = s.replace("0", "");
        
            answer[1] += len - s.length();
                 
            len = s.length();
            b ="";   
            s = fun(len, b);
            answer[0]++;
        }
        
        return answer;
    }
}