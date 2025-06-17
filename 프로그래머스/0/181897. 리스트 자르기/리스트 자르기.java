import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        switch(n){
            case 1:
                for(int i = 0 ; i <= slicer[1]; i++){
                    answerList.add(num_list[i]);
                }
                answer=answerList.stream().mapToInt(Integer::intValue).toArray();
                break;
            case 2:
                for(int i = slicer[0] ; i < num_list.length; i++){
                    answerList.add(num_list[i]);
                }
                answer=answerList.stream().mapToInt(Integer::intValue).toArray();
                break;
            case 3:
                for(int i = slicer[0] ; i <= slicer[1]; i++){
                    answerList.add(num_list[i]);
                }
                answer=answerList.stream().mapToInt(Integer::intValue).toArray();
                break;
            case 4:
                for(int i = slicer[0] ; i <= slicer[1]; i+=slicer[2]){
                    answerList.add(num_list[i]);
                }
                answer=answerList.stream().mapToInt(Integer::intValue).toArray();
                break;
        }
        
        
        return answer;
    }
}