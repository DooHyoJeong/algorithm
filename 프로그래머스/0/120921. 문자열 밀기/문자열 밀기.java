class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;

        for (int i = 1; i <= A.length(); i++) {
            // 오른쪽으로 한 칸 회전: 마지막 글자를 앞으로 보내기
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            if (A.equals(B)) return i;
        }
        return -1; // 만들 수 없는 경우
    }
}