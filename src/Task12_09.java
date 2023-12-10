import java.util.Arrays;
/*
Дан двумерный массив. Поменять местами:
а) элементы, расположенные в правом верхнем и левом нижнем углах;
 */
public class Task12_09 {
    public static void main(String[] args) {
        //12_9
        int[][] asd = new int[10][10];
        int i,j;
        for (i=0; i<asd.length; ++i) {
            for (j=0; j<asd[0].length; ++j) {
                asd[i][j] = i;
            }
            System.out.println(Arrays.toString(asd[i]));
        }

        System.out.println();
        int topRight = asd[0][asd.length-1];
        int botLeft = asd[asd.length-1][0];
        asd[0][asd.length-1] = botLeft; //topRight = botLeft
        asd[asd.length-1][0] = topRight; // botLeft = topRight

        for (i=0; i<asd.length; ++i) {
            System.out.println(Arrays.toString(asd[i]));
        }
    }
}
