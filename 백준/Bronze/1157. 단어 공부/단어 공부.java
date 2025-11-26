import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        String s_n = n.toUpperCase();
        int[] cnt = new int[26];

        // 빈도수 계산
        for (int i = 0; i < s_n.length(); i++) {
            char c = s_n.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                cnt[c - 'A']++;
            }
        }

        int max = 0;
        int idx = -1;
        boolean duplicate = false;

        // 가장 많이 나온 알파벳 찾기
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                idx = i;
                duplicate = false;
            } else if (cnt[i] == max && max != 0) {
                duplicate = true;
            }
        }

        if (duplicate) {
            System.out.println("?");
        } else {
            System.out.println((char)(idx + 'A'));
        }
    }
}
