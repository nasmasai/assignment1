public class Air extends Vehicles{
    public int numberOfEngines;
    public String type;

    public Air(String manufacturer, String capacity, int numberOfEngines, String type) {
        super(manufacturer, capacity);
        this.numberOfEngines = numberOfEngines;
        this.type = type;
    }



    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type
        ;
    }

    public void printAirDetails(){
        System.out.println(" Manufacturer:" +getManufacturer() +"Capacity"+capacity+"Engines"+numberOfEngines+"Type"+type);

    }
}




