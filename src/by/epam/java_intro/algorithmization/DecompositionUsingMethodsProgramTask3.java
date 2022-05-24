package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask3 {

    /*3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
    треугольника.      */


    public static double triangleArea(int a) {

        double s;

        s = (((a * a) * Math.sqrt(3)) / 4);

        return s;
    }


    public static void main(String[] args) {


        int a;
        double hexagonArea;


        a = 6;
        hexagonArea = (triangleArea(a) * 6);


        System.out.println("Площадь шестиугольника : " + hexagonArea);

    }
}
