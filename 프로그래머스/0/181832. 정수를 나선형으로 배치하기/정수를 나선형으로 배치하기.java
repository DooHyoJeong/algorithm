class Solution {
    public int[][] solution(int n) {
                int[][] answer = new int[n][n];
        
        // 방향: 오른쪽, 아래, 왼쪽, 위
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dir = 0; // 현재 방향 인덱스

        int x = 0, y = 0; // 현재 위치
        for (int i = 1; i <= n * n; i++) {
            answer[x][y] = i;

            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 다음 위치가 범위를 벗어나거나 이미 채워졌으면 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 방향 전환
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        return answer;
    }
}