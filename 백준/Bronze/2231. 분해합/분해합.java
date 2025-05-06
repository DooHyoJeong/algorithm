import java.io.*;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static int creator(int n){
        int tmp = n;
        int digit_ten = 10;
        int ten_mul = 0;
        int result =0;
        while(true){
            if(tmp/digit_ten == 0){
                ten_mul++;
                break;
            }else{
                ten_mul++;
                tmp /= digit_ten;

            }
        }
//        System.out.println(ten_mul);

        int start = ten_mul*9;
        if(n-start < 0){
            start = 0;
        }else{
            start = n-start;
        }
        boolean hasCreator = false;
        for (int i = start ; i <= n; i++) {
            tmp = i;
            List<Integer> digits = new ArrayList<>();
            digits.add(i);
            while(true){
                if(tmp/digit_ten == 0){
                    digits.add(tmp%digit_ten);
                    break;
                }else{
                    digits.add(tmp%digit_ten);
                    tmp /= digit_ten;

                }
            }
//            System.out.println(digits);
            int sum = 0;
            for(int j: digits){
                sum +=j;
            }
//            System.out.println(sum);
            if(sum == n){
                result = digits.get(0);
//                System.out.println(digits.get(0));
                hasCreator = true;
                break;
            }

            digits.clear();

        }
        if(!hasCreator) {
            result =0;
//            System.out.println(0);
        }
        return result;
    }
    public static int creator_modify(int n){
        int result =0;
        for(int i = Math.max(0,n-9*(String.valueOf(n).length()));i<n;i++){
            int sum = i;
            int tmp = i;
            while(tmp > 0){
                sum+=tmp%10;
                tmp /=10;
            }
            if(sum==n){
                result=i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //자리수가 뭔지 알아야함 그래야 자리수별로 더하지-> 배열로 만들어서 저장->가 아니고 그냥 문자열로 봐도 됐었음;
        System.out.println(creator_modify(n));

    }
}
