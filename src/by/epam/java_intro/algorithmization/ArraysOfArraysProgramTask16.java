package by.epam.java_intro.algorithmization;


public class ArraysOfArraysProgramTask16 {

    /* 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
    ..., (n*n) так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
    собой. Построить такой квадрат. Пример магического квадрата порядка 3:

                                                   6 1 8
                                                   7 5 3
                                                   2 9 4
                                                                                                               */


    public static void main(String[] args) {


        int n;
        int num;
        int[][] magicCube;
        int[] sumRow;
        int[] sumCol;
        int sumDia;
        int sumRevDia;
        int count;
        int temp;
        int randColRow;
        int secRandColRow;


        n = 3;
        num = 1;
        count = 0;
        sumDia = 0;
        sumRevDia = 0;
        magicCube = new int[n][n];
        sumRow = new int[n];
        sumCol = new int[n];



        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                magicCube[i][j] = num;
                num++;

            }
        }


        while (count < 8) {


            randColRow = (int) (Math.random() * n);
            secRandColRow = (int) (Math.random() * n);


            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    sumRow[i] += magicCube[i][j];
                    sumCol[i] += magicCube[j][i];
                    sumDia += magicCube[i][i];
                    sumRevDia += magicCube[i][n - i - 1];

                }
            }


            if (sumRow[randColRow] == sumCol[randColRow] && sumCol[randColRow] == sumDia
                    && sumRow[randColRow] == sumRevDia) {


                count++;


                for (int i = 0; i < n; i++) {

                    for (int j = 0; j < n; j++) {

                        System.out.print(magicCube[i][j] + "\t");

                    }
                    System.out.println();

                }

            } else {




                temp = magicCube[randColRow][secRandColRow];
                magicCube[randColRow][secRandColRow] = magicCube[n / 2][n / 2];
                magicCube[n / 2][n / 2] = temp;

            }

        }
    }
}
