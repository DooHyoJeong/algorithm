import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int count1 = 0;
    static int count2 = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        fib(n);
        fibo(n);
        System.out.println(count1 + " " + count2);
    }
    static int fib(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;

        }
        return fib(n - 1) + fib(n - 2);
    }
    static int fibo(int n) {
        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            count2++;                 // 코드2 한 번 실행
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}