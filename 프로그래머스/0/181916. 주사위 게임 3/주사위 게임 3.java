import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
    int[] dice = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();

        // 주사위 값 개수 세기
        for (int num : dice) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int answer = 0;

        if (map.size() == 1) {
            // 모두 같은 경우
            int p = a;
            answer = 1111 * p;
        } else if (map.size() == 2) {
            // 3+1 또는 2+2
            List<Integer> keys = new ArrayList<>(map.keySet());
            int first = keys.get(0), second = keys.get(1);
            int cnt1 = map.get(first), cnt2 = map.get(second);

            if (cnt1 == 3 || cnt2 == 3) {
                // 3+1인 경우
                int p = cnt1 == 3 ? first : second;
                int q = cnt1 == 1 ? first : second;
                answer = (10 * p + q) * (10 * p + q);
            } else {
                // 2+2인 경우
                answer = (first + second) * Math.abs(first - second);
            }
        } else if (map.size() == 3) {
            // 2+1+1인 경우
            int p = 0;
            List<Integer> ones = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 2) p = entry.getKey();
                else ones.add(entry.getKey());
            }
            answer = ones.get(0) * ones.get(1);
        } else {
            // 모두 다른 경우
            answer = Arrays.stream(dice).min().getAsInt();
        }

        return answer;
    }
}