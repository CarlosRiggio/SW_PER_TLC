

public class Sensor {
    private double presion;

    public Sensor() {
        this.presion = 0.0;
    }

    public Sensor(double presion) {
        if (presion >= 0.0) {
            this.presion = presion;
        } else {
            this.presion = 0.0;
        }
    }

    public boolean setPresion(double presion) {
        if (presion >= 0.0) {
            this.presion = presion;
            return true;
        } else {
            return false;
        }
    }

    public double getPresion() {
        return presion;
    }



    public static void main(String[] args) {
        // Crear un objeto Sensor con presión inicial de cero
        Sensor sensor1 = new Sensor();
        System.out.println("Presión del sensor 1: " + sensor1.getPresion());

        // Crear un objeto Sensor con presión inicial de 5.0
        Sensor sensor2 = new Sensor(5.0);
        System.out.println("Presión del sensor 2: " + sensor2.getPresion());

        // Intentar establecer una presión negativa en sensor1
        boolean resultado1 = sensor1.setPresion(-2.0);
        if (resultado1) {
            System.out.println("Presión del sensor 1 después del ajuste: " + sensor1.getPresion());
        } else {
            System.out.println("No se pudo ajustar la presión del sensor 1 a un valor negativo.");
        }

        // Intentar establecer una presión negativa en sensor2
        boolean resultado2 = sensor2.setPresion(-2.0);
        if (resultado2) {
            System.out.println("Presión del sensor 2 después del ajuste: " + sensor2.getPresion());
        } else {
            System.out.println("No se pudo ajustar la presión del sensor 2 a un valor negativo.");
        }
    
}
}

