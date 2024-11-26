class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        while(true){
            if(n <= 2)
                break;
            if(a <= n/2 && b > n/2){
                n /= 2;
                a = a%2 ==0 ? a/2:a/2+1;
                b = b%2 ==0 ? b/2:b/2+1;
                System.out.println(n+" "+a+" "+b);
                answer++;
                System.out.println(answer);
            }
            else{
                n /=2;
                if(a > n){
                    a -= n;
                    b -= n;
                }
            }
            
        }
        
        return answer;
    }
    
}