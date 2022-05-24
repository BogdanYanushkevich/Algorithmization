package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask5 {

    /* 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
                                     1   1   1 ... 1    1    1
                                     2   2   2 ... 2    2    0
                                     3   3   3 ... 3    0    0
                                     ... ... .........  ...  ...
                                     n-1 n-1 0 ... 0    0    0
                                     n   0   0 ... 0    0    0               */

    public static void main(String[] args) {


        int n;
        int[][] a;


        n = 10;
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - i; j++) {

                a[i][j] = i + 1;

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




