import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Set<String> chatLog = new HashSet<>();

        int answer = 0;

        for (int i = 0; i < count; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                chatLog.clear();
            } else {
                if (!chatLog.contains(input)) {
                    answer++;
                    chatLog.add(input);
                }
            }
        }
        System.out.println(answer);
    }
}