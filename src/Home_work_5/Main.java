package Home_work_5;

public class Main {
    public static void main(String[] args) {
        PassengerAuto PassengerAuto = new PassengerAuto();
        PassengerAuto.traffic();
        PassengerAuto.brand();
        PassengerAuto.Opisanie();
        PassengerAuto.Peres4et();
        PassengerAuto.getMaxSpead();

        Truck truck = new Truck();
        truck.trafficMaz();
        truck.bradTruck();
        truck.Opisanie();
        truck.gruz();

        CivilAviation civilAviation = new CivilAviation();
        civilAviation.trafficAir();
        civilAviation.brand();
        civilAviation.Opisanie();
        civilAviation.fitPassengers();

        MilitaryAviation militaryAviation = new MilitaryAviation();
        militaryAviation.brand();
        militaryAviation.Opisanie();







        }
}
