import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int [n];
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i<= n;i++){
            if(i%2 != 0){
                arrayList.add(i);
            }
        }
        answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}