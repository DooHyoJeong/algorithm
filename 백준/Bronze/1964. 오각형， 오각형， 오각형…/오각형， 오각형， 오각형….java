import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static final long MOD = 45678;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long a = 3 * n * n + 5 * n + 2;

        // 분자 먼저 2로 나눔 (짝수 보장)
        a /= 2;

        System.out.println(a % MOD);
    }
}
