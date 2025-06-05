import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < my_string.length(); i++){
            String s = String.valueOf(my_string.charAt(i));
            try{
                answer += Integer.parseInt(s);
            } catch(NumberFormatException e){
                continue;
            }
        }
        return answer;
    }
}