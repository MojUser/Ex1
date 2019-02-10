public class PolimorphismMain {
    public static void main(String[] args) {
        Car car = new Car("Audi", 5, 800);
        printDescription(car);
        SportsCar sportsCar = new SportsCar("BMW", 5, 900, true, false, 1);
        printDescription(sportsCar);
    }

    public static void printDescription(Car car) {
        System.out.println(car.createDescription());
    }
}
