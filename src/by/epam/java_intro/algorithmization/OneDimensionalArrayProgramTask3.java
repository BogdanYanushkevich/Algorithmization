package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask3 {

    /* 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    положительных и нулевых элементов.  */

    public static void main(String[] args) {


        int n;
        int positiveNumbersCounter;
        int negativeNumbersCounter;
        int nullCounter;
        double[] a;


        n = 1000000;
        positiveNumbersCounter = 0;
        negativeNumbersCounter = 0;
        nullCounter = 0;
        a = new double[n];


        for (int i = 0; i < a.length; i++) {

            a[i] = Math.random() * 30 - 15;
        }


        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {

                negativeNumbersCounter++;

            }
            if (a[i] > 0) {

                positiveNumbersCounter++;

            }
            if (a[i] == 0) {

                nullCounter++;

            }
        }

        System.out.println("negativeNumbersCounter:  " + negativeNumbersCounter + " | " +
                "positiveNumbersCounter : " + positiveNumbersCounter + " | " + "nullCounter : " + nullCounter);


    }
}
