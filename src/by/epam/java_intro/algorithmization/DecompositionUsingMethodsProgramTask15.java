package by.epam.java_intro.algorithmization;


public class DecompositionUsingMethodsProgramTask15 {

    /* Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию. */


    //Метод  создаёт массив длины n.

    public static int[] arraynLength(int n) {

        int[] a;

        a = new int[n];

        return a;
    }

    //Метод заполняет массив последовательными значениями и выводит их.

    public static String printConsecutiveNumber(int[] a) {

        int consNum;

        String s = "Последовательность может быть неболее 9 цифр";

        for (int i = 1; i <= (10 - a.length); i++) {

            consNum = i;

            if (a.length < 10) {

                s = "Это все последовательные числа длины n.";
            }

            for (int j = 0; j < a.length; j++) {

                a[j] = consNum;

                consNum++;

                System.out.print(a[j]);
            }

            System.out.print("\n");

        }
        return s;
    }


    public static void main(String[] args) {

        int n = 6;

        String allConsNum;

        allConsNum = printConsecutiveNumber(arraynLength(n));

        System.out.println(allConsNum);

    }
}
