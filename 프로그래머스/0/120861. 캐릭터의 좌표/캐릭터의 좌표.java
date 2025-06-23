class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0}; // 시작 좌표를 (0,0)으로 초기화
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            String key = keyinput[i];
            switch (key) {
                case "up":
                    if (answer[1] < yLimit) answer[1]++;
                    break;
                case "down":
                    if (answer[1] > -yLimit) answer[1]--;
                    break;
                case "left":
                    if (answer[0] > -xLimit) answer[0]--;
                    break;
                case "right":
                    if (answer[0] < xLimit) answer[0]++;
                    break;
            }
        }
        return answer;
    }
}