class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int big = 0;
        int small = 0;
        if(sides[0]<sides[1]){
            big = sides[1];
            small = sides[0];
        }else{
            big = sides[0];
            small = sides[1];
        }
        //1. big이 제일 큰 변이면?
        for(int i = big-small ; i < big; i++){
            answer ++;
        }
        // System.out.println("1 "+answer);
        //2. 나머지 한변이 제일 큰 변이면?
        for(int i = big+1 ; i < big+small; i++){
            answer++;    
        }
        // System.out.println("2 "+answer);

        return answer;
    }
}