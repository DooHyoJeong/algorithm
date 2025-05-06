import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int count = 1;
        int max = 1;
        while(n > max){
            max+=6*count;
            count++;
        }
//        int start = 1;
//        int count = 0;
//        while(n > 0){
//            n-=start;
//            count++;
//            if(start == 1){
//                start +=5;
//            }else{
//                start += 6;
//            }
//
//        }
        System.out.println(count);
    }
}