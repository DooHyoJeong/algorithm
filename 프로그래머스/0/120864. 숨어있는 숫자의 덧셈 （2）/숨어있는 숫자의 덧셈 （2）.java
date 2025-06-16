class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean Numbers = false;
        String num_str="";
        for(int i = 0 ; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                num_str += ch;
                Numbers = true; // 숫자를 만나면 플래그 true
            } else {
                if (Numbers) { // 숫자 끝났을 때
                    answer += Integer.parseInt(num_str);
                    num_str = ""; // 초기화
                    Numbers = false;
                }
            }
        }
        if (Numbers && !num_str.isEmpty()) {
            answer += Integer.parseInt(num_str);
        }
        return answer;
    }
}