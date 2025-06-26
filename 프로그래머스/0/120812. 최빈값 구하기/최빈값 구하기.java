class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arrayCount = new int[1000];
        for(int i : array){
            arrayCount[i]++;
        }
        int maxCount = 0;
        int maxValue = -1;
        for (int i = 0; i < arrayCount.length; i++) {
            if (arrayCount[i] > maxCount) {
                maxCount = arrayCount[i];
                maxValue = i;
            }
        }

        // 동일한 최빈값이 또 있는지 검사
        int count = 0;
        for (int i = 0; i < arrayCount.length; i++) {
            if (arrayCount[i] == maxCount) {
                count++;
            }
        }

        return (count > 1) ? -1 : maxValue;
    }
}