class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString;
        while(true){
            int my_i = str.indexOf(pat);
            // System.out.println("my_i " + my_i);

            if(my_i == -1){
                break;
            }
            answer++;
            String temp = str.substring(my_i+1,str.length());
            // System.out.println(temp);

            str = temp;
            
        }
        return answer;
    }
}