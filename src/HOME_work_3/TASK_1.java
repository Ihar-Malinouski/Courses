package HOME_work_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//ЗАДАНИЕ: Создать последовательность случайных чисел, найти и вывести наибольшее из них. (случайные числа можно получить из класса Random)
public class TASK_1 {
    private static int[] array;                                                     // Обьявляем приватную переменную для переиспользования в других методах

    public static void main(String[] args) {
        TASK_1 TASK_1 = new TASK_1();
        TASK_1.oneArray();                                                          // Вызываем метод oneArray
        maxMeaning();                                                               // Вызываем метод maxMeaning
    }

    public void oneArray() {                                                        // Обьявляем новый метод oneArray
        Scanner in = new Scanner(System.in);                                        // Функция для считывания значения с консоли
        System.out.print("Введите количество символов в одномерном массиве: ");     // Выводим сообщеие в консоли
        int elementArray = Integer.parseInt(in.nextLine());                         // Записываем введенное значение в переменную elementArray
        System.out.print("Введите конечное значение диапазона: ");                  // Выводим сообщеие в консоли
        int maxRange = Integer.parseInt(in.nextLine());                             // Записываем введенное значение в переменную maxRange

        int[] array = new int[elementArray];                                        // Обьявляем новый массив с размерностью elementArray
        for (int i = 0; i < array.length; i++) {                                    // Цикл для заполнения массива начиная с элемента с индексом 0
            array[i] = (int) (Math.random() * maxRange + 1);                        /* Заполняем одномерный массив случайными числами, где "maxRange"- максимальное значение
                                                                                       для одного случайного числа в массиве, "+1"- включая максимальное значение диапазона*/
        }
        System.out.println(Arrays.toString(array));                                 // Выводим в консоль значение полученного массива
        TASK_1.array = array;    // static переменная                               // Записываем значение полученного массива в приватную переменную array
    }

    public static void maxMeaning() {                                               // Обьявляем новый метод maxMeaning
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
}
