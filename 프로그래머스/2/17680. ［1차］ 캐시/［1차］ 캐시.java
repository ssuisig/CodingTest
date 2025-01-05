import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        if(cacheSize ==0)
            return cities.length*5;
        
        for(String i: cities){
            String city = i.toLowerCase();
            if(!list.contains(city)){
                if(list.size() == cacheSize){
                    list.remove(0);
                }
                list.add(city);
                answer+= 5;
            }
            else{
                list.remove(list.indexOf(city));
                list.add(city);
                answer+=1;
            }
                
        }
        return answer;
    }
}