public class Task5_65 {
/*
В области 12 районов.
Известны количество жителей каждого района (в тысячах человек)
и плотность населения в нем (тыс. чел./км^2).
Определить общую площадь территории области.
 */
    public static void main(String[] args) {
        double[] people = {1024, 1055, 166, 1771, 1991, 766, 433, 355, 1000, 1122, 1234, 156};
        double[] density = {12, 15, 16, 11, 123, 166, 77, 89, 123, 144, 100, 1};
        double area = 0;
        for (int count=0; count<12; ++count) {
            area = people[count]/density[count];
            System.out.printf("|%.2f| ",area);
        }
        System.out.println();
        System.out.printf("|%.2f|",area);

    }
}
