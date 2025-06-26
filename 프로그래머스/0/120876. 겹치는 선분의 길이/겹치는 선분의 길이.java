class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201]; // 인덱스 0 ~ 200 → 실제 좌표 -100 ~ 100

        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;

            // 선분이 포함하는 구간 체크
            for (int i = start; i < end; i++) {
                arr[i]++;
            }
        }

        int answer = 0;

        // 2개 이상 겹친 구간의 길이 계산
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                answer++;
            }
        }

        return answer;
    }
}