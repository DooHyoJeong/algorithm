import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]");
        answer = Arrays.stream(answer).filter(s->!s.isEmpty()).toArray(String[]::new);
        if(answer.length == 0){
            answer = new String[]{"EMPTY"};
        }
        return answer;
    }
}