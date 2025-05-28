import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).map(n->2*n).toArray();
        return answer;
    }
}