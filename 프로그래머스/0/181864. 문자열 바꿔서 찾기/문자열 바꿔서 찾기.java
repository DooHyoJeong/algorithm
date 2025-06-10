class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newMyString = "";
        for(int i = 0 ; i < myString.length();i++){
            if(myString.charAt(i) == 'A'){
                newMyString += "B";
            }else{
                newMyString +="A";
            }
        }
        if(newMyString.contains(pat)){
            return 1;
        }
        return answer;
    }
}