import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> answerList = new ArrayList<>();
        for(int i = 0 ; i < strArr.length; i++){
            if(i%2 != 0){
                answerList.add(strArr[i].toUpperCase());
            }else{
                answerList.add(strArr[i].toLowerCase());
            }
                
        }
        String[] answer = answerList.toArray(new String[0]);
        return answer;
    }
}