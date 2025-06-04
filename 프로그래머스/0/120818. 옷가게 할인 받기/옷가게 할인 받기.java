class Solution {
    public int solution(int price) {
        double discount = 0.0;
        if (price >= 500000) {
            discount = 0.20;
        } else if (price >= 300000) {
            discount = 0.10;
        } else if (price >= 100000) {
            discount = 0.05;
        }
        // 할인액을 소수점까지 계산하고, 최종 가격을 Math.floor로 내림
        return (int)Math.floor(price - (price * discount));
    }
}