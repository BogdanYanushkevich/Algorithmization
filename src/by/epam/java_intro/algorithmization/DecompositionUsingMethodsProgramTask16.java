package by.epam.java_intro.algorithmization;

import java.util.Arrays;

public class DecompositionUsingMethodsProgramTask16 {


    /* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/


    //Метод  создаёт массив длины n.

    public static int[] arraynLength(int n) {

        int[] a;

        a = new int[n];

        return a;
    }


    //Метод заполняет и возвращает массив длины n c наименьшими положительными нечётными цифрами.

    public static int[] fillMinNum(int[] a) {

        Arrays.fill(a, 1);

        return a;
    }

    //Метод заполняет и возвращает массив длины n c наибольшими положительными нечётными цифрами.

    public static int[] fillMaxNum(int[] a) {

        Arrays.fill(a, 9);

        return a;
    }


    //Метод склеивает и возвращает из всех чисел массива одно число.

    public static int glueNum(int[] a) {

        int num;

        num = 0;


        for (int i = 0; i < a.length; i++) {

            num += a[i] * Math.pow(10, (a.length - 1 - i));

        }

        return num;
    }

    //Метод проверяет числа на содержание только нечтных цифр.

    public static boolean onlyOddNum(int n) {


        boolean isOnlyOdd;
        isOnlyOdd = true;


        for (int i = n; i > 0; i /= 10) {

            if (i % 2 == 0) {
                isOnlyOdd = false;
                break;
            }

        }


        return isOnlyOdd;
    }

    //Метод  циклично суммирует все нечётные числа длины n.

    public static long sumOfOddNumbers(int n) {

        String  s = "Число n не может быть меньше 0 или привышать 9";

        int minNum;
        int maxNum;
        long sum;


        if (n <= 0 || n > 9){
            System.out.println(s);
            return 0;
        }


        minNum = glueNum(fillMinNum(arraynLength(n)));
        maxNum = glueNum(fillMaxNum(arraynLength(n)));
        sum = 0;


        for (int i = minNum; i <= maxNum; i += 2) {

            if (onlyOddNum(i)) {
                sum += i;
            }

        }

        return sum;
    }

    //Метод проверяет число на колличество чётных цифр.

    public static int howManyEvenNum(long n) {


        int evenCount;

        evenCount = 0;

        for (long i = n; i > 0; i /= 10) {

            if (i % 2 == 0) {

                evenCount++;

            }

        }

        return evenCount;
    }


    public static void main(String[] args) {

        int n;
        long sumOfOdd;
        int evenNumInRes;

        n = 7;
        sumOfOdd = sumOfOddNumbers(n);
        evenNumInRes = howManyEvenNum(sumOfOdd);

        System.out.println("В n значном числе сумма чисел с нечётными цифрами : " + sumOfOdd + "\n"
                + "Колличество нечётных цифр в результате : " + evenNumInRes);

    }
}