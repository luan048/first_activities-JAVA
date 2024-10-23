public class Car {
    public String model;
    public String color;
    public int year;

    public Car(String carModel, String carColor, int carYear) { // Constructor com parametro
        model = carModel;
        color = carColor;
        year = carYear;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Corolla", "white", 2017); // car1 é uma instancia de Car
        Car car2 = new Car("Mercedes", "black", 2020); // O new Car usa do Constructor definido acima

        System.out.println("We have a " + car2.model + " color " + car2.color + " " + car2.year); // Método de consulta
        System.out.println("The next car is a " + car1.model + " " + car1.color + " year " + car1.year);
    }
}