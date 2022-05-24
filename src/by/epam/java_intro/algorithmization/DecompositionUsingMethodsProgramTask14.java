package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask14 {

    /* 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
    использовать декомпозицию. */


    //Метод находит сумму цифр чилса, вовзведённых в степень равную колличеству цифр в числе .

    public static int sumOfNum(int n) {

        int sum;

        sum = 0;

        for (int i = n; i > 0; i /= 10) {

            sum += powerOfN(i % 10, n);

        }


        return sum;
    }


    //Метод вычисляет длину n.

    public static int numLenght(int n) {

        int numLenght;
        String lengthOfNum;

        lengthOfNum = n + "";
        numLenght = lengthOfNum.length();

        return numLenght;
    }


    //Метод возводит число в степень n.

    public static int powerOfN(int num, int power) {

        double nPowOfNum;

        nPowOfNum = Math.pow(num, numLenght(power));

        return (int) nPowOfNum;

    }


    //Метод проверяет является ли число числом Армстронга.

    public static boolean isArmstrongNum(int n) {

        boolean armstrongNum;

        armstrongNum = false;

        if (sumOfNum(n) == n) {

            armstrongNum = true;

        }

        return armstrongNum;
    }

    //Метод проверяет и выводит все числа от 1 до k на то являются ли они числом Армстронга.

    public static String printArmstrongNum(int k) {

        String s = "В этом промежутки чисел Армстронга не было";

        for (int i = 1; i <= k; i++) {

            if (isArmstrongNum(i)) {

                s = "Это были числа арсмтронга";

                System.out.println("Это число Армстронга : " + "\t" + i);
            }
        }

        return s;

    }


    public static void main(String[] args) {

        int k = 1000;

        System.out.println(printArmstrongNum(k));

    }
}
