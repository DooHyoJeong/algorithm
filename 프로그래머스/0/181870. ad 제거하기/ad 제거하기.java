import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> answerList = new ArrayList<>();
        for(String str : strArr){
            if(!str.contains("ad")){
                answerList.add(str);
            }
        }
        
        String[] answer = answerList.stream().toArray(String[]::new);
        return answer;
    }
}