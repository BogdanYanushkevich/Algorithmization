package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask7 {

    // 7. Даны действительные числа a1 a2 an . Найти max(a1 + a2n,a2 + a2n−1 + an + an-1).

    public static void main(String[] args) {


        int n;
        double tempMaxValue;
        double maxValue;
        double[] a;


        n = 20;
        maxValue = 0;
        a = new double[n];


        for (int i = 0; i < a.length; i++) {

            a[i] = (Math.random() * n);

        }


        for (int i = 0; i < a.length / 2; i++) {

            tempMaxValue = a[i] + a[n - 1 - i];


            if (maxValue < tempMaxValue) {

                maxValue = tempMaxValue;

            }
        }

        System.out.print("Max Value : ");
        System.out.printf("%.2f", maxValue);

    }
}
