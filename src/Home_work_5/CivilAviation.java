package Home_work_5;

import java.util.Scanner;

public class CivilAviation extends AirTransport {
    private static int passengers;
    int numberOfPassengers;
    boolean businessClassAvailability;

    public void trafficAir() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количесиво пассажиров: ");
        int passengers = Integer.parseInt(in.nextLine());
        this.passengers = passengers;
    }
    public void brand() {
        brand = "AirBus";
        power = 12333;
        maxSpeed = 12225;
        weight = 884885;
        wingspan = 350;
        landingHeight = 100;
        numberOfPassengers = 110;
        businessClassAvailability = false;

    }
    public void Opisanie() {
        System.out.println("Описание гражданского самолета: " + " Марка: " + brand + " Мощность: " + power + " Максимальная скорость: " + maxSpeed + " Масса: " +  weight + " Размах крыльев(м): " + wingspan + " Минимальная длина взлётно-посадочной полосы для взлёта: " + landingHeight + " Количество пассажиров: " + numberOfPassengers + "Наличие безнесс класса: " + businessClassAvailability + "--- " + "Мощность в киловаттах(Вт): " + (power * 0.74));

    }
    public static void fitPassengers () {
        int numberOfPassengers = 110;
        int passengers = CivilAviation.passengers;
        if (passengers > numberOfPassengers) {
            System.out.println("Столько в самолёт не влезет");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        } else {
            System.out.println("Все пассажиры влезут в самолёт");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
    }
}
