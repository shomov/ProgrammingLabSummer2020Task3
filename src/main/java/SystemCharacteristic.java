import java.util.ArrayList;

public class SystemCharacteristic {
    ArrayList<PlanetCharacteristic> planet = new ArrayList<>();
    double weightOfStar;
    double radiusOfStar;
    int numberOfPlanets;

//    public SystemCharacteristic(ArrayList<PlanetCharacteristic> pl, double w, double r, int n){
//        this.planet = pl;
//        this.weightOfStar = w;
//        this.radiusOfStar = r;
//        this.numberOfPlanets = n;
//    }

    public void setWeightOfStar (String weight) {
        double weightDouble;
        weightDouble = Double.parseDouble(formatter(weight));
        weightOfStar = weightDouble * Math.pow(10, 11);
    }

    public void setNumberOfPlanets (double num) {
        numberOfPlanets = (short) num;
    }

    public void setRadiusOfStar (String rad) {
        double radius;
        radius = Double.parseDouble(formatter(rad));
        radiusOfStar = radius;
    }

    public String formatter(String in) {
        return in.replace(',', '.').trim();
    }

    public String toString() {
        return "SystemCharacteristic{" +
                "planet=" + planet.toString() +
                ", weightOfStar=" + weightOfStar +
                ", radiusOfStar=" + radiusOfStar +
                ", numberOfPlanets=" + numberOfPlanets +
                '}';
    }
}
