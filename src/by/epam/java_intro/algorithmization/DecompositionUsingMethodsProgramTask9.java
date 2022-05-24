package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask9 {

     /* 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
     если угол между сторонами длиной X и Y — прямой                    */


    //Метод находит гиппотенузу прямоугольного треугольника по двум сторонам.

    public static double findHypotenuse(double x, double y) {

        double hypotenuse;

        hypotenuse = Math.sqrt((x * x) + (y * y));

        return hypotenuse;

    }

    // Метод находит площадь треугольника по сторонам.

    public static double findTriangleArea(double a, double b, double c) {

        double p;
        double s;

        p = (a + b + c) / 2;

        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));


        return s;

    }

    // Метод находит площадь произвольного четырёхугольника из площадей треугольников.

    public static double findQuadrangleArea(double x, double y, double z, double t) {

        if (x <= 0 || y <= 0 || z <= 0 || t <= 0 || (x > y + z + t) || (y > x + z + t) || (z > x + y + t) || (t > x + y + z)) {

            System.out.println("Данного четырёхугольника не может существовать. Введите корректные данные.");

            return 0;
        }

        double hypotenuse;
        double firstTriangleArea;
        double SecTriangleArea;
        double quadrangleArea;


        hypotenuse = findHypotenuse(x, y);

        firstTriangleArea = findTriangleArea(x, y, hypotenuse);

        SecTriangleArea = findTriangleArea(z, t, hypotenuse);

        quadrangleArea = firstTriangleArea + SecTriangleArea;


        return quadrangleArea;

    }


    public static void main(String[] args) {

        double x;
        double y;
        double z;
        double t;
        double quadrangleArea;


        x = 9;
        y = 10;
        z = 7.6;
        t = 6.7;
        quadrangleArea = findQuadrangleArea(x, y, z, t);

        System.out.println(quadrangleArea);
    }
}
