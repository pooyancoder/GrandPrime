import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter MAX_DAY!");
        int max_day;
       boolean catched = false;
       do {
           max_day = Scanner.nextInt();
           if(max_day>0 && max_day<99)
               catched =true;
       }while(!catched);
//        String max_Day = String.valueOf(max_day);
        if(max_day <= 10){
            System.out.println("0 1 2 3 4 5\n6 7 8 9  0 1");
        }else if(max_day >= 33){
            System.out.println(-1);
        } else if (max_day <= 30) {
            System.out.println("1 2 4 6 8 0\n1 3 7 5 9 2");
        } else{
            System.out.println("1 2 3 4 5 6\n1 2 0 7 8 9");
        }

    }
}
