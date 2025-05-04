import java.io.*;
import java.util.*;
public class Main {
    static String minT(List<Integer> num_list,int T){
        int minT_n = 0;
        for(int i =0;i<num_list.size();i++){
            if(num_list.get(i)%T == 0){
                minT_n = minT_n + (num_list.get(i)/T);
            }else{
                minT_n = minT_n + (num_list.get(i)/T) + 1;
            }

        }
//        System.out.println(minT_n);
        return String.valueOf(minT_n);
    }
    static String minP(int n, int p){
        int p1= n / p;
        int p2 = n % p;
        return p1 + " " + p2;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Integer> size_n = new ArrayList<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        while(st1.hasMoreTokens()){
            size_n.add(Integer.parseInt(st1.nextToken()));

        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());
        sb.append(minT(size_n,T)+"\n");
        sb.append(minP(n,P));
        System.out.println(sb);
    }
}