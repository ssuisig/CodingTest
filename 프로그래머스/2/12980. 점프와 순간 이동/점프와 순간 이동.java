import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int count = 1;

        while(n > 1)
            if(n % 2 == 0)
                n /= 2;
            else{
                n /= 2;
                count++;
            }

        return count;
    }
}