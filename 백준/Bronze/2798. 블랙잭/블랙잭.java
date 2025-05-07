import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] n_list = new int[N];
        for(int i = 0 ; i < N;i++){
            n_list[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(n_list);
        int candidate = 0;
//        for(int i : n_list){
//            System.out.print(i + " ");
//        }
//        System.out.println();
        for(int i = 0; i < n_list.length-2;i++){
            for(int j = i+1; j < n_list.length-1;j++){
                for (int k = j+1; k < n_list.length;k++){
                    int sum =0;
                    sum += (n_list[i])+(n_list[j])+(n_list[k]);
                    if(sum > M){
                        continue;
                    }
                    else if(Math.abs(sum-M) < Math.abs(candidate-M)){
//                        System.out.println("*바꿈*");
                        candidate = sum;
//                        System.out.println(sum);
//                        System.out.println(candidate);

                    }else if(sum-M == 0){
                        break;
                    }
                    else{
//                        System.out.println("*안바꿈*");
//                        System.out.println(sum);
//                        System.out.println(candidate);
                    }
                }
            }
        }
        System.out.println(candidate);

    }
}