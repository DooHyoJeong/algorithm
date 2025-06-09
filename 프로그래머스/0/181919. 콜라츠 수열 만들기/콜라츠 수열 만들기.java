import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        answerList.add(n);
        while(n !=1){
            if(n %2 == 0){
                n /=2;
                answerList.add(n);
            }else{
                n = 3*n+1;
                answerList.add(n);
            }
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}