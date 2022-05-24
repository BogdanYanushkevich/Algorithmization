package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask10 {

    // 10. Найти положительные элементы главной диагонали квадратной матрицы.

    public static void main(String[] args) {

        int n;
        int[][] a;


        n = 10;
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                a[i][j] = (int) (Math.random() * n - (n / 2));

            }
        }


        System.out.print("Положительные эллементы главной диагонали : ");

        for (int i = 0; i < a.length; i++) {

            if (a[i][i] >= 0) {

                System.out.print("\t" + a[i][i] + "; ");
            }

        }
    }
}
