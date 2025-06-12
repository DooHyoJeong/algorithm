import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        for(int i : arr){
            for(int j =0; j < i;j++){
                answerList.add(i);
            }
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}