import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answerList = new ArrayList<>(Arrays.asList(my_string.split(" ")));  
        answerList.removeIf(str -> str.isBlank());
        String[] answer = answerList.toArray(new String[0]);
        
        return answer;
    }
}