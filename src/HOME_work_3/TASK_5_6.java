package HOME_work_3;

import java.util.Scanner;

//ЗАДАНИЕ: Найти сумму элементов на главной диагонали матрицы n*n. Число n вводится пользователем с клавиатуры и заполнить его «бабочкой»
public class TASK_5_6 {

    public static void main(String[] args) {
        TASK_5_6 TASK_5_6 = new TASK_5_6();
        TASK_5_6.oneArray();

    }

    public void oneArray() {                                                        // Обьявляем новый метод oneArray
        Scanner in = new Scanner(System.in);                                        // Функция для считывания значения с консоли
        System.out.print("Введите размерность массива (n*n): ");                    // Выводим сообщеие в консоли
        int razmer = Integer.parseInt(in.nextLine());                               // Записываем введенное значение в переменную razmer
        int[][] array = new int[razmer][razmer];                                    // Обьявляем новый двумерный массив с размерностью [razmer * razmer]
        int i, j;                                                                    // Обьявляем новые переменные для использования в конструкциях for
        for (i = 0; i < array.length; i++) {                                        // Цикл для поиска элемента по массиву
            for (j = 0; j < array[i].length; j++) {                                 // Присваивание индексов елементам i-той строки(для того, чтобы далее вывести массив вида [razmer * razmer])
                if ((j < (array[i].length - 1 - i)) || (j > i))                     // Циклдля заполнения элемента массива нижней части
                    array[i][j] = 0;                                                // Если j < (array[i].length - 1 - i)) || (j > i)), то  array[i][j] = 0
                else
                    array[i][j] = 1;                                                // иначе  array[i][j] = 1
            }
        }
        for (i = 0; i < array.length / 2 + 1; i++) {                                // Цикл для заполнения элемента массива верхней части
            for (j = 0; j < array[i].length; j++) {                                 //  Присваивание индексов елементам j-того столбца(для того, чтобы далее вывести массив вида [razmer * razmer]
                if ((j < i) || (j >= (array[i].length - i)))                        // Цикл для заполнения элемента массива верхней части
                    array[i][j] = 0;                                                // Если (j<i) || (j>=(array[i].length-i)), то  array[i][j] = 0
                else
                    array[i][j] = 1;                                                // Иначе array[i][j] = 1
            }
        }
        for (i = 0; i < array.length; i++, System.out.println()) {                   /*Цикл для определения i(строка) и j(столбец). System.out.println() -
                                                                                       для вывода первого j в новой i с новой строки*/
            for (j = 0; j < array[i].length; j++) {                                  // Цикл прохождения по всем элементам массива j
                System.out.print(array[i][j] + " ");                                 // Вывод в консоль массива
            }
        }
    }
}






