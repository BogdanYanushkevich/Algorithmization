package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask8 {

      /* 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
      Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
      массива с номерами от k до m.    */


    //Метод генерирует массив заполненный случайными числами.

    public static int[] generateArray(int n) {

        int[] d;
        d = new int[n];

        for (int i = 0; i < n; i++) {

            d[i] = (int) (Math.random() * i);

        }

        return d;
    }

    // Метод  складывает три последовательных элемента массива.

    public static int SumofElements(int[] a, int k, int m) {

        int temp;

        if (k < 0 || m < 0 || m < k) {

            System.out.println("Введите корректные значения. K и M должно быть больше 0. ");

            return 0;

        }

        if (k > m) {

            temp = m;
            m = k;
            k = temp;

        }

        int sum = 0;

        for (int i = k; i <= m; i++) {

            sum += a[i];

        }
        return sum;
    }

    public static void main(String[] args) {


        int[] d;

        d = generateArray(7);

        System.out.println(SumofElements(d, 1, 3));
        System.out.println(SumofElements(d, 3, 5));
        System.out.println(SumofElements(d, 4, 6));

    }
}


