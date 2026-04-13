import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= 9 ; i++){
            set.add(i);
        }
        for(int i = 0 ; i < numbers.length; i++){
            set.remove(numbers[i]);
        }
        for(Integer num : set){
            answer += num;
        }
        return answer;
    }
}