public class Truck extends Car{
    private double loadWeight;

    public Truck() {
    }

    public Truck(String name, double fuelTankCapacity, double averageMileage, boolean isAirConditionOn, double loadWeight) {
        super(name, fuelTankCapacity, averageMileage, isAirConditionOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateTotalMileage() {
        double extraMileage = 0;
        if(isAirConditionOn()){
            extraMileage += 1.6;
        }
        double counter = loadWeight;
        while (counter>=100){
            extraMileage += 0.5;
            counter-=100;
        }
        return super.calculateTotalMileage() + extraMileage;
    }

    @Override
    public double calculateRange() {
        return super.calculateRange();
    }

    @Override
    public String toString() {
        return super.toString() + ", waga ładunku: " + loadWeight;
    }
}
