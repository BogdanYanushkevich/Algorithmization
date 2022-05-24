package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask5 {

    // 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

    public static void main(String[] args) {


        int n;
        int[] a;


        n = 50;
        a = new int[n];


        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * n);
        }


        for (int i = 0; i < a.length; i++) {

            if (a[i] > i) {

                System.out.print(a[i] + "\t");
            }
        }

    }
}
