package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {

    public void demoPolymorphism() {
        Vehicle myCar = new Car("Beetle", "122-IC-75662", "Red", 2020, "Alexander", "IC-75662");
        Vehicle myElectricCar = new ElectricCar("Tesla Model S", "156-E-85434", "Blue", 2022, "Roman", "E-85434", 85);

        myCar.setOwnerName("Anton");
        myElectricCar.setInsuranceNumber("E-12345");

        System.out.println(myCar.toString());
        System.out.println(myElectricCar.toString());
    }
}