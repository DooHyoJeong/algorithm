class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        for(int i = 0; i <= b-a; i++){
            answer += a+i;
        }
        return answer;
    }
}