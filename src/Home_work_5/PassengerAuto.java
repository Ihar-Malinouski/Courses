package Home_work_5;

import java.util.Scanner;

public class PassengerAuto extends Terrestrial {

    int body;
    int numberOfPassengers;
    static int timeInMotion;

    public void traffic() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время в пути (h): ");
        int timeInMotion = Integer.parseInt(in.nextLine());
        this.timeInMotion = timeInMotion;
    }

    public void brand() {
        brand = "Audi";
        power = 123;
        maxSpeed = 225;
        weight = 123;
        numberWheels = 4;
        consumptionFuel = 12.5;
        body = 1;
        numberOfPassengers = 5;
    }

    public void Opisanie() {
        System.out.println("Описание легкового автомобиля: " + " Марка: " + brand + " Мощность: " + power + " л/с " + " Максимальная скорость " + maxSpeed + " км/ч " + " Масса " + weight + " кг " + " Тип кузова " + body + " Количество пассажиров " + numberOfPassengers + " Количество колес " + numberWheels + " Расход топлива " + consumptionFuel + " л/100км" + " --- " + "Мощность в киловаттах(Вт): " + (power * 0.74));

    }

    public void Peres4et() {
        double powerKV = 0.74 * power;
    }

    public void getMaxSpead() {
        System.out.println("За время " + PassengerAuto.timeInMotion + "ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + "км/ч проедет " + maxSpeed * PassengerAuto.timeInMotion + " км и израсходует " + PassengerAuto.timeInMotion * consumptionFuel + " литров топлива");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}

