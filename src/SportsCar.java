public class SportsCar extends Car{
    private boolean hasSpoiler;
    private boolean has4x4;
    private int raceTime;

    public SportsCar(String brand, int numberOfDoors, int maxSpeed, boolean hasSpoiler, boolean has4x4, int raceTime) {
        super(brand, numberOfDoors, maxSpeed);
        this.hasSpoiler = hasSpoiler;
        this.has4x4 = has4x4;
        this.raceTime = raceTime;
    }

    @Override
    public String createDescription() {
        String standardDescription = super.createDescription();
        String descriptionToReturn = standardDescription;
        if(hasSpoiler) {
           descriptionToReturn += ".Posiada także spojler!";
        }
        if(has4x4) {
            descriptionToReturn += "Posiada także napęd na 4 koła!!!";
        }
        descriptionToReturn += "A jego czas na torze to: " +raceTime;

        return descriptionToReturn;
    }
}
