class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i = 0 ; i < 3;i++){
           if(date1[i] < date2[i]){
                return 1;
            }
           if (date1[i] > date2[i]) return 0; // date1이 더 뒤면 0
        }
        return answer;
    }
}