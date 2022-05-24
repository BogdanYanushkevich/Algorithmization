package by.epam.java_intro.algorithmization;

import java.util.Scanner;

public class ArraysOfArraysProgramTask8 {

    /*8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры.     */

    public static int scan(String numOfColumn, int n) {


        int variable;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.print(numOfColumn);

            while (!sc.hasNextInt()) {
                System.out.print(numOfColumn);
                sc.next();
            }
            variable = sc.nextInt();

        } while (variable < 0 || variable > n - 1);

        return variable;

    }


    public static void main(String[] args) {


        int n;
        int temp;
        int column1;
        int column2;
        int[][] a;


        n = 10;
        System.out.println("Введите номер стоблца для замены от 0 до " + (n-1) + "\n");
        column1 = scan("Введите номер стоблца >>> ", n);
        column2 = scan("Введите номер стоблца для замены >>> ", n);
        a = new int[n][n];


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                a[i][j] = j;

            }
        }


        for (int i = 0; i < a.length; i++) {

            temp = a[i][column1];

            a[i][column1] = a[i][column2];

            a[i][column2] = temp;

        }


        for (int i = 0; i < a.length; i++) {

            System.out.println();

            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j] + "\t");
            }
        }

    }
}



