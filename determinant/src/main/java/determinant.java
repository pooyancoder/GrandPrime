import java.util.Scanner;

public class determinant {
    public static void main(String[] args) {

        System.out.println("enter your matrix size!");
        Scanner Scanner = new Scanner(System.in);
        matrix M1 = new matrix(Scanner.nextInt());
        System.out.println("M1 determinant equals  "+det(M1));
    }
    static int det(matrix m){
        if(m.getSize() == 1){
            return m.table[0][0];
        }
        if (m.getSize() == 2) {
            return m.table[0][0] * m.table[1][1] - m.table[0][1] * m.table[1][0];
        }
        else{
            int sum=0;
            for (int i = 0; i <m.getSize() ; i++) {
                sum += (i%2 == 0 ? m.table[0][i]*det(new matrix(m.getSize(), m.table,i)): -m.table[0][i]*det(new matrix(m.getSize(), m.table,i)));
            }
            return sum;
        }
    }
}
