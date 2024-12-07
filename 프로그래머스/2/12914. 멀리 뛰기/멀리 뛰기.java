class Solution {
    
    public long solution(int n) {
        long answer = 1;
        int[][] m = new int[n+1][n+1];
  
        for(int i=1; i <= n/2; i++){
            System.out.println(combination(n-i, i,m));
            answer += combination(n-i, i, m) % 1234567;
        }
            
        
        return answer% 1234567;
    }
    public int combination(int n, int r, int[][] m){  
        if(n == r || r == 0)
            return 1;
        else if(m[n][r] > 0){
            return m[n][r];
        }
        else
            return m[n][r] = combination(n-1, r-1,m) %1234567+ combination(n-1, r,m)%1234567;
    }
}