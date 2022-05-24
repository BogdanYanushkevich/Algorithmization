package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask9 {

    /* 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму. */

    public static void main(String[] args) {


        int n;
        int max;
        int[][] a;
        int[] sum;


        n = 10;
        max = 0;
        a = new int[n][n];
        sum = new int[a.length];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                a[i][j] = (int) (Math.random() * n);

            }
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                sum[i] += a[j][i];

            }
        }

        for (int i = 0; i < a.length; i++) {

            if (sum[i] > max) {

                max = sum[i];
            }
        }


        System.out.println("Максимальное число : " + "\t" + max + "\n");


        for (int i = 0; i < a.length; i++) {

            if (max == sum[i]) {

                System.out.println("Находиться в столбце :" + "\t" + i);
            }
        }

    }
}
