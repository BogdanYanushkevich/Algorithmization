package by.epam.java_intro.algorithmization;

import java.util.Arrays;

public class OneDimensionalArraySortingProgramTask5 {

    /*5. Сортировка вставками. Дана последовательность чисел a1, a2, .. an.. Требуется переставить числа в порядке
    возрастания. Делается это следующим образом. Пусть a1, a2, .. an   - упорядоченная последовательность,
    т. е. a1 <= a2 <=  .. an. Берется следующее число a i+1   и вставляется в последовательность так, чтобы новая
    последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.          */

    public static void main(String[] args) {

        int n;
        int[] array;


        n = 15;
        array = new int[n];


        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + "\t");

        }


        System.out.println("\n");
        for (int i = 1; i < array.length; i++) {

            int arrayElement;
            int index;

            arrayElement = array[i];
            index = binarySearch(array, 0, i, arrayElement);

            if (index < 0) {

                index = -(index) - 1;

            }

            System.arraycopy(array, index, array, index + 1, i - index);
            array[index] = arrayElement;
            System.out.print(Arrays.toString(array) + "\n");
        }

        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");


        }
    }

    public static int binarySearch(int[] array, int from, int to, int arrayElement) {


        int firstIndex;
        int lastIndex;


        firstIndex = from;
        lastIndex = to - 1;


        while (firstIndex <= lastIndex) {

            int midIndex;
            int midNum;

            midIndex = (lastIndex + firstIndex) / 2;
            midNum = array[midIndex];

            if (midNum == arrayElement) {

                return midIndex;

            } else if (midNum < arrayElement) {

                firstIndex = midIndex + 1;

            } else if (midNum > arrayElement) {

                lastIndex = midIndex - 1;

            }
        }

        return -(firstIndex + 1);
    }
}
