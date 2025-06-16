class Solution {
    public int solution(int n) {
        int answer = 1;
        int fac = 1;
        while(true){
            if(n < answer){
                return fac-=2;
            }else{
                answer *=fac;
                fac++;
            }
        }
    }
}