import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int answer = 1;
        for (char c : before.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count1[c - 'a']++;
            }
        }
        for (char c : after.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count2[c - 'a']++;
            }
        }
        for(int i = 0 ; i < count1.length; i++){
            if(count1[i]!=count2[i]){
                return 0;
            }
        }
        return answer;
    }
}