import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
    String str = String.valueOf(i);
    boolean onlyFiveOrZero = true;

    for (char c : str.toCharArray()) {
        if (c != '5' && c != '0') {
            onlyFiveOrZero = false;
            break;
        }
    }

    if (onlyFiveOrZero) {
        answerList.add(i);
    }
}
        if(answerList.size()==0){
            answerList.add(-1);
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}