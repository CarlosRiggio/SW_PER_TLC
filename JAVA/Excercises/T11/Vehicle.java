package T11;

public class Vehicle {
    private String regNo;
    private String model;
    private int year;
    private double value;

    public Vehicle(String regNo, String model, int year, double value)
    {
        this.regNo = regNo;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    public String getRegNo()
    {
        return regNo;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public double value()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    // CALCULATE AGE??

}
