package by.epam.java_intro.algorithmization;

import java.util.Arrays;

public class DecompositionUsingMethodsProgramTask4 {

    /*   4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
    из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.      */


    //Метод генерирует массив заполненный случайными точками на кординатах.

    public static int[][] generateCoordinatePoints(int n) {

        int[][] points;
        points = new int[2][n];

        for (int i = 0; i < n; i++) {

            points[0][i] = (int) (Math.random() * 6) - 3;
            points[1][i] = (int) (Math.random() * 6) - 3;


            System.out.print(i + ")\t");
            System.out.print("x: " + points[0][i] + "\t");
            System.out.print("y: " + points[1][i] + "\t");
            System.out.println();

        }

        return points;
    }


    // Метод записывает растояние между различными точками в массив.

    public static double[][] distanceBetweenPoints(int[][] points) {


        double[][] distanceBetweenPoints;
        double distance;


        distanceBetweenPoints = new double[points[0].length][points[0].length];


        for (int i = 0; i < points[0].length - 1; i++) {

            for (int j = i; j < points[0].length - 1; j++) {


                distance = Math.sqrt(((points[1][i] - points[1][j + 1]) * (points[1][i] - points[1][j + 1]))
                        + ((points[0][i] - points[0][j + 1]) * (points[0][i] - points[0][j + 1])));

                distanceBetweenPoints[i][j] = distance;

            }

        }

        return distanceBetweenPoints;

    }


    // Метод находит наибольшее растояние между точками.

    public static double maxDistanceBetweenPoints(double[][] distanceBetweenPoints) {


        double maxDistanceBetweenPoints;

        int indexFirstPoint;
        int indexSecondPoint;

        indexFirstPoint = 0;
        indexSecondPoint = 0;


        maxDistanceBetweenPoints = 0;


        for (int i = 0; i < distanceBetweenPoints.length; i++) {


            for (int j = i; j < distanceBetweenPoints.length; j++) {

                if (maxDistanceBetweenPoints < distanceBetweenPoints[i][j]) {

                    maxDistanceBetweenPoints = distanceBetweenPoints[i][j];

                    indexFirstPoint = i;
                    indexSecondPoint = j + 1;
                }
            }
        }
        System.out.println();
        System.out.println("Самое большое расстояние между элментами : " + indexFirstPoint + " и " + indexSecondPoint + "\n");
        return maxDistanceBetweenPoints;
    }


    public static void main(String[] args) {

        int n;

        n = 10;


        System.out.println("Длина отрезка :  " + maxDistanceBetweenPoints(distanceBetweenPoints(generateCoordinatePoints(n))));
    }
}
