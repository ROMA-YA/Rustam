package TaskCar;

public class Driver {
    private String driverName; //дмя водителя
    private Car car; //машина водителя

    public Driver(String driverName, Car car){
        this.driverName = driverName;
        this.car = car;
    }

    public String getDriverName() {
        return driverName;
    }

    public Car getCar() {
        return car;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setCar(Car car) {
        this.car = car;
    }



    public void driveByCar(){
        float fuel = car.getFuelQuantity();

        if (fuel == 0){
            System.out.println("Сегодня я никуда не поеду");
        } else if (fuel < 10) {
            System.out.println("Ох, давай до заправки");
            car.setDriver(this);
            car.drive(this);
        }else {
            System.out.println("Вроде прав я, давай поехали");
            car.setDriver(this);
            car.drive(this);
        }
    }


}
