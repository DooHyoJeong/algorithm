class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int solution(int n) {
        int answer = 0;
        if(n%6==0){
            return n/6;
        }else{
            answer = lcm(n, 6);
            return answer/6;
        }
    }
}