package by.epam.java_intro.algorithmization;

public class OneDimensionalArraySortingProgramTask4 {

    /* 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <=  .. an. Требуется переставить числа в
    порядке возрастания. Для этого сравниваются два соседних числа ai  и ai+1. Если ai > a i+1, то делается
    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок. */

    public static void main(String[] args) {


        int n;
        boolean sorted;
        int[] array;
        int temp;


        n = 10;
        sorted = false;
        array = new int[n];


        //Условие исключает возможность проверки. Для проверки использовать: array[i] = n - i;

        for (int i = 0; i < array.length; i++) {

            array[i] = i;

        }


        while (!sorted) {

            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    sorted = false;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");

        }

    }
}

