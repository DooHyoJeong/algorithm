class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int 곱 = 1;
        int 합 = 0;
        for(int i = 0; i < num_list.length ; i++){
            곱 *= num_list[i];
            합 += num_list[i];
        }
        if(곱 > 합*합){
            return 0;
        }
        return 1;
    }
}