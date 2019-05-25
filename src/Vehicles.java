public class Vehicles {



    public String manufacturer;
    public String capacity;

    public Vehicles(String manufacturer, String capacity) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;}
        public void printVehiclesDetails(){
            System.out.println("Manufacturer: "+manufacturer+"Capacity:"+capacity);
        }
    }





