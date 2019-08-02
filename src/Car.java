public class Car extends Vehicle {
    private boolean isAirConditionOn;

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
            extraMileage+=0.8;
        }
        return super.calculateTotalMileage() + extraMileage;
    }

    @Override
    public double calculateRange() {
        return super.calculateRange();
    }

    @Override
    public String toString() {
        return super.toString() + ", ma włączoną klimatyzację?: "
                + isAirConditionOn;
    }
}
