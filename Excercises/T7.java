import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        // ej3();
        ej4();
    }

    public static void ej3() {
        Scanner scan = new Scanner(System.in);

        double euros = ej3_get_money(scan);
        double fee = ej3_get_fee(scan);
        double result = ej3_conversion(euros, fee);
        ej3_display_result(result);

        scan.close(); // Cierra el Scanner cuando hayas terminado de usarlo.
    }

    public static double ej3_get_money(Scanner scan) {
        System.out.print("Introduce the amount of money you want to be converted from euros to another changing fee: ");
        float euros = scan.nextFloat();
        return euros;
    }

    public static double ej3_get_fee(Scanner scan) {
        System.out.print("Introduce the fee [0.1, 0.9]: ");
        float fee = scan.nextFloat();
        return fee;
    }

    public static double ej3_conversion(double euros, double fee) {
        double result = euros * fee;
        return result;
    }

    public static void ej3_display_result(double result) {
        System.out.println("The result is: " + result);
    }


    public static void ej4()
    {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("[1] Celsius to Fahrenheit");
            System.out.println("[2] Farenheit to Celsius");
            System.out.println("[3] Exit");
            System.out.print("Select any of this options: ");
            option = scan.nextInt();

            switch(option)
            {
                case 1:
                    System.out.print("Introduce a Celsius temperature: ");
                    double celsius = scan.nextDouble();
                    if(celsius<-273.15){
                        System.out.println("Celsius temperature should be higher than -273.15");
                    }else{
                        double fahr = (celsius*(1.8))+32;
                        System.out.println("The Fahernheit temperature is: "+fahr);
                    }
                    
                    break;
                case 2: 
                    System.out.print("Introduce a Farenheit temperature: ");
                    double farenheit = scan.nextDouble();
                    if(farenheit<-459.67){
                        System.out.println("Fareheit temperature should be higher than -459.67");
                    }else{
                        double cels = (farenheit-32)*(5/9);
                        System.out.println("The Celsius temperature is: "+cels);
                    }
                    
                    break;
                case 3:
                    break;
            }

        } while (option!=3);

        
    }
}
