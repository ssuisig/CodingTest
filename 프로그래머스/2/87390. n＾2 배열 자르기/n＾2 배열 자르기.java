class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right-(int)left+1];
        int idx = 0;
        
        for(long i=left; i <= right; i++){
            answer[idx++] = ((i/n)+1 > (i%n)+1) ? (int)(i/n)+1:(int)(i%n)+1;
        }
        
        return answer;
    }
}