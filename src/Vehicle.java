import java.util.Locale;

public class Vehicle {
    private String name;
    private double fuelTankCapacity;
    private double averageMileage; //per 100km

    public Vehicle() {
    }

    public Vehicle(String name, double fuelTankCapacity, double averageMileage) {
        this.name = name;
        this.fuelTankCapacity = fuelTankCapacity;
        this.averageMileage = averageMileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getAverageMileage() {
        return averageMileage;
    }

    public void setAverageMileage(double averageMileage) {
        this.averageMileage = averageMileage;
    }

    public double calculateTotalMileage(){
        return averageMileage;
    }

    public double calculateRange(){
        return (fuelTankCapacity*100)/calculateTotalMileage();
    }

    @Override
    public String toString() {
        return "Nazwa pojazdu: "  + name + ", pojemność baku: "
                + fuelTankCapacity + " l, \nśrednie spalanie na 100 km: "
                + averageMileage + " całkowite spalanie: " + String.format(Locale.US,"%.1f",calculateTotalMileage()) + "\nzasięg na pełnym baku wynosi: "
                + String.format(Locale.US,"%.1f", calculateRange()) + " km";
    }


}
