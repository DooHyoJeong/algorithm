class Solution {
    public int[] solution(int[] num_list) {
        
        int 짝수 = 0;
        int 홀수 = 0;
        for(int i = 0 ;i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                짝수++;
            }else{
                홀수++;
            }
        }
        int[] answer = {짝수, 홀수};
        return answer;
    }
}