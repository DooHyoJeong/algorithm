class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1 ; i <= n ; i++){
            int factorCount = 0 ;
            for(int j =1; j <= i ; j++){
                if (i%j == 0){
                    factorCount +=1;
                }
                if(factorCount >= 3){
                    
                    answer+=1;
                    break;
                }
            }
            
        }
        return answer;
    }
}