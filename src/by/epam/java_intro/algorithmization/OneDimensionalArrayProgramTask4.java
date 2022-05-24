package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask4 {

    // 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

    public static void main(String[] args) {


        int n;
        int smallestNumberIndex;
        int largestNumberIndex;
        double[] a;
        double temp;
        double largestNumber;
        double smallestNumber;


        n = 50;
        a = new double[n];
        smallestNumber = Double.MAX_VALUE;
        largestNumber = Double.MIN_VALUE;
        smallestNumberIndex = 0;
        largestNumberIndex = 0;


        for (int i = 0; i < a.length; i++) {

            a[i] = Math.random() * 50 - 25;
        }


        for (int i = 0; i < a.length; i++) {

            if (a[i] < smallestNumber) {

                smallestNumber = a[i];

                smallestNumberIndex = i;

            }

            if (a[i] > largestNumber) {

                largestNumber = a[i];

                largestNumberIndex = i;

            }
        }


        System.out.println(smallestNumberIndex + " | " + largestNumberIndex);

        System.out.println(a[smallestNumberIndex] + " | " + a[largestNumberIndex]);


        temp = a[smallestNumberIndex];

        a[smallestNumberIndex] = a[largestNumberIndex];

        a[largestNumberIndex] = temp;


        System.out.println();

        System.out.println(smallestNumberIndex + " | " + largestNumberIndex);

        System.out.println(a[smallestNumberIndex] + " | " + a[largestNumberIndex]);

    }
}
