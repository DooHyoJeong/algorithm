class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int flag = 0;
        while(true){
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                    flag++;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i]*2 +1;
                    flag++;
                }
            }
            // for(int i : arr){
            //     System.out.print(i + " ");
            // }
            // System.out.println();
            if(flag == 0){
                
                return answer;
            }else{
                answer++;
                flag=0;
            }
        }

    }
}