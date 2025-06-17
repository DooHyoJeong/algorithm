class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] answerStr = s.split(" ");
        
        for(int i= 0; i < answerStr.length ; i++){
            
            if(answerStr[i].equals("Z")){
                answer-= Integer.parseInt(answerStr[i-1]);
            }else{
                answer += Integer.parseInt(answerStr[i]);
            }
        }
        return answer;
    }
}