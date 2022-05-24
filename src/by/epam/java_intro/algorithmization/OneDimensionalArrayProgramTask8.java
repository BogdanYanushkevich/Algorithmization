package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask8 {

    /* 8. Дана последовательность целых чисел a1, a2, an. Образовать новую последовательность, выбросив из
    исходной те члены, которые равны min(a1, a2, an).   */

    public static void main(String[] args) {


        int n;
        int var;
        int minValue;
        int tempMinValue;
        int counter;
        int secCounter;
        int[] a;
        int[] b;


        n = 20;
        var = 0;
        counter = 0;
        secCounter = 0;
        minValue = Integer.MAX_VALUE;
        a = new int[n];


        for (int i = 0; i < a.length; i++) {

            if (var == 4) {
                var = 0;
            }

            a[i] = var;

            var++;

        }


        for (int i = 0; i < a.length - 1; i++) {


            tempMinValue = Math.min(a[i], a[i + 1]);


            if (tempMinValue < minValue) {

                minValue = tempMinValue;

            }
        }


        for (int i = 0; i < a.length; i++) {

            if (a[i] == minValue) {

                counter++;
            }
        }


        b = new int[n - counter];


        while (secCounter < b.length) {

            for (int i = 0; i < a.length; i++) {

                if (a[i] != minValue) {

                    b[secCounter] = a[i];

                    secCounter++;
                }
            }
        }


        for (int i = 0; i < b.length; i++) {

            System.out.print("\t" + b[i]);
        }

    }
}