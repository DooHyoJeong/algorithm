import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        // n번째(1-based) 원소부터 끝까지 → (n-1) 인덱스부터 끝까지
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}