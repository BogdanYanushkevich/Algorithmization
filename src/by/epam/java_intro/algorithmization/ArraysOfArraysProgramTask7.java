package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask7 {

    /* 7. Сформировать квадратную матрицу порядка N по правилу:
                                    2   2
                                (  I - J  )
                A[I][J] =   sin (---------)
                                (    N    )

        и подсчитать количество положительных элементов в ней.

     */

    public static void main(String[] args) {


        int n;
        int count;
        double formula;
        double[][] a;


        n = 10;
        count = 0;
        a = new double[n][n];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                formula = Math.sin(((i * i) - (j * j)) / n);

                a[i][j] = formula;

                if (a[i][j] > 0) {

                    count++;
                }

            }
        }

        System.out.println();
        System.out.print("Количество положительных элементов в матрице: " + count);

    }
}
