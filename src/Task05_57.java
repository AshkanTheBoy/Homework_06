public class Task05_57 {
/*
Известны оценки двух учеников по четырем предметам. Определить сумму
оценок каждого ученика.
 */
    public static void main(String[] args) {
        int[] student1Marks = {7,5,10,2};
        int[] student2Marks = {4,9,1,5};
        int sum = 0;
        for (int mark : student1Marks) {
            sum+=mark;
        }
        System.out.println(sum);
        for (int mark : student2Marks) {
            sum+=mark;
        }
        System.out.println(sum);
    }
}
