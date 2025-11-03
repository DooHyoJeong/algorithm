import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Boolean> map = new HashMap<>();
        for(int i = 0 ; i < phone_book.length ; i++){
            String number = phone_book[i];
            map.put(number,true);
        }
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {  
                String prefix = number.substring(0, i);
                if (map.containsKey(prefix)) {  
                    return false;  
                }
            }
        }

        
        return true;
    }
}