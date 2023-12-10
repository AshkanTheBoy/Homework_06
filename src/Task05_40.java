public class Task05_40 {
/*
Даны натуральное число n и вещественные числа.
Определить сумму всех вещественных чисел.
*/
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;
        for (int a=1; a<=n; a++) {
            sum+=a;
            System.out.println(a);
        }
    }
}
