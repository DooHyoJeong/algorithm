import java.io.*;
import java.util.*;
import java.lang.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        //1. BufferedReader로 InputStreamReader(System.in)을 받는다.
        //2(정수). readLine을 사용하여, Integer.parseInt로 int형으로 변환
        //2(배열)-1. readLine 사용하여 StringTokenizer를 사용
        //2(배열)-2. for문 사용하여 integer.parseInt(st.nextToken())사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numList = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(isPrime(numList[i])){
                count ++;
            }
        }
        System.out.println(count);

    }
}