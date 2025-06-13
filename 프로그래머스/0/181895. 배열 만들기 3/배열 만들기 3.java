class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1]-intervals[0][0]+1 + intervals[1][1]-intervals[1][0]+1];
        
        for(int i=0, arr_i = intervals[0][0];i<intervals[0][1]-intervals[0][0]+1;i++,arr_i++){
            
            answer[i] = arr[arr_i];
        }
        for(int i=intervals[0][1]-intervals[0][0]+1, arr_i = intervals[1][0];i<answer.length;i++,arr_i++){
            
            answer[i] = arr[arr_i];
        }
        return answer;
    }
}