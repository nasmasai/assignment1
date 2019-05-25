public class Water extends Vehicles{
    public int numberOfPropellers;
    public int Depth;

    public Water(String manufacturer, String capacity, int numberOfPropellers, int Depth) {
        super(manufacturer, capacity);
        this.numberOfPropellers = numberOfPropellers;
        this.Depth = Depth;
    }



    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public int getDepth() {
        return Depth;
    }

    public void setDepth(int Depth) {
        this.Depth = Depth;
    }

    public void printWaterDetails(){
        System.out.println("Type: "+Land.class.getName()+" Manufacturer:" +getManufacturer() +"Number of Propellers"+numberOfPropellers+"Depth"+Depth);

    }
}



