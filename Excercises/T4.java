import java.util.Scanner ; // import the Scanner class from the util package

public class T4
{
    public static void main(String[] args)
    {
        ej2();

    }

    public static void ej1()
    {
        Scanner keyboard= new Scanner(System.in); // create Scanner object
        double price, tax;
        System.out.println("*** Product Price Check ***");
        System.out.print("Enter initial price: "); // prompt for input
        price = keyboard.nextDouble(); // input methodcalled
        System.out.print("Entertax rate: "); // prompt for input
        tax = keyboard.nextDouble(); // input methodcalled
        price = price * (1 + tax/100); // performthe calculation
        System.out.println("Cost after tax = " + price);
    }

    public static void ej2()
    {
        Scanner scan = new Scanner(System.in);
        double widht, height, perimeter, area;
        System.out.print("Width: ");
        widht = scan.nextDouble();
        System.out.print("Height: ");
        height = scan.nextDouble();
        perimeter = 2*widht + 2*height;
        area = widht*height;
        System.out.println("Area: "+area+ " Perimeter: "+perimeter);
        
    }

}