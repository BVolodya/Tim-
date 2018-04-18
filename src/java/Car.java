public class Car {
    // TODO If you create getters and setters for class fields please mark them like private
    String model;
    String colour;
    int year;
    int run;
    String brand;

    // TODO try use created methods [try to create object of this class - use setters to set values and getters to take value of field]
    public String getBrand() {
        return brand;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {}

    public int getYear() {
        return year;
    }

    public void setYear( int year ) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour( String colour ) {
        this.colour = colour;
    }

    public int getRun() {
        return run;
    }

    public void setRun( int run ) {
        this.run = run;
    }

    // TODO You should create 3 (or more) own class methods with different return types. For example method turnLeft();, turnRight();

    public Car ( String model, String colour, int year, int run, String brand){
        super();
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.run = run;
        this.brand = brand;
    }
}
