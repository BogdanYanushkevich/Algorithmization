package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask6 {

    // 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

    // Рекурсивный метод поиска наибольшего общего делителя.

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {

        if (n2 == 0) {
            return n1;

        }

        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }


    // Метод вычисляющий являются ли три числа взаимно простыми.

    public static boolean coprimeNumbers(int n1, int n2, int n3) {

        int coprNum;
        boolean coprimeNumbers;

        coprimeNumbers = false;
        coprNum = gcdByEuclidsAlgorithm(gcdByEuclidsAlgorithm(n1, n2), n3);

        if (coprNum == 1) {

            coprimeNumbers = true;
        }

        return coprimeNumbers;
    }


    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;
        boolean coprimeNumbers;


      /*  n1 = (int) ((Math.random()) * 5);
        n2 = (int) ((Math.random()) * 5);
        n3 = (int) ((Math.random()) * 5); */

        n1 = 22;
        n2 = 33;
        n3 = 17;
        coprimeNumbers = coprimeNumbers(n1, n2, n3);

        System.out.println("Являются ли числа взаимно простыми : " + coprimeNumbers);
    }
}

