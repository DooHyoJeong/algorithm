import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> answerList = new ArrayList<>();
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        for(String s : answer){
            if(!s.equals("")){
                answerList.add(s);
            }
        }
        answer=answerList.toArray(new String[0]);
        return answer;
    }
}