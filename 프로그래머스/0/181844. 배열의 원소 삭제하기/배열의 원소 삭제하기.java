import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();
        for(int i : arr){
            boolean delete = false;
            for(int j : delete_list){
                if(i == j){
                    delete = true;
                    break;
                }
            }
            if(!delete){
                answerList.add(i);
            }
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}