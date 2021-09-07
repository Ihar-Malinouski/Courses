package HOME_work_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//ЗАДАНИЕ: Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, их индексы.
public class TASK_2 {
    private static int[] array;                                                     // Обьявляем приватную переменную для переиспользования в других методах
    private static int maxRange;                                                    // Обьявляем приватную переменную для переиспользования в других методах

    public static void main(String[] args) {
        TASK_2 TASK_2 = new TASK_2();
        TASK_2.oneArray();
        TASK_2.maxMeaning();
        minMeaning();
    }

    public void oneArray() {                                                        // Обьявляем новый метод oneArray
        Scanner in = new Scanner(System.in);                                        // Функция для считывания значения с консоли
        System.out.print("Введите количество оценок: ");                            // Выводим сообщеие в консоли
        int maxRange = Integer.parseInt(in.nextLine());                             // Записываем введенное значение в переменную maxRange

        int[] array = new int[maxRange];                                            // Обьявляем новый массив с размерностью maxRange
        for (int i = 0; i < array.length; i++) {                                    // Цикл для заполнения массива начиная с элемента с индексом 0
            array[i] = (int) (Math.random() * 11);                                  /* Заполняем одномерный массив случайными числами, где "maxRange"- максимальное значение
                                                                                     для каждого случайного числа в массиве, "+11"- максимально значение 10*/
        }
        System.out.println(Arrays.toString(array));                                 // Выводим в консоль значение полученного массива
        TASK_2.array = array;                                                         // Записываем значение полученного массива в приватную переменную array
        TASK_2.maxRange = maxRange;                                                   // Записываем значение полученного массива в приватную переменную array
    }

    public void maxMeaning() {
        int maxMeaning = 0;                                                         // Создаем переменную, которая хранит максимальное значение во время прохождения цикла
        int index = 0;                                                              // Создаем переменную ,которая будет хранить индекс максимального значения во время прохождения цикла
        for (int i = 0; i < array.length; i++) {                                    // Цикл. Ищем с первого элемента с индексом - 0 до последнего елемента в массиве
            if (maxMeaning <= array[i]) {                                           // Сравниваем значение в переменной maxMeaning (изначально 0) со значение с индексом [i] (первый индекс 0)
                maxMeaning = array[i];                                              // Присваеваем значение в переменную maxMeaning, если maxMeaning <= array[i]
                index = i;                                                          // Записываем значение идекса максимального значения, если maxMeaning <= array[i]
            }
        }
        System.out.println("Наибольшее значение  " + maxMeaning + "  имеет индекс  " + index); // Выводим в консоль результат
    }

    public static void minMeaning() {
        int minMeaning = maxRange;                                                  // Создаем переменную равную максимальному значению в массиве
        int index = 0;                                                              // Создаем переменную ,которая будет хранить индекс минимального значения во время прохождения цикла
        for (int i = 0; i < array.length; i++) {                                    // Цикл. Ищем с первого элемента с индексом - 0 до последнего елемента в массиве
            if (minMeaning >= array[i]) {                                           // Сравниваем значение в переменной maxMeaning (изначально 0) со значение с индексом [i] (первый индекс 0)
                minMeaning = array[i];                                              // Присваеваем значение в переменную maxMeaning, если maxMeaning >= array[i]
                index = i;                                                          // Записываем значение идекса максимального значения, если maxMeaning >= array[i]
            }
        }
        System.out.println("Наименьшее значение  " + minMeaning + "  имеет индекс  " + index); // Выводим в консоль результат
    }

}
