package by.epam.java_intro.algorithmization;

public class OneDimensionalArrayProgramTask10 {

    /*10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать. */

    public static void main(String[] args) {


        int n;
        int[] a;
        int numOfNumbers;


        n = 20;
        a = new int[n];
        numOfNumbers = (a.length) / 2;


        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * n);

        }


        for (int i = 0; i < numOfNumbers; ++i) {

            a[i] = a[i * 2];

        }


        for (int i = numOfNumbers; i < a.length; i++) {

            a[i] = 0;
        }


        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + "\t");

        }
    }
}



