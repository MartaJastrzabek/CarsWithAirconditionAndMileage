public class Truck extends Car{
    private double loadWeight;
    private static final double AC_EXTRA_FUEL_COST = 1.6;
    private static final double LOAD_EXTRA_FUEL_COST = 0.5;

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
            extraMileage += AC_EXTRA_FUEL_COST;
        }
        // casting weight division to int to remove residue
        extraMileage += ((int)(loadWeight / 100)) * LOAD_EXTRA_FUEL_COST;
        return getAverageMileage() + extraMileage;
    }

    @Override
    public String toString() {
        return super.toString() + ", waga ładunku: " + loadWeight;
    }
}
