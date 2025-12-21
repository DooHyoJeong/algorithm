import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String x = st.nextToken();
        String y = st.nextToken();
        StringBuilder x_r = new StringBuilder();
        StringBuilder y_r= new StringBuilder();
        StringBuilder out = new StringBuilder();
        for(int i = x.length()-1 ; i >= 0 ; i--){
            x_r.append(x.charAt(i));

        }
        for(int i = y.length()-1 ; i >= 0 ; i--){
            y_r.append(y.charAt(i));
        }
        int result = Integer.parseInt(x_r.toString()) + Integer.parseInt(y_r.toString());

        StringBuilder result_r = new StringBuilder(String.valueOf(result));
        for(int i = result_r.length()-1 ; i >= 0 ; i--){
            out.append(result_r.charAt(i));
        }
        System.out.println(Integer.parseInt(out.toString()));

    }
}