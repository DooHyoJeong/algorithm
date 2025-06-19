import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        List<Integer> answerList = new ArrayList<>();
        for(int i= 0; i < queries.length; i++){
            int k = queries[i][2];
            for(int j = queries[i][0] ; j < queries[i][1]+1; j++){
                if(k < arr[j]){
                    answerList.add(arr[j]);
                }
            }
            if(answerList.size() == 0){
                answer[i] = -1;
            }else{
                int minValue = Collections.min(answerList);
                answer[i] = minValue;
                answerList.clear();
            }
            
        }
        return answer;
    }
}