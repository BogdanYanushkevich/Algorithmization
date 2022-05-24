package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask6 {

    /* 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                                    1   1   1 ... 1    1    1
                                    0   1   1 ... 1    1    0
                                    0   0   1 ... 1    0    0
                                   ... ... .........  ...  ...
                                    0   1   1 ... 1    1    0
                                    1   1   1 ... 1    1    1               */

    public static void main(String[] args) {

        int n;
        int[][] a;


        n = 10;
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            if (i < n / 2) {

                for (int j = i; j < a.length - i; j++) {

                    a[i][j] = 1;
                }

            } else {

                for (int j = a.length - i - 1; j <= i; j++) {

                    a[i][j] = 1;
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
