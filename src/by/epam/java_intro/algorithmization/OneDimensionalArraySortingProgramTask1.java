package by.epam.java_intro.algorithmization;

public class OneDimensionalArraySortingProgramTask1 {

    /* 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    дополнительный массив.      */

    public static void main(String[] args) {


        int n;
        int k;
        int RemainingLength;
        int[] secondArray;
        int[] firstArray;


        n = 10;
        secondArray = new int[n];
        firstArray = new int[n + secondArray.length];
        k = (int) (Math.random() * firstArray.length - 1);
        RemainingLength = firstArray.length - secondArray.length - k;


        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;

        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = i;

        }


        for (int i = 0; i < RemainingLength; i++) {

            firstArray[k + secondArray.length + i] = firstArray[k + i];

        }

        for (int i = 0; i < secondArray.length; i++) {

            firstArray[k + i] = secondArray[i];
        }


        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }


    }
}