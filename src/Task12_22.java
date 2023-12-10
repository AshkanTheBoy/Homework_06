import java.util.Arrays;
/*
Заполнить двумерный массив результатами таблицы умножения (в первой
строке должны быть записаны произведения каждого из чисел от 1 до 9 на 1,
во второй — на 2, ..., в последней — на 9).
 */
public class Task12_22 {
    public static void main(String[] args) {
        int[][] asd = new int[9][9];
        int i,j;
        for (i=0; i<asd.length; ++i) {
            for (j=0; j<asd[0].length; ++j) {
                asd[i][j] = i;
            }
            System.out.println(Arrays.toString(asd[i]));
        }

        //12_22
        System.out.println();
        for (i=0; i<asd.length; ++i) {
            for (j=0; j<asd[0].length; ++j) {
                asd[i][j] = (j+1)*(i+1);
            }
            System.out.println(Arrays.toString(asd[i]));
        }
    }
}
