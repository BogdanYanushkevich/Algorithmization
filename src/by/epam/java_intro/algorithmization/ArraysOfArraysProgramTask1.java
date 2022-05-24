package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask1 {

    // 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

    public static void main(String[] args) {

        int n;
        int[][] a;


        n = 10;
        a = new int[n][n];



        for (int i = 0; i < a.length; i++) {

            for(int j = 0; j < a.length; j++) {

                a[i][j] = (int) (Math.random() * n);

            }
        }


        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a.length; j++) {

                if (j % 2 == 0 && a[0][j] > a[n-1][j]) {
                    System.out.print(a[i][j] + "\t");

                }
            }
        }

    }
}
