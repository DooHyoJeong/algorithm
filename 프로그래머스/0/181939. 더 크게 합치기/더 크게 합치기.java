class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a_str = Integer.toString(a);
        String b_str = Integer.toString(b);
        a = Integer.parseInt(String.valueOf(a_str + b_str));
        b = Integer.parseInt(String.valueOf(b_str + a_str));
        if(a < b){
            return b;
        }else{
            return a;
        }
    }
}