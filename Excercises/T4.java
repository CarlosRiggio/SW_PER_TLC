import java.util.Scanner ; // import the Scanner class from the util package

public class T4
{
    public static void main(String[] args)
    {
        // ej1();
        // ej2();
        // ej3();
        // ej4();
        // ej5();
        ej6();

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
        keyboard.close();
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
        scan.close();
        
    }

    public static void ej3()
    {
        final double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce the radio of the circunference: ");
        double radio = scan.nextDouble();
        double area = pi*(radio*radio);
        System.out.println("The area of the circunference is: "+ area);
        scan.close();
    }

    public static void ej4()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce a weight in pounds: ");
        double pounds = scan.nextDouble();
        double kg = pounds/2.2;
        System.out.println("The weight in Kg is: "+ kg);
        scan.close();
    }

    public static void ej5()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce your weight (kg): ");
        double weight = scan.nextDouble();
        System.out.print("Introduce your height (m): ");
        double height = scan.nextDouble();
        double IMC = weight/(height*height);
        System.out.println("Your IMC is: "+ IMC);
        scan.close();
    }

    public static void ej6()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce the number of students: ");
        int number_students = scan.nextInt();
        System.out.print("Introduce the size of the groups: ");
        int size_group = scan.nextInt();
        int groups_done = number_students/size_group;
        int remaining_students = number_students%size_group;
        System.out.println("Groups done: "+ groups_done);
        System.out.println("Remainig students: "+ remaining_students);
        scan.close();
    }

}