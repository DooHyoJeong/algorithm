import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(numeratorPN(N));
    }

    static long numeratorPN(int N) {
        if (N == 0) return 1; 
        if (N == 1) return 1; 

        long a = 1; 
        long b = 1; 

        for (int i = 3; i <= N + 1; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        return b;  
    }
}