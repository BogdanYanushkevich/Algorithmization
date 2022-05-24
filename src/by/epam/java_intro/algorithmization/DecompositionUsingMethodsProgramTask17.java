package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask17 {

    /*  17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
    действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. */


    //Метод подсчитывает и возвращает сумму цифр в числе.


    public static int sumOfNum(int n) {

        int sum;

        sum = 0;

        for (int i = n; i > 0; i /= 10) {

            sum += i % 10;

        }

        return sum;
    }


    //Метод циклично вычитает сумму цифр из числа и подсчитывает колличество итераций до снижения числа до 0.

    public static int regNum (int n){

        int count;

        count = 0;

        for (int i = n; i > 0; i -=sumOfNum(i)){

            count++;
        }

        return count;
    }


    public static void main(String[] args) {

        int n;
        int numOfIter;

        n = 1000;
        numOfIter = regNum(n);


        System.out.println(numOfIter);


    }
}
