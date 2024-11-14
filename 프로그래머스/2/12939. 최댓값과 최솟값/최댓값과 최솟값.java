class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int min, max, n;
        
        min = Integer.parseInt(arr[0]);
        max = Integer.parseInt(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            n = Integer.parseInt(arr[i]);
            if(min > n)
                min = n;
            if(max < n)
                max = n;
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        
        
        return answer;
    }
}