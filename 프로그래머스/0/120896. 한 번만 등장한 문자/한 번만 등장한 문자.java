import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<String,Integer> answerMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            answerMap.put(ch, answerMap.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : answerMap.entrySet()){
            if(entry.getValue() == 1){
                answer+= entry.getKey();
            }    
        
        }
        return answer;
    }
}