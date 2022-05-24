package by.epam.java_intro.algorithmization;

public class ArraysOfArraysProgramTask16Test {

    public static void main(String[] args) {


        int n;

        int sumDia;
        int sumRevDia;
        int[] sumRow;
        int[] sumCol;
        int[] magicCube;
        int index;
        int randColRow;
        int temp;
        int count;
        int index2;


        n = 3;
        sumDia = 0;
        sumRevDia = 0;
        count = 0;
        sumRow = new int[n];
        sumCol = new int[n];
        magicCube = new int[n * n];


        for (int i = 0; i < magicCube.length; i++) {

            magicCube[i] = i + 1;

        }

        while (count < 1000) {

            randColRow = (int) (Math.random() * (n - 1));
            index = 0;

            for (int i = 0; i < n; i++) {

                sumDia += magicCube[i * (n + 1)];

                sumRevDia += magicCube[(1 + i) * (n - 1)];


                for (int j = 0; j < n; j++) {

                    sumRow[i] += magicCube[index];

                    sumCol[j] += magicCube[index % n + i * n];

                    index++;

                }
            }


            if (sumRow[0] == sumRow[1] && sumRow[1] == sumRow[2] && sumRow[2] == sumCol[0]
                    && sumCol[0] == sumCol[1] && sumCol[1] == sumCol[2]
                    && sumCol[2] == sumDia && sumDia == sumRevDia) {

                index2 = 0;

                for (int i = 0; i < n; i++) {

                    for (int j = 0; j < n; j++) {


                        System.out.print(magicCube[index2] + "\t");
                        index2++;
                    }
                    System.out.println();

                }

                count++;
            } else {


                temp = magicCube[randColRow];

                magicCube[randColRow] = magicCube[randColRow + 1];

                magicCube[randColRow + 1] = temp;


            }
        }
    }
}



  /*      for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {


                System.out.print(magicCube[index2] + "\t");

                index2++;

            }
            System.out.println();
        }

        System.out.println("\n");



        for (int i = 0; i < n; i++) {

            System.out.print(sumRow[i] + " ");

        }
        System.out.println("\n");

        for (int i = 0; i < n; i++) {

            System.out.print(sumCol[i] + " ");

        }

        System.out.println("\n");

        System.out.println("sum dia : " + sumDia);
        System.out.println("sum Revdia : " + sumRevDia); */





