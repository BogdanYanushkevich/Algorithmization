package by.epam.java_intro.algorithmization;

public class TestClass {

    public static void main(String[] args) {

        String names = " Alena   Alice   alina albina  Anastasya ALLA Arina   ";

        names = names.trim(); // Удаление пробелов по краям строки

        // разбиение пробелов на подстроки где "пробел" - разделитель

        String a[] = names.split(" ");  // Массив содержит элементы нулевой длины
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[j].compareToIgnoreCase(a[i]) < 0){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }

        }
        for (String arg : a) {
            if(!arg.isEmpty()) {
                System.out.println(arg + " ");
            }
        }

    }
}
