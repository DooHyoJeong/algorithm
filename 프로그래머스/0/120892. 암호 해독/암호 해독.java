class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i =0;i<cipher.length();i++){
            // System.out.println(i+1%code);
            if((i+1)%code == 0){
                // System.out.print(cipher.charAt(i));
                answer+=String.valueOf(cipher.charAt(i));
            }
        }
        return answer;
    }
}