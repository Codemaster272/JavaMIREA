public class Main {
        public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Cybertruck", "k271n32", "Silver", 2024);
        Car car3 = new Car("DMC-12", 1982);

        car1.setColor("Red");
        car1.To_String();
        System.out.println("\n" + car2.getModel());
        System.out.println("\n" + car3.getCarAge(2024));


    }
}
