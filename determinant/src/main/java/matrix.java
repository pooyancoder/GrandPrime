import java.util.Scanner;

public class matrix {
    private int size;
    public int [][] table = new int[size][size];

    public int getSize(){
        return size;
    }
    //first constructor
    public matrix(int size){
        this.size = size;
        table = new int[size][size];
        Scanner Scanner = new Scanner(System.in);
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.println("enter mat ["+i+"]["+j+"]");
                table[i][j] = Scanner.nextInt();
            }
        }
        Scanner.close();
    }


    //second constructor
    public matrix(int size,int[][]tab,int ignore){
        this.size = size - 1;
        table = new int[this.size][this.size];
        int row = 0;
        for (int i = 0; i < size; i++) {
            if (i == ignore) continue;
            int col = 0;
            for (int j = 0; j < size; j++) {
                if (j == ignore) continue;
                table[row][col] = tab[i][j];
                col++;
            }
            row++;
        }
    }

}
