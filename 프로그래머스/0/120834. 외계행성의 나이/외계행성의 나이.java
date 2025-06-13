class Solution {
    public String solution(int age) {
        String str_age = String.valueOf(age);
        String answer ="";
        for(int i= 0;i<str_age.length();i++){
            answer+= (char)('a'+(str_age.charAt(i)-'0'));
        }
        return answer;
    }
}