class Solution {
    public int solution(int a, int b) {
        String str_a = String.valueOf(a);
        String str_b = String.valueOf(b);
        
        int answer = Integer.parseInt(str_a+str_b);
        if (answer < 2*a*b){
            return 2*a*b;
        }
        return answer;
    }
}