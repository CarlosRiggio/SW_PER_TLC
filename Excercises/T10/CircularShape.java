

public class CircularShape {
    private double radio;

    public CircularShape(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radio;
    }

    public double calcularDiametro() {
        return 2 * radio;
    }

    public static void main(String[] args) {
        // Crear una instancia de CircularShape con un radio de 5.0
        CircularShape circulo = new CircularShape(5.0);

        // Mostrar el radio
        System.out.println("Radio del círculo: " + circulo.getRadio());

        // Calcular y mostrar el área
        System.out.println("Área del círculo: " + circulo.calculateArea());

        // Calcular y mostrar la circunferencia
        System.out.println("Circunferencia del círculo: " + circulo.calculateCircumference());

        // Calcular y mostrar el diámetro
        System.out.println("Diámetro del círculo: " + circulo.calcularDiametro());
    }
}
