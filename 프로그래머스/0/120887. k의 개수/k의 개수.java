class Solution {
    public int solution(int i, int j, int k) {
        String temp = "";
        int answer = 0;

        for(;i <= j; i++){
            temp = String.valueOf(i);
            for(int l = 0 ; l < temp.length();l++){
                
                if(String.valueOf(temp.charAt(l)).equals(String.valueOf(k)) ){
                    
                    answer++;
                }
            }
        }
        return answer;
    }
}