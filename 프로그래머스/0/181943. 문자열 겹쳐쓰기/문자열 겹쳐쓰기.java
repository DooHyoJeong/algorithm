class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        for(int i = 0,over_i = 0 ; i < my_string.length(); i++){
            if( i >= s && i < s + overwrite_string.length()){
                answer+=overwrite_string.charAt(over_i);
                over_i++;
                // System.out.println(answer);
            }else{
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}