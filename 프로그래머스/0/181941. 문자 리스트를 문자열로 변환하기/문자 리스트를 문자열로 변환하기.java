class Solution {
    public String solution(String[] arr) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(String i : arr){
            sb.append(i);
        }
        answer = sb.toString();
        return answer;
    }
}