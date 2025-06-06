import java.util.*;
class Solution {
    public String solution(String my_string) {
        String lowerChar = my_string.toLowerCase();
        //1. toCharArray 변환
        char[] hun = lowerChar.toCharArray();
        
        //2. Arrays.sort 사용 
        Arrays.sort(hun);
        
        
        return new String(hun);
    }
}