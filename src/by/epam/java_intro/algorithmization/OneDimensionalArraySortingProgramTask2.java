package by.epam.java_intro.algorithmization;

public class OneDimensionalArraySortingProgramTask2 {

    /* 2. Даны две последовательности a1 <= a2 <=  .. an и b1 <= b2 <= .. bn . Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.  */

    public static void main(String[] args) {


        int n;
        int m;
        int[] firstArray;
        int[] secondArray;


        n = 10;
        m = 15;
        firstArray = new int[n];
        secondArray = new int[m];


        for (int i = 0; i < firstArray.length; i++) {

            firstArray[i] = i + 10;

        }


        for (int i = 0; i < secondArray.length; i++) {

            secondArray[i] = i;

        }

        if (firstArray[n - 1] >= secondArray[m - 1]) {

            for (int i = 0; i  < firstArray.length;  i++) {

                secondArray[m - i - 1] = firstArray[n - i - 1];
            }
        }

        for (int i = 0; i < secondArray.length; i++) {

            System.out.print(secondArray[i] + "\t");

        }
    }
}

