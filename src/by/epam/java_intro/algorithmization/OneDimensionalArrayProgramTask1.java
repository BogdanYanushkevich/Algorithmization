package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask1 {

    // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

    public static void main(String[] args) {


        int n;
        int k;
        int sum;
        int[] a;


        n = 45;
        k = 10;
        sum = 0;
        a = new int[n];


        for (int i = 0; i < a.length; i++) {

            a[i] = i;
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] % k == 0) {

                sum += i;

            }
        }

        System.out.println("Cумма чисел, которые кратны К : " + sum);
    }
}
