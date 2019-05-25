public class Land extends Vehicles{
    public String purpose;
    public int numberOfWheels;
    public int FuelConsumption;

    public Land(String manufacturer, String capacity, String purpose, int numberOfWheels, int FuelConsumption) {
        super(manufacturer, capacity);
        this.purpose = purpose;
        this.numberOfWheels = numberOfWheels;
        this.FuelConsumption = FuelConsumption;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelConsumption() {
        return FuelConsumption;
    }

    public void setFuelConsumption(int amountOfFuel) {
        this.FuelConsumption = FuelConsumption;
    }

    public void printLandDetails(){
        System.out.println(" Manufacturer:" +getManufacturer() +"Capacity"+capacity+"Wheels"+numberOfWheels+"Consumption"+FuelConsumption);

    }
}


