class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=1; i <= n/2; i++){
            int t = n;
            int j = i;
            while(true){
                t -= j;
                j++;
                if(t == 0){
                    answer++;
                    break;
                }
                if(t < 0)
                    break;
            }
        }
        
        return answer;
    }
}