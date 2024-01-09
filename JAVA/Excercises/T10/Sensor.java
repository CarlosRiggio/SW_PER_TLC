import java.util.Scanner;

public class Sensor {
    private double pressure;

    public Sensor(){}

    public Sensor(double inpressure){
        pressure = inpressure;
    }

    public boolean setPressure(double inpressure){
       
       if(inpressure<0){
        return false;
       }else{
        pressure = inpressure;
        return true;
       }
       
        
    }

    public double getPressure(){
        return pressure;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean condition = false;
        Sensor s = new Sensor();
        System.out.println("La presion del sensor con contructor vacio: " + s.getPressure());

        Sensor se = new Sensor(3);
        System.out.println("La presion del sensor con constructor no vacio: " + se.getPressure());

        do {
            System.out.print("Introduce a pressure >0: ");
            double p = scan.nextDouble();
            condition = s.setPressure(p);
            System.out.println("The pressure chosen: " +s.getPressure());
        } while (condition== false);
        scan.close();
    }
}
