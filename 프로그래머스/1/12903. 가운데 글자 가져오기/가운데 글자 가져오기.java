class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length() / 2;
        if(s.length() % 2 == 0){
            answer += String.valueOf(s.charAt(n-1)) + String.valueOf(s.charAt(n)) ;
        }else{
            answer += String.valueOf(s.charAt(n));
        }
        return answer;
    }
}