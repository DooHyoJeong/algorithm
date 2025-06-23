class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int service = coupon / 10;    // 받을 수 있는 서비스 치킨 수
            answer += service;            // 누적
            coupon = service + (coupon % 10);  // 남은 쿠폰 + 새로 받은 쿠폰
        }

        return answer;
    }
}