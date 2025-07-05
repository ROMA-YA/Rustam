import TaskCar.Car;
import TaskCar.Driver;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Lada", 5f);
        Driver driver = new Driver("Roma", car);
        driver.driveByCar();
    }



}