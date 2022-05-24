package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask13 {

    /*13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
    решения задачи использовать декомпозицию. */


    // Метод проверяет числа на то являются ли они простыми.

    public static boolean isPrime(int n) {


        boolean isPrime;


        isPrime = true;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;


            }
        }

        return isPrime;


    }

    // Метод печатает числа которые являются близнецами.

    public static String printPrimeTwins(int n) {

        String s;

        s = "В этом промежутке не было чисел близнецов";

        for (int i = n; i <= 2 * n; i++) {

            if (isPrime(i) && isPrime(i + 2)) {

                s = "В этом промежутке эти числа были близнецами";

                System.out.println("Это числа близнецы :" + "\t" + i + "\t" + (i + 2));

            }

        }

        return s;
    }


    public static void main(String[] args) {

        int n = 45;

        System.out.println(printPrimeTwins(n));


    }
}
