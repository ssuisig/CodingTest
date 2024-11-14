class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (i == 0 && Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            if (i != 0 && s.charAt(i - 1) == ' ') {
                c = Character.toUpperCase(c);
            }
            
            answer += c; // append 대신 문자열 덧붙이기
        }
        
        return answer;
    }
}
