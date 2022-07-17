import java.util.Arrays;

public class TranspozeDevrik {
    public static void main(String[] args) {

        int [][] list = new int[2][3];
        int [][] list2 = new int [3][2];

        int number = 1;

        for (int i = 0; i<list.length; i++){
            for (int j = 0; j<list[i].length; j++){
                list[i][j] = number++;
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i<list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = list[j][i];
                System.out.print(list2[i][j] + " ");
            }

            System.out.println();
        }
    }
}
