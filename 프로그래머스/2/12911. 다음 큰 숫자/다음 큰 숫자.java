class Solution {
    public int solution(int n) {
        
        int t = Integer.bitCount(n);
        while(t != Integer.bitCount(++n)){}     
        return n;
    }
}