package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask14 {

    /* 14. Сформировать случайную матрицу n x m, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца. */

    public static void main(String[] args) {

        int n;
        int m;
        int[][] a;


        do {
            n = 1 + (int) (Math.random() * 9);
            m = 1 + (int) (Math.random() * 9);
        }
        while (n < m);


        a = new int[n+1][m];


        for (int i = 0; i < a[i].length; i++) {

            for (int j = 0; j < i; j++) {

                a[j][i] = 1;

            }
        }

        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + "\t");

            }
        }

    }
}