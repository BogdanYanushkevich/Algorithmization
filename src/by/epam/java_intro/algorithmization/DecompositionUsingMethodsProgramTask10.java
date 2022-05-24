package by.epam.java_intro.algorithmization;

import java.util.Arrays;

public class DecompositionUsingMethodsProgramTask10 {

    /* 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    являются цифры числа N.            */


    //Метод подсчитывает колличество цифр в числе N.

    public static int numOfDigits (int n){

        int count = 0;

        for (int i = 0; n != 0; i++){

            count++;

            n = n / 10;

        }
            return count;
    }


    //Метод заполненяет массив цифрами из числа N.

    public static int[] array(int n) {

        int[] d;
        d = new int[numOfDigits(n)];

        for (int i = 0; i < d.length; i++) {

            d[d.length - i - 1] = n % 10;

            n = n / 10;

        }

        return d;
    }


    public static void main(String[] args) {

        int n;

        n = 2134152350;


        System.out.println(Arrays.toString(array(n)));

    }
}
