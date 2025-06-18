import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if( answerList.size() == 0){
                answerList.add(arr[i]);
                continue;
            }
            if(answerList.get(answerList.size()-1) == arr[i]){
                answerList.remove(answerList.size()-1);
            }else{
                answerList.add(arr[i]);
            }
        }
        if( answerList.size() == 0){
                answerList.add(-1);
            }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}