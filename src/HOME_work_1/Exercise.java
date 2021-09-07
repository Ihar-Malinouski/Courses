import java.io.PrintStream;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите левое число: ");
        int left = in.nextInt();

        System.out.printf("Введите правое число: ");
        int right = in.nextInt();

        System.out.printf(" Левое: %s \n Правое: %s \n\n", left, right);
        //   System.out.printf("Целое выражение:\n %s %s\n", left, right);

        if (left > right) {
            System.out.printf("ОТВЕТ: \n Атвичаююююю, ЛЕВОЕ число больше (%s %s %s)", left, ">", right);
        } else if (left < right) {
            System.out.printf("ОТВЕТ: \n Атвичаююююю, ПРАВОЕ число больше (%s %s %s)", left, "<", right);
        } else
            System.out.printf("ОТВЕТ: \n НУ ТАК ТО ЧИСЛА РАВНЫ (%s %s %s)", left, "=", right);
        in.close();
    }

}
