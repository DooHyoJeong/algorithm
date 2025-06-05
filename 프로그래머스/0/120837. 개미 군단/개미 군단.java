class Solution {
    public int solution(int hp) {
        int 장군개미수 = 0;
        int 병정개미수 = 0;
        int 일개미수 = 0;
        if(hp >= 5){
            장군개미수 = hp/5;
            hp = hp - 장군개미수*5;  
        }
        if(hp >= 3){
            병정개미수 = hp/3;
            hp = hp - 병정개미수*3;
        }
        if(hp >= 1){
            일개미수 = hp/1;
            hp = hp - 일개미수*1;
        }
        return 장군개미수+병정개미수+일개미수;
    }
}