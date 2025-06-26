class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replace(" ", "");
        String[] poliList = polynomial.split("\\+");
        int x= 0,n=0;
        for(String i : poliList){
            if(i.contains("x")){
                String num = i.replace("x", "");
                x+= num.equals("") ? 1:Integer.valueOf(num);
            }else{
                n+=Integer.valueOf(i);
            }
        }
        if (x != 0 && n != 0) {
            answer = (x == 1 ? "x" : x + "x") + " + " + n;
        } else if (x != 0) {
            answer = x == 1 ? "x" : x + "x";
        } else if (n != 0) {
            answer = String.valueOf(n);
        } else {
            answer = "0";
        }        
        return answer;
    }
}
