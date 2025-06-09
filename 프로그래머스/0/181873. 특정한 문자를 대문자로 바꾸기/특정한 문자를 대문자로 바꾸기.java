class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0 ; i < my_string.length();i++){
            String temp = String.valueOf(my_string.charAt(i));
            if(alp.equals(temp)){
                answer+= String.valueOf((char)(my_string.charAt(i)-32));
            }else{
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}