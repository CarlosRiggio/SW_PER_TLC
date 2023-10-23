package T11;

public class SecondHandVehicle extends Vehicle {
    private int numberOfOwners;

    public SecondHandVehicle(String regNo, String model, int year, double value, int numberOfOwners)
    {
        super(regNo, model, year, value);
        this.numberOfOwners = numberOfOwners;
    }

    public int getNumberOfOwners()
    {
        return numberOfOwners;
    }

    public boolean hasMultipleOwners(int numberOfOwners)
    {
        boolean result;

        if(numberOfOwners>1){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    
}
