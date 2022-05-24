package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask7 {

    // 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

    //Метод находит факториал чисел.

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    //Метод находит сумму факториалов нечётных чисел от 1 до 9.

    public static int getSumOddNumberFactorial () {

        int sum;
        sum = 0;
        for (int i = 1; i <= 9; i += 2){

            sum +=  getFactorial(i);

        }
        return sum;
    }


    public static void main(String[] args) {

        int SumOddNumberFactorial;

        SumOddNumberFactorial = getSumOddNumberFactorial();

        System.out.println(SumOddNumberFactorial);

    }
}
