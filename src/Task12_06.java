import java.util.Arrays;
/*
. Дан двумерный массив. Вывести на экран:
а) все элементы второго столбца массива;
б) все элементы m-й строки массива.
 */
public class Task12_06 {
    public static void main(String[] args) {
        //12_6
        int[][] asd = new int[10][10];
        int i,j;
        for (i=0; i<asd.length; ++i) {
            for (j=0; j<asd[0].length; ++j) {
                asd[i][j] = i;
            }
            System.out.println(Arrays.toString(asd[i]));
        }

        //a
        int n = 2;
        for (i=0; i<asd[n].length; i++) {
            System.out.print(asd[i][n-1]);
        }
        System.out.println();
        //b
        int m = 6;
        for (i=0; i<asd[n].length; i++) {
            System.out.print(asd[m][i]);
        }
    }
}
