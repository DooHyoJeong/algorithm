class Solution {
    public int solution(double flo) {
        String answer_str = String.valueOf(flo);
        int dot_inx = answer_str.indexOf(".");
        answer_str= answer_str.substring(0,dot_inx);
        int answer = Integer.parseInt(answer_str);
        
        return answer;
    }
}