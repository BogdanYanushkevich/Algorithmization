package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask9 {

    /* 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    чисел несколько, то определить наименьшее из них. */

    public static void main(String[] args) {


        int n;
        int valResult;
        int dupResult;
        int[] a;
        int[] duplicate;


        n = 20;
        a = new int[n];
        duplicate = new int[a.length];


        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * n);

        }


        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {

                    duplicate[i]++;
                }
            }
        }


        dupResult = duplicate[0];
        valResult = a[0];


        for (int i = 0; i < duplicate.length; i++) {

            if (duplicate[i] > dupResult) {

                dupResult = duplicate[i];
                valResult = a[i];

            }

            if ((dupResult == duplicate[i]) && (a[i] < valResult)) {

                valResult = a[i];
            }
        }


        System.out.println(valResult);
    }
}