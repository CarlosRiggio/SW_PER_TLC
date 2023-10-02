import java.util.Scanner;

public class T5 {

    public static void main(String[] args)
    {
        // ej1();
        // ej2();
        // ej3();
        // ej4();
        ej5();
    }

    public static void ej1()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce N1: ");
        double N1 = scan.nextDouble();
        System.out.print("Introduce N2: ");
        double N2 = scan.nextDouble();
        if(N1==N2)
        {
            System.out.println("EQUAL");
        }else{
            System.out.println("NOT EQUAL");
        }
        scan.close();
    }

    public static void ej2()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce N1: ");
        double N1 = scan.nextDouble();
        System.out.print("Introduce N2: ");
        double N2 = scan.nextDouble();
        if(N1==N2)
        {
            System.out.println("EQUAL");
        }else{
            if(N1>N2)
            {
                System.out.println("First name in higher");
            }else{ // n2 es mayor
                System.out.println("Second name is higher");
            }
        }
        scan.close();

    }

    public static void ej3()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce N1: ");
        double N1 = scan.nextDouble();
        System.out.print("Introduce N2: ");
        double N2 = scan.nextDouble();
        System.out.print("Introduce N1+N2: ");
        double user_add = scan.nextDouble();
        double add = N1+N2;
        if(add==user_add)
        {
            System.out.println("CORRECT");
        }else{
            System.out.println("WRONG. Correct answer: " + add);
        }
        scan.close();
    }

    public static void ej4()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce your weight (kg): ");
        double weight = scan.nextDouble();
        System.out.print("Introduce your height (m): ");
        double height = scan.nextDouble();
        double IMC = weight/(height*height);
        System.out.println("Your IMC is: "+ IMC);
        if(IMC < 18.5)
        {
            System.out.println("UnderWeight");
        }else{
            if(IMC > 24.9){
                System.out.println("OverWeight");
            }else{
                System.out.println("Healthy");
            }
        }
        scan.close();
    }

    public static void ej5()
    {
        Scanner scan = new Scanner(System.in);
        double final_price;
        final double base_price = 375.99;
        System.out.print("Which size of screen do you want (38 or 43):");
        int screen_size = scan.nextInt();
        scan.nextLine(); // this is done in order to consume the /n typed in the line where we type the number
        if(screen_size == 38)
        {
            final_price = base_price + 75.99;
        } else{
            final_price = base_price + 99.99;
        }

        System.out.print("Do you want to add Antivirus? (Y/N):");
        String virus_answer = scan.nextLine();
        if(virus_answer.equals("Y"))
        {
            final_price = final_price + 65.99;
        }


        System.out.print("Do you want to add Printer? (Y/N):");
        String printer_answer = scan.nextLine();
        if(printer_answer.equals("Y"))
        {
            final_price = final_price + 125.00;
        }

        scan.close();

        System.out.println("The final price of your PC is: " + final_price);
        
    }

    public static void ej6()
    {
        
    }

    public static void ej_slides()
    {
        double price, tax;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("*** Product Price Check ***");
        System.out.print("Enterinitialprice: ");
        price = keyboard.nextDouble();
        System.out.print("Entertax rate: ");
        tax = keyboard.nextDouble();
        // the following 'if' statement allows a selection to take place
        if (price > 100) // test the price to see if a discount applies
        // these two instructions executed only when the test is true
        System.out.println ("Special Promotion: We pay half your");
        tax = tax * 0.5;
        // the remaining instructions are always executed
        price = price * (1 + tax/100); // performthe calculation
        System.out.println("Cost after tax = " + price);
        keyboard.close();
    }
    

}


