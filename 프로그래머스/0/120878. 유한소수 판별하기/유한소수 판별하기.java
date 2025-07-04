class Solution {
    public int solution(int a, int b) {
        int gcd = getGCD(a, b);
        b /= gcd;

        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        return b == 1 ? 1 : 2;
    }

    // 최대공약수 구하기 (유클리드 호제법)
    private int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}
