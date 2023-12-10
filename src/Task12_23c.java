import java.util.Arrays;
/*
[1, 1, 1, 1, 1, 1, 1]
[0, 1, 1, 1, 1, 1, 0]
[0, 0, 1, 1, 1, 0, 0]
[0, 0, 0, 1, 0, 0, 0]
[0, 0, 1, 1, 1, 0, 0]
[0, 1, 1, 1, 1, 1, 0]
[1, 1, 1, 1, 1, 1, 1]
 */
public class Task12_23c {
    public static void main(String[] args) {
        int[][] mainArray = new int[7][7];
        int yCord,xCord;
        int indexRange = mainArray.length-1;
        for (yCord=0; yCord<mainArray.length; ++yCord) {
            //строит пирамиду от 0 до 3
            for (xCord=yCord; xCord<mainArray.length-yCord; ++xCord) {
                mainArray[yCord][xCord] = 1;
            }
            //строит пирамиду от 6 до 3
            for (xCord=indexRange; xCord+1>yCord*2; --xCord) {
                mainArray[indexRange-yCord][indexRange-xCord+yCord] = 1;
            }
            System.out.println(Arrays.toString(mainArray[yCord]));
        }
    }
}
