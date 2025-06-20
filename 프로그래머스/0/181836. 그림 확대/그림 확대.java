import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answerList = new ArrayList<>();
        for(int i = 0 ; i < picture.length; i++){
            String temp="";

            for(int j = 0 ; j < picture[i].length() ; j++){
                for(int l = 0 ; l < k;l++){
                    temp+=picture[i].charAt(j);

                }
                
            }
            // System.out.println(temp);
            for(int l = 0 ; l < k;l++){
                answerList.add(temp);

            }
        }
        String[] answer = answerList.toArray(new String[0]);
        
        return answer;
    }
}