import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        boolean include2 = false;
        for(int i = 0; i < arr.length ; i++ ){
            if(arr[i] == 2 && !include2 ){
                answerList.add(arr[i]);
                include2=true;
            }else if(include2){
                answerList.add(arr[i]);
            }
        }
        for(int i = answerList.size() - 1 ; i >= 0 ; i--){
            if(answerList.get(i) != 2){
                answerList.remove(i);
                
            }else{
                break;
            }
        }
        if(answerList.size() == 0 ){
            answerList.add(-1);
        }
        int[] answer = answerList.stream().mapToInt
(Integer::intValue).toArray();
        
        return answer;
    }
}