class Solution {
    public int[] solution(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];

        for(int i = a.length()-1, j = 0 ; i >= 0 ; i--,j++){
            answer[j] = Integer.parseInt(String.valueOf(a.charAt(i)));

        }
        return answer;
    }
}