class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int temp = x;
        while(temp/10 != 0){
            int edge = temp%10;
            sum += edge;
            temp = temp/10;
        }
        sum += temp;
        
        if(x%sum != 0){
            answer = false;
        }
    return answer;
    }
}