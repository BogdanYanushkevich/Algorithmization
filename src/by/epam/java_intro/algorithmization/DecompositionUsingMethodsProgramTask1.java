package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask1 {

    /* 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
                 (                    A * B       )
                 (  HOK(A , B) = --------------   )
                 (                HOD (A , B )    )


     */

    public static int greatestCommonDivisor(int a, int b) {

        int c;
        int temp;


        c = 0;


        if (b > a) {

            temp = a;
            a = b;
            b = temp;

        }

            for (int i = a; i > 0; i--) {

                for (int j = b; j > 0; j--) {

                    if (a % i == 0 && b % j == 0 && i == j) {

                        c = i;

                        return c;
                    }

                }

            }
        return c;
    }


    public static int greatestCommonMultiple(int a, int b) {

        int greatestCommonMultiple;

        greatestCommonMultiple = (a * b) / greatestCommonDivisor(a, b);

        return greatestCommonMultiple;
    }



    public static void main(String[] args) {


        int a;
        int b;
        int greatestCommonDivisor;
        int greatestCommonMultiple;

        a = 578;
        b = 12;


        greatestCommonDivisor = greatestCommonDivisor(a, b);
        greatestCommonMultiple = greatestCommonMultiple(a, b);


        System.out.println("Результат НОД : " + greatestCommonDivisor);
        System.out.println("Результат НОК : " + greatestCommonMultiple);

    }

}















