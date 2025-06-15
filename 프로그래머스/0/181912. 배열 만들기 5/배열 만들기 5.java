import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0 ; i < intStrs.length; i++){
            String answerString = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(answerString) > k ){
                answerList.add(Integer.parseInt(answerString));
            }    
        
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
                
        return answer;
    }
}