
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num2 < 0){
            Math.abs(num2);
        }
        answer = num1-num2;
        return answer;
    }
}