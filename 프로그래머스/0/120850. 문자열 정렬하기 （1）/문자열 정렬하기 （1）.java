import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<my_string.length();i++){
            String chr = String.valueOf(my_string.charAt(i));
            try {
                arrayList.add(Integer.parseInt(chr));
            } catch (NumberFormatException e) {
                continue;
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).sorted().toArray();
        
        return answer;
    }
}