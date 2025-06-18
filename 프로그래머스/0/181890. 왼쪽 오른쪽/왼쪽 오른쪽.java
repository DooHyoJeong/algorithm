import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        int l_r_index=0;
        for(int i = 0 ; i < str_list.length ; i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){

                l_r_index=i;
                break;
            }
        }
        System.out.println(l_r_index);
        List<String> answerList = new ArrayList<>();
        if(str_list[l_r_index].equals("l")){
            for(int i =0; i < l_r_index; i++){
                answerList.add(str_list[i]);
            }
        }else if(str_list[l_r_index].equals("r")){
            for(int i =l_r_index+1; i < str_list.length; i++){
                answerList.add(str_list[i]);
            }
        }
        String[] answer=answerList.toArray(new String[0]);
        
        return answer;
    }
}