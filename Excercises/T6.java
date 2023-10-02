import java.util.Scanner ; 

public class T6 {
    public static void main(String[] args)
    {
        // DisplayStars4();
        // ej3();
        // ej5();
        ej8();
    }

    public static void ej3()
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("*** EvenNumbers from 10 to 1 ***");
    System.out.println();
    System.out.print("Introduce the limit number: ");
    int limit = scan.nextInt();
    for (int i=1; i <= limit; i++) // counter movingdown from 10 to 1
    {
    // body of the loop contains in ‘if’ statement
    if (i%2 == 0) // check if number is even
    {
        System.out.println (i +" even"); // number displayed only when it is checked to be even
    }else{
        System.out.println( i +" odd");
    }
    }
    scan.close();
    }

    public static void ej5()
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            
            System.out.print("Introduce a number: ");
            int n = scan.nextInt();

            if(n>=2)
            {
                for(int i = 1; i <= 10; i++)
                    {
                        int result = i*n;
                        System.out.println(i +"x"+ n +"="+ result);
                    }

                System.out.print("Do you want to execute the programm again?[Y/N]:");
                scan.nextLine();
                String answer = scan.nextLine();
                answer = answer.toUpperCase();
                if(answer.equals("N"))
                {
                    break;
                }
                
            }else{
                System.out.println("Introduce a number higher than 2");
            }
            
            // scan.close();    
        }
        
    }

    public static void ej8()
    {
        Scanner scan = new Scanner(System.in);
        int answer = 0;
        int radius = 0;
        double pi = 3.14;
        while(answer != 5) {
            System.out.println("Select an option:");
            System.out.println("[1] Set radius");
            System.out.println("[2] Display radius");
            System.out.println("[3] Display area");
            System.out.println("[4] Display perimeter");
            System.out.println("[5] Quit");

            answer = scan.nextInt();

            switch(answer)
            {
                case 1: 
                    System.out.print("Introduce the value of the radio:");
                    radius = scan.nextInt();
                    break;
                case 2: 
                    System.out.println("The radius value is: "+radius );
                    break;
                case 3:
                    double area = pi*(radius*radius);
                    System.out.println("The area of the circunference is: "+ area);
                    break;
                case 4:
                    double perimeter = 2*pi*radius;
                    System.out.println("The perimeter of the circunference is: "+ perimeter);
                    break;
                case 5: 
                    break;

            }



            
        } 
    }
    

    public static void DisplayStars4()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce the number of colums: ");
        int columns = scan.nextInt();
        scan.nextLine();

        System.out.print("Introduce the number of rows: ");
        int rows = scan.nextInt();
        scan.nextLine();

        for(int j = 0; j< rows;j++)
        {
            for(int i = 0 ; i<columns;i++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
        scan.close();
    }
}
