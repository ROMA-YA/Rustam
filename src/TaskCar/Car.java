package TaskCar;

public class Car {
    private String modelName; // название модели
    private Float fuelQuantity; // количество топлива
    public Driver driver = null;

    public String getModelName() {
        return modelName;
    }

    public Float getFuelQuantity() {
        return fuelQuantity;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setFuelQuantity(Float fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public Car(String modelName, float fuelQuantity){
        this.modelName = modelName;
        this.fuelQuantity = fuelQuantity;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public void drive(Driver driver){
        System.out.println("Ну что " + driver.getDriverName() + ", " + modelName + " отвезет тебя куда угодно.");
    }

}
