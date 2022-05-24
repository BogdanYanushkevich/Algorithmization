package by.epam.java_intro.algorithmization;

import java.util.Arrays;

public class OneDimensionalArraySortingProgramTask7 {

    /* 7. Пусть даны две неубывающие последовательности действительных чисел  a1 <= a2 <=  .. an и b1 <= b2 <= .. bm .
    Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= .. bm в первую
    последовательность так, чтобы новая последовательность оставалась возрастающей.  */

    public static void main(String[] args) {


        int n;
        int m;
        int count;
        double[] arrayA;
        double[] arrayB;


        n = 15;
        m = 13;

        count = 0;
        arrayA = new double[n];
        arrayB = new double[m];


        for (int i = 0; i < arrayA.length; i++) {

            arrayA[i] = i * 0.5;


        }
        for (int i = 0; i < arrayB.length; i++) {

            arrayB[i] = i * 0.4;

        }


        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));


        for (int i = 1; i < arrayB.length; i++) {

            if (arrayA[i] > arrayB[count]) {
                System.out.println("Вставить b[" + count + "]" + " перед a[" + i + "]");
                i--;
                if (count == arrayB.length -1 ) {break;}
                count++;

            }

        }

            for (int i = 0; i < arrayB.length; i++) {

                if (arrayA[arrayA.length - 1] < arrayB[i]) {
                    System.out.println("Вставить b[" + i + "] - b[" + (arrayA.length - 1) + "] после последнего элемента массива А");
                    break;

                }




            }


    }
}
