import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<numbers.length; i++){
            if(i >= num1 && i <= num2){
                list.add(numbers[i]);
            }else{
                continue;
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}