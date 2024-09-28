package vehicles;

public abstract class Vehicle {
    private String model;
    private String licence;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Vehicle(String model, String licence, String color, int year, String ownerName, String insuranceNumber) {
        this.model = model;
        this.licence = licence;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public abstract String vehicleType();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return licence;
    }

    public void setLicense(String licence) {
        this.licence = licence;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return vehicleType() + " [Model: " + model + ", Licenсe: " + licence + ", Color: " + color + ", Year: " + year +
                ", Owner: " + ownerName + ", Insurance: " + insuranceNumber + ", Engine Type: " + engineType + "]";
    }
}
