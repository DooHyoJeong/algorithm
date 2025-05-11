import java.io.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static int person_count(int floor, int room){
        int room_arry[] = new int[room];
        int temp_room_arry[] = new int[room];

        for(int i = 0; i<room;i++){
            room_arry[i] = i+1;
        }
//        for(int i : room_arry){
//            System.out.print(i+" ");
//        }
//        System.out.println();
        for(int i=0; i<floor; i++){
            for(int j=0; j < room; j++){
                if(j == 0){
                    temp_room_arry[j] = room_arry[j];
                    continue;
                }
//                System.out.print(temp_room_arry[j-1]+" " + room_arry[j]+"\n");
                temp_room_arry[j] = temp_room_arry[j-1] + room_arry[j];

            }

            room_arry = temp_room_arry;
//            for(int j : room_arry){
//                System.out.print(j+" ");
//            }
//            System.out.println();
        }
//        System.out.println(room_arry[room-1]);
        return room_arry[room-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_count = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < test_count; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            sb.append(person_count(floor, room) + "\n");

//            person_count(floor,room);
        }
        System.out.println(sb);
    }
}