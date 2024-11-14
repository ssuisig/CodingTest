class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int n = (brown / 2) - 2;
        System.out.println(n);
        for(int i=1; i <= n/2; i++){
            System.out.println(i+"/"+(n-i));
            if(i*(n-i) == yellow){
                answer[0] = (n-i)+2;
                answer[1] = i+2;
                break;
            }
        }
        return answer;
    }
}