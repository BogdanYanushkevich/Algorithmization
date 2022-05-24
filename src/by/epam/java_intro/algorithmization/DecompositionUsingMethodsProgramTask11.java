package by.epam.java_intro.algorithmization;

public class DecompositionUsingMethodsProgramTask11 {

    // 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.


    //Метод определяет в каком из двух чисел больше цифр.

    public static String findLongerNumber(int num1, int num2) {

        String numb1 = num1 + "";
        String numb2 = num2 + "";

        if (numb1.length() > numb2.length()) {

            return "Наиболее длинным является число : " + numb1;

        } else if (numb2.length() > numb1.length()) {

            return "Наиболее длинным является число : " + numb2;

        } else {

            return "Колличество цифр в числах одинаково.";
        }
    }


    public static void main(String[] args) {


        int num1;
        int num2;
        String longerNumber;

        num1 = 43546256;
        num2 = 131642355;
        longerNumber = findLongerNumber(num1, num2);

        System.out.println(longerNumber);


    }
}
