public enum SolarSystem {
    MERCURY (1, 0, 0, null),
    VENUS (2, 10, 20, MERCURY),
    EARTH (3, 30, 40, VENUS),
    MARS (4, 50, 60, EARTH),
    JUPITER (5, 70, 80, MARS),
    SATURN (6, 90, 100, JUPITER),
    URANUS (7, 110, 120, SATURN),
    NEPTUNE (8, 130, 140, URANUS);

    private final int sequenceNumber;
    private final int distanceFromPreviousPlanet;
    private final int distanceFromSun;
    private final SolarSystem previousPlanet;

    SolarSystem(int sequenceNumber, int distanceFromPreviousPlanet, int distanceFromSun, SolarSystem previousPlanet) {
        this.sequenceNumber = sequenceNumber;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.distanceFromSun = distanceFromSun;
        this.previousPlanet = previousPlanet;
    }

    @Override
    public String toString() {
        return "SolarSystem{" +
                "sequenceNumber=" + sequenceNumber +
                ", distanceFromPreviousPlanet=" + distanceFromPreviousPlanet +
                ", distanceFromSun=" + distanceFromSun +
                ", previousPlanet=" + previousPlanet +
                '}';
    }
}

