class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int l = myString.lastIndexOf(pat);
        for(int i = 0 ; i < l + pat.length() ;i++){
            answer+= myString.charAt(i);
        }
        return answer;
    }
}