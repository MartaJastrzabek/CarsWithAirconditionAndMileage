public class Car extends Vehicle {
    private boolean isAirConditionOn;
    private static final double AC_EXTRA_FUEL_COST = 0.8;

    public Car() {
    }

    public Car(String name, double fuelTankCapacity, double averageMileage, boolean isAirConditionOn) {
        super(name, fuelTankCapacity, averageMileage);
        this.isAirConditionOn = isAirConditionOn;
    }

    public boolean isAirConditionOn() {
        return isAirConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        isAirConditionOn = airConditionOn;
    }

    @Override
    public double calculateTotalMileage() {
        double extraMileage = 0;
        if(isAirConditionOn){
            extraMileage += AC_EXTRA_FUEL_COST;
        }
        return super.calculateTotalMileage() + extraMileage;
    }

    @Override
    public String toString() {
        return super.toString() + ", ma włączoną klimatyzację?: "
                + isAirConditionOn;
    }
}
