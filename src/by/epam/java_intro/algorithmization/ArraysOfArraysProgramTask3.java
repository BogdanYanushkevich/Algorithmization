package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask3 {

    // 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

    public static void main(String[] args) {


        int n;
        int k;
        int p;
        int[][] a;


        n = 10;
        k = 3;
        p = 4;
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a.length; j++) {

                a[i][j] = (int) (Math.random() * n);

                System.out.print(a[i][j] + "\t");

            }
        }


        System.out.println("\n");

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[k][i] + "\t");
        }


        System.out.println();


        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a.length; j++) {

                if (j == p) {
                    System.out.print(a[i][p] + "\t");
                }
            }
        }

    }
}