import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < array.length;i++){
            if(Math.abs(n-array[i]) < Math.abs(n-answer) || (Math.abs(n - array[i]) == Math.abs(n - answer) && array[i] < answer)){
                answer = array[i];
            }
        }
        return answer;
    }
}