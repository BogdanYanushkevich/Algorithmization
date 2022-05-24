package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask11 {

/* 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
   которых число 5 встречается три и более раз */

    public static void main(String[] args) {


        int n;
        int m;
        int fiveCounter;
        int[][] a;


        n = 10;
        m = 20;
        a = new int[n][m];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = (int) (Math.random() * 16);

            }
        }

        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + "\t");

            }
        }


        System.out.println("\n");


        for (int i = 0; i < a.length; i++) {

            fiveCounter = 0;

            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] == 5) {
                    fiveCounter++;
                }

            }

            if (fiveCounter > 2) {

                System.out.println("Строка в которой число 5 встречается более 3-х раз : " + i + "\t");

            }
        }


    }
}

