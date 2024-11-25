import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int index = -1;
        
        List<String> list = Arrays.asList(words);
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        for(int i=1; i < words.length; i++){
            String s1 = words[i-1];
            String s2 = words[i];
            if(s1.charAt(s1.length()-1)!=s2.charAt(0)){
                System.out.println("noflow");
                index = i;
                break;
            }
            if(!set.add(words[i])){
                System.out.println("duplication");
                index = i;
                break;
            }
            
        }
        System.out.println(index);
        if(index != -1){
            index += 1;
            System.out.println(index);
            if(index % n == 0){
                answer[0] = n;
                answer[1] = index/n;
            }
            else{
                answer[0] = index%n;
                answer[1] = index/n+1;
            }
            
        }

        return answer;
    }
}