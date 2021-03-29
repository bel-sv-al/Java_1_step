package lesson01.home;

public class Lesson01 {

public static void main (String [] arg){

    //1 задание
    int a = 20;
    int b = 35;
    int c = 16;
    int d = 7;
    float result01;

    result01 = firstTask(a, b, c, d);
    System.out.println( "1. " + result01 );

    //2 задание
    int e = 16;
    int f = 7;
    boolean result02;

    result02 = secondTask(e, f, false);
    System.out.println( "2. " + result02 );

    //3 задание
    int g = -13;

    thirdTask(g);

    //4 задание
    String name = "Александру от Светланы";

    fourthTask(name);
}


//1) Написать метод вычисляющий выражение a * (b + (c / d)) и
//возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;

    public static float firstTask( int valueA, int valueB, float valueC, int valueD){
        return valueA * ( valueB + ( valueC / valueD));
    }

//2) Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;

    public static boolean secondTask( int valueA, int valueB, boolean valueC) {
        if ((valueA + valueB >= 10) && (valueA + valueB <= 20)) {
            valueC = true;
        }
        return valueC;
    }

//3) Написать метод, которому в качестве параметра передается целое число,
// метод должен проверить положительное ли число передали, или отрицательное.
// Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль

    public static void thirdTask( int valueA) {
        if (valueA >= 0) {
            System.out.println("3. Число положительное!");
      } else {
           System.out.println("3. Число отрицательное!");
       }

    }

//4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
// метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
// Вывести приветствие в консоль.

    public static void fourthTask(String valueA) {
    System.out.println("4. Привет, " + valueA + "!");
    }

}
