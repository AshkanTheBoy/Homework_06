import java.util.Arrays;
/*
Составить программу:
а) заменяющую значение любого элемента пятой строки двумерного массива
числом 1949;
 */
public class Task12_07 {
    public static void main(String[] args) {
        //12_7
        int[][] asd = new int[10][10];
        int i,j;
        for (i=0; i<asd.length; ++i) {
            for (j=0; j<asd[0].length; ++j) {
                asd[i][j] = j+(i*10)+1;
            }
            System.out.println(Arrays.toString(asd[i]));
        }

        int n = 57;
        int n1 = (n-1)/10;
        int n2 = (n-1)%10;
        asd[n1][n2] = 1949;
        System.out.println();
        for (i=0; i<asd.length; ++i) {
            System.out.println(Arrays.toString(asd[i]));
        }
        System.out.println(asd[n1][n2]);
    }
}
