class Solution {
        public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        double[] avg = new double[n];

        // 1. 평균 계산
        for (int i = 0; i < n; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        // 2. 평균 점수를 기준으로 순위 부여
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (avg[j] > avg[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}