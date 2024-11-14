class Solution {
    static int[] memo;
    public int solution(int n) {
        memo = new int[n+1];
            
        if(n <= 1)
            return n;
        
        memo[0] = 0; 
        memo[1] = 1;
        
        for(int i =2; i < n+1; i++)
            memo[i] = (memo[i-1] + memo[i-2])% 1234567;
        
        return memo[n];
    } 
}