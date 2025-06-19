class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        for(int i = 0 ; i < str.length; i++){
            if(i == 0){
                answer= Integer.parseInt(str[i]);
                continue;
            }
            if(str[i-1].equals("+")){
                answer=answer + Integer.parseInt(str[i]);
            }else if(str[i-1].equals("-")){
                answer=answer - Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}