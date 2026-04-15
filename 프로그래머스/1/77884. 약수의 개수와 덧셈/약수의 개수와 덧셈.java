import java.util.*;
class Solution {
    int divisor(int n){
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1 ; i * i <= n ; i++){
            if(n%i ==0){
                list.add(i);
                if(i != n / i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list.size();
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right ; i++){
            int cnt = divisor(i);
            if(cnt % 2 == 0){
                answer += i;    
            }else{
                answer -= i;
            }
            
        }
        return answer;
    }
}