package Home_work_5;

import java.util.Scanner;

// Создали класс для грузовых авто
public class Truck extends Terrestrial {
    public static Object massCargoVes;
    int massCargo;

    public void trafficMaz() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите массу груза: ");
        int massCargoVes = Integer.parseInt(in.nextLine());
        this.massCargoVes = massCargoVes;
    }
    public void bradTruck() {
        brand = "Kamaz";
        power = 1552;
        maxSpeed = 85;
        weight = 8552;
        numberWheels = 8;
        consumptionFuel = 24;
        massCargo = 1000;
    }

    public void Opisanie() {
        System.out.println("Описание грузового автомобиля: " + " Марка: " + brand + " Мощность: " + power + " л/с " + " Максимальная скорость " + maxSpeed + " км/ч " + " Масса " + weight + " кг " + " Тип кузова " + " Количество колес " + numberWheels + " Расход топлива " + consumptionFuel + "л/100км" + " Грузоподъемность: " + massCargo + " --- " + " Мощность в киловаттах(Вт): " + (power * 0.74));
    }

    public static void gruz() {
        int massCargo = 1000;
        int massCargoVes = (int) Truck.massCargoVes;
        if (massCargoVes > massCargo) {
            System.out.println("Вам нужен грузовик побольше");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        } else {
            System.out.println("Грузовик загружен");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
    }

}
