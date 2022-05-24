package by.epam.java_intro.algorithmization;

public class OneDimensionalArraySortingProgramTask6 {

    /* 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1,
    то продвигаются на один элемент вперед.
    Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
    Составить алгоритм этой сортировки. */

    public static void main(String[] args) {


        int n;
        double[] array;
        double temp;


        n = 15;
        array = new double[n];


        for (int i = 0; i < array.length; i++) {

            array[i] = (Math.random() * 15);

        }


        for (int i = 1; i < array.length ; i++) {

            for (int j = i; j >= 1; j--) {

                if (array[j] < array[j - 1]){

                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;}

                else {
                    break;
                }
                    }
                }


        for (int i = 0; i < array.length; i++) {

            System.out.printf("%.2f", array[i]);
            System.out.print("\t");

        }
    }
}
