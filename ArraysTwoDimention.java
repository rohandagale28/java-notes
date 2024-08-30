
import java.util.*;

class ArraysTwoDimention {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] number = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        int searchInt = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (number[i][j] == searchInt) {
                    System.out.print(i);
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
