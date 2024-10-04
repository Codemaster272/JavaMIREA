package vehicles;

public class Car extends Vehicle{
    public Car(String model, String licence, String color, int year, String ownerName, String insuranceNumber) {
        super(model, licence, color, year, ownerName, insuranceNumber);
        this.engineType = "Internal combustion";
    }

    @Override
    public String vehicleType(){
        return "Car";
    }
}
