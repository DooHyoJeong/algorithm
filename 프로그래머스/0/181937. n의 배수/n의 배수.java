class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        for(int i = 0;i<n;i++){
            if(num%n == 0){
                return 1;
            }
        }
        return answer;
    }
}