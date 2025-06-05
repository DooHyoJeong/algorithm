import java.util.HashMap;
class Solution {
    public String solution(String rsp) {
        HashMap<String, String> 가위바위보 = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        가위바위보.put("2","0");
        가위바위보.put("0","5");
        가위바위보.put("5","2");
        for (int i = 0; i < rsp.length(); i++) {
            String key = String.valueOf(rsp.charAt(i));
            
            sb.append(가위바위보.get(key));
        }  
        String answer = sb.toString();
        return answer;
    }
}