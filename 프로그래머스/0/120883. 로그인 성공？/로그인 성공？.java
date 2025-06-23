class Solution {
     public String solution(String[] id_pw, String[][] db) {
        for (String[] user : db) {
            if (user[0].equals(id_pw[0])) { // 아이디 일치
                if (user[1].equals(id_pw[1])) { // 비밀번호도 일치
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail"; // 아이디 없음
    }
}