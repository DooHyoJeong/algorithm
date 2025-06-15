import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        for(int i : arr){
            answerList.add(i);
        }
        int squ2 = 1;
        while(arr.length > squ2){
            squ2 *=2;
        }
        for(int i = arr.length ; i < squ2; i++){
            answerList.add(0);
        }
        int[] answer = answerList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}