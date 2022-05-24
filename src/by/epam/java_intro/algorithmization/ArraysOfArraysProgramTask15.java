package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask15 {

    // 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

    public static void main(String[] args) {


        int n;
        int maxValue;
        int[][] a;


        n = 10;
        maxValue = 0;
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                a[i][j] = (int) (Math.random() * n * n);


            }
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[i][j] > maxValue) {

                    maxValue = a[i][j];
                }
            }
        }


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (j % 2 != 0) {

                    a[i][j] = maxValue;
                }

                if (i % 2 != 0) {

                    a[i][j] = maxValue;
                }
            }
        }

    }
}