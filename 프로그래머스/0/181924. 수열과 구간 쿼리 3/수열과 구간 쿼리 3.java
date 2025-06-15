class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i = 0 ; i < queries.length ; i++){
            int index1_value = answer[queries[i][0]];
            int index2_value = answer[queries[i][1]];
            answer[queries[i][0]] = index2_value;
            answer[queries[i][1]] = index1_value;
            
        }
        return answer;
    }
}