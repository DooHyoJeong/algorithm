class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean answer1 = true;
        boolean answer2 = true;
        answer1 = x1 || x2;
        answer2 = x3 || x4;
        answer = answer1 && answer2;
        return answer;
    }
}