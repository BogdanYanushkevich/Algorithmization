package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask2 {

    // 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

    public static void main(String[] args) {

        int n;
        int[][] a;


        n = 10;
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a.length; j++) {

                a[i][j] = (int) (Math.random() * n);

                System.out.print(a[i][j] + "\t");

            }
        }


        System.out.println("\n");
        System.out.println("1d:" + "\t" + "2d:");

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i][i] + "\t");

            System.out.print(a[n - 1 - i][i] + "\n");
        }

        System.out.println();

    }
}