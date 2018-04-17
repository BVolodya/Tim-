public class BMW extends Car {
    private int maxSpid;


    public BMW( String model, String colour, int year, int maxSpid, int run, String brand ) {
        super(model, colour, year, run, brand);
        this.maxSpid = maxSpid;
    }

    public int getMaxSpid() {
        return maxSpid;
    }

    public void setMaxSpid( int maxSpid ) {
        this.maxSpid = maxSpid;
    }

    public String toString() {
        return "\n car brand " + brand +
                "\n model " + model +
                "\n colour " + colour +
                "\n year " + year +
                "\n maxSpid " + maxSpid +
                "\n run " + run;

    }
}
