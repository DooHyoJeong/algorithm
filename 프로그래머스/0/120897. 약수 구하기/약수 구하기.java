import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> arrayList=new ArrayList<>();
        for(int i=1; i<=n ;i++){
            if(n%i==0){
                arrayList.add(i);
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}