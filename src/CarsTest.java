public class CarsTest {
    public static void main(String[] args) {
        Car[] cars = new Car[6];
        cars[0] = new Car("BMW", 55, 7.5, false);
        cars[1] = new Car("Porsche", 45, 5, false);
        cars[2] = new Car("Mercedes", 60, 7, false);
        cars[3] = new Car("Skoda", 50, 6.5, false);
        cars[4] = new Truck("Volkswagen", 80, 9, false,200);
        cars[5] = new Truck("Fiat", 70, 11, false,500);

        printArray(cars);

        for(int i = 0; i<cars.length; i++){
            cars[i].setAirConditionOn(true);
        }

        System.out.println();
        printArray(cars);
    }

    private static void printArray(Car[] array){
        for(Car car : array){
            System.out.println(car.toString());
            System.out.println("-----------------------------------------------------");
        }
    }
}
