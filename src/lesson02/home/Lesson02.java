package lesson02.home;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson02 {


    public static void main (String [] arg){


//1 задание

        int[] value1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println ("1. На входе: " + Arrays.toString(value1));

        firstTask(value1);
        System.out.println("1. На выходе: " + Arrays.toString(value1));

//2 задание

        int[] value2 = new int[8];
        secondTask(value2);
        System.out.println("2. " + Arrays.toString(value2));

//3 задание

        int[] value3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3. На входе: " + Arrays.toString(value3));
        thirdTask(value3);
        System.out.println("3. На выходе: " + Arrays.toString(value3));

//4 задание

        int[] value4 = {1, 4, 7, 10, 13, 16, 19, 22, 5, 2, 4, 8, 9, 17};
        System.out.println("4. Массив: " + Arrays.toString(value4));
        System.out.println("4. Минимальное: " + fourthTaskMin(value4));
        System.out.println("4. Максимальное: " + fourthTaskMax(value4));

//5 задание
        int razmer = 5;
        int[][] value5 = new int[razmer][razmer];
        fifthTask(value5);
        System.out.println("5. ");
        printFifthTask(value5);


    }

//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

    public static void firstTask(int [] ft){
        for (int i = 0; i < ft.length; i++)
            if (ft[i] == 1){
                ft[i] = 0;
            } else {
                ft[i] = 1;
                }
    }

//2. Задать пустой целочисленный массив размером 8.
// Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    public static void secondTask(int[] st){
        for (int i = 0; i < st.length; i++)
            st[i] = i * 3 +1;
    }


//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
// написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;

    public static void thirdTask(int[] tht){
        for (int i = 0; i < tht.length; i++)
            if (tht[i] < 6){
                tht[i] *= 2;
            }
    }

//4. Задать одномерный массив.
// Написать методы поиска в нём минимального и максимального элемента;

    public static int fourthTaskMin(int[] ft){
        int min = ft[0];
        for (int i = 0; i < ft.length; i++){
            if (ft[i] < min)
                min = ft[i];
        }
        return min;
    }

    public static int fourthTaskMax(int[] ft){
        int max = ft[0];
        for (int i = 0; i < ft.length; i++){
            if (ft[i] > max)
                max = ft[i];
        }
        return max;
    }

//5. Создать квадратный целочисленный массив
// (количество строк и столбцов одинаковое),
// заполнить его диагональные элементы единицами, используя цикл(ы);

    public static void fifthTask(int[][] ft){
        for (int i = 0; i < ft.length; i++) {
            ft[i][i] = 1;
            ft[i][ft.length - 1 - i] = 1;
        }
    }

    public static void printFifthTask(int[][] pft){
        for (int i = 0; i < pft.length; i++) {
            for (int j = 0; j < pft.length; j++) {
                System.out.print(pft[i][j]);
            }
            System.out.println();
        }
    }



}