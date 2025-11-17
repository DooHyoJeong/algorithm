class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int[] clothes = new int[n + 1];

        // 1. 기본 1벌
        for(int i = 1; i <= n; i++){
            clothes[i] = 1;
        }

        // 2. 여벌 학생 +1
        for(int r : reserve){
            clothes[r]++;
        }

        // 3. 잃어버린 학생 -1
        for(int l : lost){
            clothes[l]--;
        }

        // 4. 빌려주기 (앞 → 뒤 순서)
        for(int i = 1; i <= n; i++){
            if(clothes[i] == 0){
                // 앞 번호가 빌려줄 수 있으면
                if(i - 1 >= 1 && clothes[i-1] == 2){
                    clothes[i-1]--;
                    clothes[i]++;
                }
                // 뒤 번호가 빌려줄 수 있으면
                else if(i + 1 <= n && clothes[i+1] == 2){
                    clothes[i+1]--;
                    clothes[i]++;
                }
            }
        }

        // 5. 1벌 이상 있는 학생 수 세기
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(clothes[i] >= 1) answer++;
        }

        return answer;
    }
}
