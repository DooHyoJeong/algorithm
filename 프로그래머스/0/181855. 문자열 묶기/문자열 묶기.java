import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer> strMap= new HashMap<>();
        for(int i =0; i < strArr.length ; i++){
            int len = strArr[i].length();
            strMap.put(len,strMap.getOrDefault(len,0)+1);
        }
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : strMap.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
            }
        }
        return maxValue;
    }
}