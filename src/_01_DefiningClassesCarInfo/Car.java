package _01_DefiningClassesCarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setHorsePower(int newHorsePower) {
        this.horsePower = newHorsePower;
    }

    public String carInfo(){
        return toString();
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower());
    }

}
