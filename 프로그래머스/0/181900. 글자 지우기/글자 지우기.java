import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        List<String> answerList = new ArrayList<>();
        for(int i = 0;i<my_string.length();i++){
            answerList.add(String.valueOf(my_string.charAt(i)));
        }
        for(int i = 0 ; i < indices.length ; i++){
            answerList.set(indices[i], " ");
        }
        String answer = String.join("",answerList);
        String answer1 = answer.replace(" ","");
        
        return answer1;
    }
}