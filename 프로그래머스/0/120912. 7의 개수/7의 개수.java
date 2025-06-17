class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String answerStr = "";
        for(int i : array){
            answerStr += i;
        }
        for(int i= 0 ; i < answerStr.length(); i++){
            if(answerStr.charAt(i) == '7'){
                answer++;
            }
        }
        return answer;
    }
}