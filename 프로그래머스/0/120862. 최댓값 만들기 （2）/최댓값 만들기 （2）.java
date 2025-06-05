import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int[] sortedArray = Arrays.stream(numbers).sorted().toArray();
        if(sortedArray[0] < 0 && sortedArray[1] < 0){
            if(max < sortedArray[0] * sortedArray[1]){
                max = sortedArray[0] * sortedArray[1];
            }
            if(max < sortedArray[sortedArray.length -1] * sortedArray[sortedArray.length -2])
                max = sortedArray[sortedArray.length -1] * sortedArray[sortedArray.length -2];
        } else{
            if(max < sortedArray[sortedArray.length -1] * sortedArray[sortedArray.length -2])
                max = sortedArray[sortedArray.length -1] * sortedArray[sortedArray.length -2];
        }
        return max;
    }
}