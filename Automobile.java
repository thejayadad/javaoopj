public class Automobile {
    private String make;
    private  String model;
    private  String color;
    private int year;
    private int mileage;
    private int vinNum;

    public Automobile(String make, String model, String color, int year, int mileage, int vinNum){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.vinNum = vinNum;
    }

    @Override
    public String toString(){
        String invetory = "";
        invetory = "Make: " + make + "| " + " Model: " + model + "| " + " Color: " + color + "| " +" Year: " + year + "| " + " Mileage: " + mileage + "| " + " Vin Number" + vinNum;
        return invetory;

    }

    public int getVin(){
        return this.vinNum;
    }
}
