public class Profile {
    private int numberOfPoints;
    private int profileNumber;

    public Profile(int numberOfPoints, int profileNumber) {
        this.numberOfPoints = numberOfPoints;
        this.profileNumber = profileNumber;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "numberOfPoints=" + numberOfPoints +
                ", profileNumber=" + profileNumber +
                '}';
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public int getProfileNumber() {
        return profileNumber;
    }
}
