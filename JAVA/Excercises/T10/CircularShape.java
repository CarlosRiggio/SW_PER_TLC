import java.util.Scanner;

public class CircularShape {

    private double radius;

    CircularShape(double inradius){
        radius = inradius;
    }

    public void setRadius(double inradius){
        radius = inradius;
    }

    public double getRadius(){
        return radius;
    }

    public double calculateArea(){
        return 3.14*radius*radius;
    }
    
    public double calculateCircunference(){
        return 2*3.14*radius;
    }

    public double calculateDiameter(){
        return 2* radius;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce the raidus: " );
        double radius = scan.nextDouble();
        CircularShape cs = new CircularShape(radius);
        System.out.println("El radio es: "+ cs.getRadius());
        System.out.println("La circnferencia es: " + cs.calculateCircunference());
        System.out.println("El diametro es: " + cs.calculateDiameter());
        scan.close();
    }


}