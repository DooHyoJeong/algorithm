import java.util.*;
class Solution {
    public int[] solution(int n) {
        Set<Integer> answerSet = new TreeSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                answerSet.add(i);
                n /= i;
            }
        }
        int[] answer = answerSet.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
        return answer;
    }
}