package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask2 {

    // 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {

        if (n2 == 0) {
            return n1;

        }

        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }


    public static int greatestCommonDivisorFour(int n1, int n2, int n3, int n4) {

        return gcdByEuclidsAlgorithm(gcdByEuclidsAlgorithm(n1, n2), gcdByEuclidsAlgorithm(n3, n4));

    }


    public static void main(String[] args) {


        int n1;
        int n2;
        int n3;
        int n4;
        int resultGCD;


        n1 = (int) (Math.random() * 100);
        n2 = (int) (Math.random() * 100);
        n3 = (int) (Math.random() * 100);
        n4 = (int) (Math.random() * 100);


        resultGCD = greatestCommonDivisorFour(n1, n2, n3, n4);


        System.out.println("НОД четырёх заданых чисел : " + resultGCD);
    }
}

