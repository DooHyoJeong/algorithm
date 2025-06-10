class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean write = false;
        for(int i = 0 ; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                write = true;
                answer+=String.valueOf(n_str.charAt(i));
            }else{
                if(write){
                    answer+=String.valueOf(n_str.charAt(i));
                }
            }
            
            
        }
        return answer;
    }
}