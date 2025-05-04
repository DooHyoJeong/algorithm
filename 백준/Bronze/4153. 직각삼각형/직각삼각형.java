import java.io.*;
import java.util.*;
import java.lang.Math;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static String isTriangle(int a, int b, int c){
        int[] numList = {a,b,c};
        Arrays.sort(numList);
        if(Math.pow(numList[2],2) == Math.pow(numList[0],2)+Math.pow(numList[1],2)){
            return "right\n";
        }else{
            return "wrong\n";
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            if(n1 == 0 && n2 == 0 && n3 == 0){
                System.out.println(sb);
                break;
            }
            sb.append(isTriangle(n1,n2,n3));

        }

    }
}