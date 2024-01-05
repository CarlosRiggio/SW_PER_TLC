package T12;

public class CheckableCustomer extends Customer implements Checkable {
    
    public CheckableCustomer(String IdIn, String nameIn, double limitIn)
    {
        super(IdIn, nameIn, limitIn);
    }

    @Override
    public boolean checkcustomer(Customer c)
    {
        boolean decision;
        String Id = c.getCustomerId();
        String name = c.getName();
        Double limit = c.getCreditLimit();

        if(Character.isLetter(Id.charAt(0)) && Character.isDigit(Id.charAt(1)) && Character.isDigit(Id.charAt(2)) && Character.isDigit(Id.charAt(3)) && ( name instanceof String  && name.length()!=0) && limit!=null)
        {
           decision = true;
        }else{
           decision= false;
        }
   
           return decision;
    
    }

    public static void main(String[] args) {
        CheckableCustomer checkableCustomer = new CheckableCustomer(args[0], args[1], Double.parseDouble(args[2]));
        boolean decision = checkableCustomer.checkcustomer(checkableCustomer);
        System.out.println(decision);
    }
}

