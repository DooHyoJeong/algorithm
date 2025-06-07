import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> answerList = new ArrayList<>();
        for(int i = start_num ; i >= end_num; i--){
            answerList.add(i);
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}