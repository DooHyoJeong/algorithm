import java.io.*;
import java.util.*;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
//        System.out.println(str + " " + str.length());
        int r = 31;
        int M = 1234567891;
        long hash =0;
        long pow = 1;
        for(int i=0;i<L;i++){
            char ch = str.charAt(i);
            int value;

            if (Character.isUpperCase(ch)) {
                value = ch - 'A' + 1;  // A~Z → 1~26
            } else {
                value = ch - 'a' + 1;  // a~z → 1~26
            }
            hash = (hash+value * pow) % M;
            pow = (pow*r)%M;

        }
        System.out.println(hash);

    }
}