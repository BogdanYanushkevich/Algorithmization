package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask6 {

    /* 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    являются простыми числами. */

    public static void main(String[] args) {


        int n;
        int[] a;
        int k;
        int sum;


        n = 21;
        sum = 0;
        a = new int[n];


        for (int i = 0; i < a.length; i++) {

            a[i] = i;
        }

        for (int i = 1; i <= a.length; i++) {

            k = 0;

            for (int j = 1; j < i + 1; j++) {

                if (i % j == 0) {

                    k++;

                    if (k > 2) break;
                }
            }

            if (k == 2) {

                sum += a[i];

            }
        }

        System.out.println(sum);
    }
}
