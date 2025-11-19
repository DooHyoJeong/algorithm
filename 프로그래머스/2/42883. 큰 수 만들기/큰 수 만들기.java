import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        //** 글자 자리 변경 불가, 제거만 가능**
        //StringBuilder 마지막 숫자가 현재 숫자 보다 작고 , 아직 지울 수 있는 k가 남아있으면 작은 숫자 삭제
        //그 다음 현재 숫자를 StringBuilder에 넣는다
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) < c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
 
            sb.append(c);
        }
        //k남으면 뒤에서 k개 잘라낸다
        if (k > 0) {
            sb.setLength(sb.length() - k);
        }

        return sb.toString();
       
    }
}