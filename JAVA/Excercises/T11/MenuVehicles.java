package T11;
import java.util.ArrayList;
import java.util.Scanner ; 

public class MenuVehicles {


    public static void main(String[] args)
    {
        ArrayList<Vehicle> list = new ArrayList<>();
        int choice = 0;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Select an option:");
            System.out.println("1- Add a vehicle.");
            System.out.println("2- Display a list of vehicle details");
            System.out.println("3- Delete a vehicle");
            System.out.println("4- Quit");
            System.out.print("Choice: ");
            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Add regNo: ");
                    String regNo = scan.next(); // Usar scan.next() en lugar de scan.nextLine()
                    System.out.print("Add model: ");
                    String model = scan.next();
                    System.out.print("Add year: ");
                    int year = scan.nextInt();
                    System.out.print("Add value: ");
                    double value = scan.nextDouble();
                    Vehicle vehicle = new Vehicle(regNo, model, year, value);
                    list.add(vehicle);
                    System.out.println("Vehicle added");
                    System.out.println();
                    break;
                case 2: 
                    for (int i = 0; i < list.size(); i++) {
                        Vehicle v = list.get(i);
                        System.out.println("Vehicle " + (i + 1) + ":");
                        System.out.println("RegNo: " + v.getRegNo());
                        System.out.println("Model: " + v.getModel());
                        System.out.println("Year: " + v.getYear());
                        System.out.println("Value: " + v.value());
                        System.out.println();
                    }
                    System.out.println();
                    break;
                
                case 3: 
                    System.out.print("Introduce the tuition of the car you want to delete: ");
                    scan.nextLine();
                    String matricula = scan.nextLine();

                    for(int j = 0; j<list.size(); j++)
                    {
                        Vehicle v3 = list.get(j);
                        if(v3.getRegNo().equals(matricula))
                        {
                            list.remove(j);
                            System.out.println("Car removed");
                        }
                    }

                    System.out.println();
                    break;

                case 4:
                    break;
            }
        } while (choice !=4);
        scan.close();

        


    }

    
}
