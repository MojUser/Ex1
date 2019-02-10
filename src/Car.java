public class Car {
    private String brand;
    private int numberOfDoors;
    private int maxSpeed;

    public Car(String brand, int numberOfDoors, int maxSpeed) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
    }

    public String createDescription() {
       return  "Samochód marki " + brand +" posiada maksymalną prędkość " + maxSpeed + " oraz liczbę drzwi: " + numberOfDoors;
    }
}
