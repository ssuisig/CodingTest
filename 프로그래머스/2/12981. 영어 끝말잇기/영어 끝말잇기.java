import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>(); // 중복 확인용
        set.add(words[0]); // 첫 단어는 무조건 추가
        
        for (int i = 1; i < words.length; i++) {
            String s1 = words[i - 1];
            String s2 = words[i];

            // 규칙 1: 이어지는 단어가 올바르지 않을 경우
            if (s1.charAt(s1.length() - 1) != s2.charAt(0)) {
                answer[0] = (i % n) + 1; // 플레이어 번호
                answer[1] = (i / n) + 1; // 차례
                return answer;
            }

            // 규칙 2: 단어 중복 확인
            if (set.contains(s2)) {
                answer[0] = (i % n) + 1; // 플레이어 번호
                answer[1] = (i / n) + 1; // 차례
                return answer;
            }

            set.add(s2); // 단어 사용 처리
        }

        // 규칙 위반이 없을 경우
        return answer; // [0, 0] 반환
    }
}
