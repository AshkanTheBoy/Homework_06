import java.util.Arrays;
/*
[1, 0, 0, 1, 0, 0, 1]
[0, 1, 0, 1, 0, 1, 0]
[0, 0, 1, 1, 1, 0, 0]
[1, 1, 1, 1, 1, 1, 1]
[0, 0, 1, 1, 1, 0, 0]
[0, 1, 0, 1, 0, 1, 0]
[1, 0, 0, 1, 0, 0, 1]
 */

public class Task12_23b {
    public static void main(String[] args) {
        int[][] asd = new int[9][9];
        int i,j;
        for (i=0; i<asd.length; ++i) {
            for (j=0; j<asd.length; ++j) {
                asd[i][i] = 1;
                asd[i][asd.length-1-i] = 1;
                asd[i][(asd.length-1)/2] = 1;
                asd[(asd.length-1)/2][j] = 1;
            }
            System.out.println(Arrays.toString(asd[i]));
        }
    }
}
