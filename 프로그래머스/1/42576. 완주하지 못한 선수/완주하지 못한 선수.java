import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        //참가자들을 map 에 저장
        for(int i = 0 ; i < participant.length; i++){
            String name = participant[i];
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        //완주자랑 비교 및 value --1;
        for(int i = 0 ; i < completion.length; i++){
            String name = completion[i];
            map.put(name, map.getOrDefault(name, 0) - 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                return entry.getKey();
            }
        }
        return "";
    }
}