import java.util.*;
class Solution {
    public String solution(String my_string) {
        Set<String> answerSet = new LinkedHashSet<>();
        for(int i = 0 ; i < my_string.length();i++){
            answerSet.add(String.valueOf(my_string.charAt(i)));
            
        }
        String answer = String.join("",answerSet);
        
        return answer;
    }
}