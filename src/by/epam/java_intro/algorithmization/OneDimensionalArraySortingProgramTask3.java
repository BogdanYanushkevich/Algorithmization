package by.epam.java_intro.algorithmization;

public class OneDimensionalArraySortingProgramTask3 {

    /* 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <=  .. an. Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором. */

    public static void main(String[] args) {


        int temp;
        int n;
        int[] array;

        n = (int) (Math.random() * 50);
        array = new int[n];


        for (int i = 0; i < array.length; i++) {

            array[i] = i;

        }


        for (int i = 0; i < array.length; i++) {


            int max;
            int maxId;


            max = array[i];
            maxId = i;


            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxId = j;
                }
            }
            temp = array[i];
            array[i] = max;
            array[maxId] = temp;
        }


        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");

        }

    }

}
