package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask4 {

    /* 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                                    1    2    3    ...   n
                                    n   n-1  n-2   ...   1
                                    1    2    3    ...   n
                                    n   n-1  n-2   ...   1
                                    .    .    .     .   ...
                                    n   n-1  n-2   ...   1              */

    public static void main(String[] args) {


        int n;
        int[][] a;


        n = 10;
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (i % 2 == 0) {

                    a[i][j] = j + 1;
                }
                if (i % 2 != 0) {

                    a[i][j] = n - j;
                }

            }
        }

        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j] + "\t");

            }
        }


    }
}
