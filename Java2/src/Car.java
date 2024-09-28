public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    // Конструктор по умолчанию
    public Car() {
        this.model = "Empty";
        this.license = "Empty";
        this.color = "Empty";
        this.year = 0;
    }

    // Конструктор со всеми полями
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор с полями по выбору студента
    public Car(String model, int year) {
        this.model = model;
        this.license = "Empty";
        this.color = "Empty";
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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

    public void To_String() {
        System.out.println("Модель: " + model);
        System.out.println("Номер: " + license);
        System.out.println("Цвет: " + color);
        System.out.println("Год выпуска: " + year);
    }

    public int getCarAge(int CurrentYear) {
        return CurrentYear - year;
    }
}
