import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int rowLength = arr[0].length;
        int columnLength = arr.length;
        if(rowLength > columnLength){
            columnLength =rowLength;
        }else if(rowLength == columnLength){
            return arr;
        }else{
            rowLength = columnLength;
        }
        
        int[][] answer = new int[columnLength][rowLength];
        for(int i = 0 ; i < answer.length; i++){
            
            for(int j = 0 ; j < answer[i].length; j++){
                if(i < arr.length && j < arr[i].length){
                    answer[i][j] = arr[i][j];
                    
                }else{
                    answer[i][j] = 0;
                }
            }
        }        
        
        return answer;
    }
}