package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask2 {

    /* 2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
    числом. Подсчитать количество замен.*/

    public static void main(String[] args) {


        int n;
        double z;
        int counter;
        double[] a;


        n = 45;
        z = 34.5;
        counter = 0;
        a = new double[n];


        for (int i = 0; i < a.length; i++) {

            a[i] = i;
        }


        for (int i = 0; i < a.length; i++) {

            if (a[i] > z) {

                a[i] = z;

                counter++;

                System.out.print(a[i] + "\t");
            }
        }


        System.out.println();

        System.out.println("Количество замен : " + counter);


    }
}
