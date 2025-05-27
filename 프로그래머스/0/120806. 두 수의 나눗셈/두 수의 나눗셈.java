class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double 나눔 =  (double)num1/num2*1000;
        String str_나눔 = String.valueOf(나눔);
        int 정수_index = str_나눔.indexOf(".");
        
        answer = Integer.parseInt(str_나눔.substring(0,정수_index));
        
        return answer;
    }
}