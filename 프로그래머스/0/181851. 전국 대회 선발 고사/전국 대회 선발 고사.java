import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 랭크별로 인덱스를 정렬
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            indices.add(i);
        }

        // rank[i]가 낮을수록 우선순위가 높으므로 오름차순 정렬
        indices.sort((i, j) -> Integer.compare(rank[i], rank[j]));

        // 상위 3명 중 attendance가 true인 경우만 추출
        int[] selected = new int[3];
        int count = 0;
        for (int i : indices) {
            if (attendance[i]) {
                selected[count++] = i;
                if (count == 3) break;
            }
        }

        // 정답 계산: 10000 * a + 100 * b + c
        return 10000 * selected[0] + 100 * selected[1] + selected[2];
    }
}