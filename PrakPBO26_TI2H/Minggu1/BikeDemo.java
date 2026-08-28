public class BikeDemo {
    public static void main(String[] args) {
        Bike montainBike1 = new Bike();
        Bike montainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        montainBike1.setBrand("Trek");
        montainBike1.speedAcceleration(10);
        montainBike1.gearChanges(2);
        montainBike1.printInfo();

        montainBike2.setBrand("Giant");
        montainBike2.speedAcceleration(20);
        montainBike2.gearChanges(3);
        montainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTiredWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();

    }
}
