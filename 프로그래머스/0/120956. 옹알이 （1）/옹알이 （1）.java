class Solution {
    public int solution(String[] babbling) {
                int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            String prev = "";
            String temp = b;

            boolean isValid = true;

            for (String w : words) {
                // 연속된 동일 단어는 불가능하므로 "w+w"가 있으면 invalid
                if (temp.contains(w + w)) {
                    isValid = false;
                    break;
                }
            }

            if (!isValid) continue;

            for (String w : words) {
                temp = temp.replace(w, " ");
            }

            temp = temp.replace(" ", "");

            if (temp.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}