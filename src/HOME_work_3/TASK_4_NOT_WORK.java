package HOME_work_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Задание: Создать массив, заполнить его случайными элементами. Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
public class TASK_4_NOT_WORK {
    private static int[] array;
    private static int maxRange;
    private static int maxIndex;
    private static int minIndex;
    private static int minMeaning;
    private static int maxMeaning;

    public static void main(String[] args) {
        TASK_4_NOT_WORK TASK_4 = new TASK_4_NOT_WORK();
        TASK_4.oneArray();                                                          // Вызываем метод oneArray
        TASK_4.maxMeaning();
        TASK_4.minMeaning();
        TASK_4.summArray();

    }

    public void oneArray() {                                                        // Обьявляем новый метод oneArray
        Scanner in = new Scanner(System.in);                                        // Функция для считывания значения с консоли
        System.out.print("Введите количество символов в одномерном массиве: ");     // Выводим сообщеие в консоли
        int elementArray = Integer.parseInt(in.nextLine());                         // Записываем введенное значение в переменную elementArray
        System.out.print("Введите конечное значение диапазона: ");                  // Выводим сообщеие в консоли
        int maxRange = Integer.parseInt(in.nextLine());                             // Записываем введенное значение в переменную maxRange

        int[] array = new int[elementArray];                                        // Обьявляем новый массив с размерностью elementArray
        Random rnd = new Random();                                                  // Создаем обьект для генерации случайный чисел (импортируется класс java.util.Random;)
        for (int i = 0; i < array.length; i++) {                                    // Цикл для заполнения массива начиная с элемента с индексом 0
            array[i] = (int) (Math.random() * maxRange + 1);                        /* Заполняем одномерный массив случайными числами, где "maxRange"- максимальное значение
                                                                                       для одного случайного числа в массиве, "+1"- включая максимальное значение диапазона*/
        }
        System.out.println(Arrays.toString(array));                                 // Выводим в консоль значение полученного массива
        this.array = array;                                                         // Записываем значение полученного массива в приватную переменную array
        this.maxRange = maxRange;
    }

    public void maxMeaning() {                                               // Обьявляем новый метод maxMeaning
        int maxMeaning = 0;                                                         // Создаем переменную, которая хранит максимальное значение во время прохождения цикла
        int maxIndex = 0;                                                              // Создаем переменную ,которая будет хранить индекс максимального значения во время прохождения цикла
        for (int i = 0; i < array.length; i++) {                                    // Цикл. Ищем с первого элемента с индексом - 0 до последнего елемента в массиве
            if (maxMeaning <= array[i]) {                                           // Сравниваем значение в переменной maxMeaning (изначально 0) со значение с индексом [i] (первый индекс 0)
                maxMeaning = array[i];                                              // Присваеваем значение в переменную maxMeaning, если maxMeaning <= array[i]
                maxIndex = i;                                                          // Записываем значение идекса максимального значения, если maxMeaning <= array[i]
            }
        }
        System.out.println("Наибольшее значение  " + maxMeaning + "  имеет индекс  " + maxIndex); // Выводим в консоль результат
        this.maxIndex = maxIndex;
        this.maxMeaning = maxMeaning;
    }

    public void minMeaning() {
        int minMeaning = maxRange;                                                  // Создаем переменную равную максимальному значению в массиве
        int minIndex = 0;                                                              // Создаем переменную ,которая будет хранить индекс минимального значения во время прохождения цикла
        for (int i = 0; i < array.length; i++) {                                    // Цикл. Ищем с первого элемента с индексом - 0 до последнего елемента в массиве
            if (minMeaning >= array[i]) {                                           // Сравниваем значение в переменной maxMeaning (изначально 0) со значение с индексом [i] (первый индекс 0)
                minMeaning = array[i];                                              // Присваеваем значение в переменную maxMeaning, если maxMeaning >= array[i]
                minIndex = i;                                                          // Записываем значение идекса максимального значения, если maxMeaning >= array[i]
            }
        }
        System.out.println("Наименьшее значение  " + minMeaning + "  имеет индекс  " + minIndex); // Выводим в консоль результат
        this.minIndex = minIndex;
        this.minMeaning = minMeaning;
    }

    public void summArray() {

        System.out.println(minIndex);
        System.out.println(maxIndex);
        System.out.println(Arrays.toString(array));
       //        int sum = 0;
//
////
//        for (int i = minIndex; i < maxIndex - 1; i++) {
//            for (int j = maxIndex; i < minIndex; i--)
////
////            minIndex = minIndex + 1;
////            //sum = summArray();
////            System.out.println(minIndex);
//
//        int temp = array[minIndex];
//        array[minIndex] = array[maxIndex];
//        array[maxIndex] = temp;
//
//            System.out.println(Arrays.toString(array));

    }

}



