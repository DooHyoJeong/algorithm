import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answerList = new ArrayList<>();
        String temp="";
        for(int i = 0; i < my_str.length();i++){
            if(i == 0){
                temp+=my_str.charAt(i);
                continue;
            }
            if(i % n == 0){
                answerList.add(temp);
                temp="";
                temp+=my_str.charAt(i);

            }else{
                temp+=my_str.charAt(i);
            }
        }
        if(temp.length() > 0) {
            answerList.add(temp);
        }
        String[] answer = answerList.toArray(new String[0]);
        
        return answer;
    }
}