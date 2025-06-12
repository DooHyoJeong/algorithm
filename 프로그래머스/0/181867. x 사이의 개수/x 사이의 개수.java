import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) != 'x'){
                count++;
            }else{
                arrayList.add(count);
                count = 0;
            }
        }
        arrayList.add(count);
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}