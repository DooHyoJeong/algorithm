import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0 ; i < arr.length;i++){
            if(flag[i] == true){
                for(int j = 0 ; j < arr[i] *2; j++){
                    answerList.add(arr[i]);        
                }
            }else{
                for(int j = 0 ; j < arr[i] ; j++){
                    answerList.remove(answerList.size() - 1);

                }
            }
            
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}