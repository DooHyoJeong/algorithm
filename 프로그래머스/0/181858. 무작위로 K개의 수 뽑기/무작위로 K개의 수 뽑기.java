import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> answerSet = new LinkedHashSet<>();
        for (int i = 0 ; i < arr.length; i++) {
            if (answerSet.size() < k) {
                answerSet.add(arr[i]);
            }
        }
        List<Integer> answerList = new ArrayList<>(answerSet);

        // 만약 k개보다 많으면 앞에서 k개만 남김
        if (answerList.size() > k) {
            answerList = answerList.subList(0, k);
        }
        // 부족하면 -1로 채움
        while (answerList.size() < k) {
            answerList.add(-1);
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}