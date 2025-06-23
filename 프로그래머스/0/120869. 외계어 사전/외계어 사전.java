class Solution {
        public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            boolean[] used = new boolean[spell.length];
            boolean isValid = true;

            for (int i = 0; i < spell.length; i++) {
                if (!word.contains(spell[i])) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                // 단어가 spell의 모든 알파벳을 포함함
                return 1;
            }
        }

        return 2; // 어떤 단어도 spell을 모두 포함하지 않음
    }
}