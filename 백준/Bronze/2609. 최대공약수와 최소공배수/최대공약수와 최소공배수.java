import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static BigInteger lcm(BigInteger n1,BigInteger n2){
        return n1.multiply(n2).divide(n1.gcd(n2));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        BigInteger n1 = new BigInteger(st.nextToken());
        BigInteger n2 = new BigInteger(st.nextToken());
        //두 수의 최대 공약수와 최소 공배수를 출력
        BigInteger gcd = n1.gcd(n2);
        BigInteger lcm = lcm(n1,n2);
        StringBuilder sb = new StringBuilder();
        sb.append(gcd + "\n" + lcm);
        
        System.out.println(sb);
    }
}
