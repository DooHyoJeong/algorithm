import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answerList = new ArrayList<>(); 
        for(int i : num_list){
            answerList.add(i);            
        }
        
        if(num_list[num_list.length-1] > num_list[num_list.length-2]){
            answerList.add(num_list[num_list.length-1]-num_list[num_list.length-2]);
        } else{
            answerList.add(2*num_list[num_list.length-1]);
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}