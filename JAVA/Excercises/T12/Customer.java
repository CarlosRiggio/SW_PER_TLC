package T12;



public class Customer implements Checkable{

    private String customerId;
    private String name;
    private double creditLimit;

    public Customer(String IdIn, String nameIn, double limitIn) {
        customerId = IdIn;
        name = nameIn;
        creditLimit = limitIn;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double limitIn) {
        creditLimit = limitIn;
    }

    @Override

    public boolean booleancheck()
    {
        boolean decision;
        
     if(Character.isLetter(customerId.charAt(0)) && Character.isDigit(customerId.charAt(1)) && Character.isDigit(customerId.charAt(2)) && Character.isDigit(customerId.charAt(3)))
     {
        decision = true;
     }else{
        decision= false;
     }

        return decision;
    }

    public boolean checkcustomer(Customer customer)
    {
        return true;
    }


    public static void main(String[] args) {
        Customer customer = new Customer("A1B3", "JC", 3);
        boolean check = customer.booleancheck();
        System.out.println("The id of customer is correct: "+ check);
    }






}
