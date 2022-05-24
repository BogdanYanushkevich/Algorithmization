package by.epam.java_intro.algorithmization;

public class OneDimensionalArraySortingProgramTask8 {

    /* 8. Даны дроби:

                              p1   p2   pn
                              -- , -- , --  ( pi , qi , - натуральные)
                              q1   q2   qn
    Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания. */

    public static void main(String[] args) {


        int n;
        int[] numerator;
        int[] denominator;
        int multiple;
        int difference;
        int temp;


        n = 10;
        multiple = 1;
        numerator = new int[n];
        denominator = new int[n];



        for (int i = 1; i < n; i++) {

            numerator[i] = i;
            denominator[i] = i + 1;
        }

        for (int i = 1; i < n; i++) {

            multiple *= denominator[i];

        }

        for (int i = 1; i < n; i++) {

            difference = multiple / denominator[i];

            numerator[i] = numerator[i] * difference;

        }

        for (int i = 1; i < numerator.length ; i++) {

            for (int j = i; j >= 1; j--) {

                if (numerator[j] < numerator[j - 1]){

                    temp = numerator[j - 1];
                    numerator[j - 1] = numerator[j];
                    numerator[j] = temp;}

                else {
                    break;
                }
            }
        }

        for (int i = 1; i < numerator.length ; i++) {

            System.out.print(numerator[i] + "\t");

        }

        System.out.println();
        for (int i = 1; i < numerator.length ; i++) {

            System.out.print(multiple+ "\t");

        }


    }
}
