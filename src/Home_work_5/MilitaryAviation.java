package Home_work_5;

public class MilitaryAviation extends AirTransport {
    boolean ejectionSystem;
    int numberOfMissiles;

    public void brand() {
        brand = "AirBusMilitary";
        power = 12333;
        maxSpeed = 12225;
        weight = 884885;
        wingspan = 350;
        landingHeight = 100;
        ejectionSystem = false;
        numberOfMissiles = 2;

    }
    public void Opisanie() {
        System.out.println("Описание военного самолета: " + " Марка: " + brand + " Мощность: " + power + " Максимальная скорость: " + maxSpeed + " Масса: " +  weight + " Размах крыльев(м): " + wingspan + " Минимальная длина взлётно-посадочной полосы для взлёта: " + landingHeight + " Наличие системы катапультирования: " + ejectionSystem + " Количество ракет на складу: " + numberOfMissiles + " --- " + " Мощность в киловаттах(Вт): " + (power * 0.74));

    }

    public void Vistrel() {

    }
}
