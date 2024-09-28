package vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity;
    public ElectricCar(String model, String licence, String color, int year, String ownerName, String insuranceNumber,int batteryCapacity) {
        super(model, licence, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric";
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Capacity: " + batteryCapacity + " kWh";
    }
}