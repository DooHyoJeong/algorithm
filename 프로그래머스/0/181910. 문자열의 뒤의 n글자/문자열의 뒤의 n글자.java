class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int count = my_string.length()-n;
        for(int i = count; i <my_string.length() ; i++){
            answer+= String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}