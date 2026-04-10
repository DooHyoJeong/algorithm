import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = String.valueOf(n);
        Integer[] array = new Integer[a.length()];
        
        for(int i = 0 ; i < a.length(); i++){
            array[i] = a.charAt(i) - '0';
        }
        
        Arrays.sort(array, Collections.reverseOrder());
       
        for(int i = 0 ; i < array.length; i++){
            answer = answer*10+array[i];
        }
        
        return answer;
    }
}