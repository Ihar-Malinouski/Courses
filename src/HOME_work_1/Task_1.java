/**ЗАДАНИЕ
В спортивном центре есть три возрастные группы для занятий волейболом:
1 группа - от 7 до 13 лет;
2 группа - от 14 до 17 лет;
3 группа - от 18 до 65 лет.
Напишите метод, который принимает возраст человека и возвращает целое число, которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните ‘-1’.
 **/
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int num = Integer.parseInt(in.nextLine());
        switch ((7 <= num && num <= 13) ? 0 :
                (14 <= num && num <= 17) ? 1 : (18 <= num && num <= 65) ? 2 : 3) {
            case 0:
                System.out.println("1");
                break;
            case 1:
                System.out.println("2");
                break;
            case 2:
                System.out.println("3");
                break;
            default:
                System.out.println("-1");
        }
    }
}



class Test {

    public static void main(String[] args) {

        int[] array1 = new int[3];

        array1[0]=5;
        array1[1]=17;
        array1[2]=350;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
    }
}