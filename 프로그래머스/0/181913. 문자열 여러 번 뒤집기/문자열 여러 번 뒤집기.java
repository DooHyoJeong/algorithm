class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i = 0 ; i < queries.length; i++){
            //바꿀 str
            answer="";
            String sub = my_string.substring(queries[i][0],queries[i][1]+1);
            
            String subReverse = "";
            for(int j=sub.length()-1; j >=0 ; j--){
                subReverse += sub.charAt(j);
                
            }
            // System.out.println("sR :" + subReverse);
            // System.out.println("my :" + my_string);
            int k =0;

            for(int j = 0; j < my_string.length() ; j++){
                if(j >= queries[i][0] && j <= queries[i][1]){
                    answer+=subReverse.charAt(k);
                    k++;
                }else{
                    answer+=my_string.charAt(j);
                }
            }
            my_string = answer;
            
            // System.out.println(answer);
        }
        return answer;
    }
}