class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String answer_string = String.valueOf(num);
        answer = answer_string.indexOf(String.valueOf(k));
        if(answer != -1){
            answer++;
        }
        return answer;
    }
}