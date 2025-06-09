import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(int[] numLog) {
        List<String> answerList = new ArrayList<>();
        
        for(int i = 0 ; i < numLog.length; i++){
            if(i == 0){
                continue;
            }
            if(numLog[i] - numLog[i-1]== 1){
                answerList.add("w");
            }else if(numLog[i] - numLog[i-1]== -1){
                answerList.add("s");
            }else if(numLog[i] - numLog[i-1]== 10){
                answerList.add("d");
            }else if(numLog[i] - numLog[i-1]== -10){
                answerList.add("a");
            }
        }
        String answer = answerList.stream().collect(Collectors.joining());
        
        return answer;
    }
}