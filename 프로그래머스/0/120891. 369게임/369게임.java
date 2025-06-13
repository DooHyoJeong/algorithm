class Solution {
    public int solution(int order) {
        String order_str = String.valueOf(order);
        int answer = 0;
        for(int i=0;i<order_str.length();i++){
            if(order_str.charAt(i) == '3' || order_str.charAt(i) == '6'|| order_str.charAt(i) == '9' ){
                answer++;
            }
        }
        
        
        return answer;
    }
}