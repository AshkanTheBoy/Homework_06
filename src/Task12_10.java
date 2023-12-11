import java.util.Arrays;
/*
Составить программу, которая меняет местами два любых элемента двумерного массива.
 */
public class Task12_10 {
    public static void main(String[] args) {
        //12_10
        int[][] asd = new int[10][10];
        int i,j;
        for (i=0; i<asd.length; ++i) {
            for (j=0; j<asd[0].length; ++j) {
                asd[i][j] = j+(i*10)+1;
            }
            System.out.println(Arrays.toString(asd[i]));
        }

        int n1 = 54;
        int n2 = 73;
        int n11 = (n1/10)-1;
        int n12 = (n1%10)-1;
        int n21 = (n2/10)-1;
        int n22 = (n2%10)-1;
        int firstPoint = asd[n11][n12]; // firstPoint = asd[4][3]
        int secondPoint = asd[n21][n22]; // secondPoint = asd[6][2]
        asd[n11][n12] = secondPoint;
        asd[n21][n22] = firstPoint;
        System.out.println();
        for (i=0; i<asd.length; ++i) {
            System.out.println(Arrays.toString(asd[i]));
        }
    }
}
