class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 1){
            return 1;
        }
        for(int i = 1; i < n/2 ; i++){
            if(n%i == 0 ){
                int a = n/i;
                if(a > i){
                    answer +=i;
                    answer +=a;
                }else if (a==i){
                    answer+=i;
                }                
            }
        }
        return answer;
    }
}