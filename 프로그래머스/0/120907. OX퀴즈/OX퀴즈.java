class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0 ; i < quiz.length;i++){
            String[] cal = quiz[i].split(" ");
            int x = Integer.valueOf(cal[0]);
            int y = Integer.valueOf(cal[2]);
            int z = Integer.valueOf(cal[4]);
            if(cal[1].equals("+") ){
                if(x+y == z){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                if(x-y == z){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}