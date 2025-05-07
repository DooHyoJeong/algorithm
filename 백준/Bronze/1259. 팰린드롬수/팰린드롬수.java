import java.io.*;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static String isPal(String str){
        int end = str.length()-1;
        for(int i = 0; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(end)){
                return "no";
            }
            end--;
        }
        return "yes";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> str_list = new ArrayList<>();

        while(true){
            String str = br.readLine();
            if(str.equals("0") ){
                break;
            }
            sb.append(isPal(str)+"\n");

        }
        System.out.println(sb);
    }
}