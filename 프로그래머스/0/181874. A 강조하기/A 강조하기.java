class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0 ; i < myString.length();i++){
            if(myString.charAt(i) == 'a') {
                answer+=(String)"A";
            }else if(myString.charAt(i) == 'A') {
                answer+=(String)"A";
            }else{
                answer+=String.valueOf(myString.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}