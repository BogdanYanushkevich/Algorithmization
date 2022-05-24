package by.epam.java_intro.algorithmization;

import java.util.Arrays;

public class DecompositionUsingMethodsProgramTask5 {

    /*5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
    которое меньше максимального элемента массива, но больше всех других элементов). */

    //Метод генерирует массив заполненный случайными числами.

    public static int[] generateArray(int n) {

        int[] a;
        a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = (int) (Math.random() * i);

        }

        return a;
    }


    // Метод находит наибольшее число в массиве.

    public static int searchLargestNum(int[] array) {

        int maxNum;

        maxNum = Integer.MIN_VALUE;



        for (int i = 0; i < array.length; i++) {

            if (maxNum < array[i]) {
                maxNum = array[i];

            }
        }

        return maxNum;
    }

    // Метод находит следующее за наибольшим число в массиве.

    public static int searchSecondLargestNum(int[] array, int maxNum) {

        int secMaxNum;

        secMaxNum = 0;

        for (int i = 0; i < array.length; i++) {

            if (maxNum > array[i] && secMaxNum <= array[i]) {
                secMaxNum = array[i];

            }
        }
        return secMaxNum;
    }


    public static void main(String[] args) {

        int n;
        int[] a;
        int secMaxNum;

        n = 20;
        a = generateArray(n);
        secMaxNum = searchSecondLargestNum(a, searchLargestNum(a));


        System.out.println(Arrays.toString(a));
        System.out.println("Второе по величине число в массиве : " + secMaxNum);


    }
}
