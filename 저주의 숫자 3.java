class Solution {
    public int solution(int n) {
        int answer = n;
        int pass = 0;
        
        for(int i = 1; i <= n; i++){
            String nStr = String.valueOf(i);
            if(i % 3 == 0 || nStr.contains("3")){
                pass++;
                n++;
            }
        }
        return answer + pass;
    }
}