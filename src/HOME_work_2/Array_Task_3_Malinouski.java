import java.util.Arrays;
import java.util.Scanner;

public class Array_Task_3_Malinouski {

    private int[] array2;

    /*
    Метожд для считыванеия с клавиатуры значение числа "n"(размер массива).
    */
    public void makeMassiveUsingKeybord() {
        System.out.print("1");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter massive`s size: → ");
        int num = Integer.parseInt(in.nextLine());
        int[] array2 = new int[num];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array2[i] = Integer.parseInt(in.nextLine());
        }
        this.array2 = array2;
    }

    /*
    Метод для вывода полученного массива из метода linkmakeMassiveUsingKeybord
    */
    public void printMassive() {
        System.out.println("Your base massive is: ");
        int index = 0;
        do {
            if (index >= array2.length) {
                break;
            }
            System.out.print(array2[index++] + ", ");
        } while (index < array2.length);
    }

    /*
    Метод сортирует базовый массив по убыванию сортировкой Пузырька
     */
    private void sortMassiveByBubbleWay() {
        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = array2.length - 1; j > i; j--) {
                if (array2[j - 1] > array2[j]) {
                    int arr = array2[j - 1];
                    array2[j - 1] = array2[j];
                    array2[j] = arr;
                }
                this.array2 = array2;
            }
        }
    }

    /*
    Метод вывводит отсортированный массив из метода sortMassiveByBubbleWay
    */
    public void printSortedDescMassive() {
        System.out.println("\nSorted massive DESC:\n" + Arrays.toString(array2));
    }

    /*
    Метод сортирует базовый массив по возрастанию сортировкой Пузырька
    */
    public void sortMassiveByBubbleWayASK() {
        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = array2.length - 1; j > i; j--) {
                if (array2[j - 1] < array2[j]) {
                    int arr = array2[j - 1];
                    array2[j - 1] = array2[j];
                    array2[j] = arr;
                }
                this.array2 = array2;
            }
        }
    }

    /*
     Метод вывводит отсортированный массив из метода sortMassiveByBubbleWayASK
     */
    public void printSortedDescMassiveASK() {
        System.out.println("\nSorted massive ASC:\n" + Arrays.toString(array2));
    }

    public static void main(String[] args) {
        Array_Task_3_Malinouski Array_Task_3_Malinouski = new Array_Task_3_Malinouski();
        Array_Task_3_Malinouski.makeMassiveUsingKeybord();
        Array_Task_3_Malinouski.printMassive();
        Scanner in = new Scanner(System.in);
        System.out.print("\nSORT DESC OR ASK? :  (1 - DESK; 0 - ASK) ");
        int num = Integer.parseInt(in.nextLine());
        if (num == 1) {
            Array_Task_3_Malinouski.sortMassiveByBubbleWayASK();
            Array_Task_3_Malinouski.printSortedDescMassiveASK();
        } else {

            Array_Task_3_Malinouski.sortMassiveByBubbleWay();
            Array_Task_3_Malinouski.printSortedDescMassive();
        }
    }
}
