import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answerList = new ArrayList<>();
        for(int i = 0 ; i < todo_list.length; i++){
            if(finished[i] == false){
                answerList.add(todo_list[i]);
            }
        }
        String[] answer = answerList.toArray(new String[0]);
        
        return answer;
    }
}