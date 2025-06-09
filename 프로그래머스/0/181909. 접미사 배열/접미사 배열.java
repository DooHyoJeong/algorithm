import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> answerList = new ArrayList<>();
        for(int i = 1; i <= my_string.length(); i++){
            String temp = "";
            for(int j = my_string.length()-i ; j < my_string.length() ; j++){
                temp+=(String.valueOf(my_string.charAt(j)));
            }
            
            answerList.add(temp);
        }
        String[] answer = answerList.stream().sorted().toArray(String[]::new);
         
        return answer;
    }
}