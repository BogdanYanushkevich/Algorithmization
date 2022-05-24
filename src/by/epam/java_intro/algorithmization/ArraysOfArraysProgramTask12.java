package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask12 {

    // 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

    public static void main(String[] args) {


        int n;
        int temp;
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


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                for (int k = j + 1; k < a.length; k++) {

                    if (a[i][j] > a[i][k]) {

                        temp = a[i][j];

                        a[i][j] = a[i][k];

                        a[i][k] = temp;
                    }
                }

            }
        }


        System.out.println("\n");

        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j] + "\t");

            }

        }
    }
}
