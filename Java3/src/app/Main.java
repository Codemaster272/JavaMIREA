package app;
import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {

        Car beetle = new Car("Alexander", "122-IC-75662");
        ElectricCar tesla = new ElectricCar("Roman", "156-E-85434", 85);

        System.out.println(beetle.getEngineType());
        System.out.println(beetle.getInsuranceNumber());

        System.out.println(beetle.getOwnerName());
        beetle.setOwnerName("Anton");
        System.out.println(beetle.getOwnerName());

        System.out.println("\n" + tesla.getBatteryCapacity());
        System.out.println(tesla.getEngineType());
        System.out.println(tesla.getInsuranceNumber());
        System.out.println(tesla.getOwnerName());
    }
}