class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] answerArray = new int[included.length];
        for(int i = 0 ; i < answerArray.length; i ++){
            if(i == 0 ){
                answerArray[i] = a;
                continue;
            }
            answerArray[i] = answerArray[i-1] + d; 
        }
        for(int i = 0 ; i < answerArray.length; i++){
            if(included[i] == true){
                answer+=answerArray[i];
            }
        }
        return answer;
    }
}