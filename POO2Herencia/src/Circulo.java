import java.util.Scanner;

public class Circulo extends Figura {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
       // float pi = 3.14159f;    usar la 'f' al final para que lo cree como float
        double area = Math.PI * (radio * radio);
        return area;
    }

    public void cargarDatos() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escriba el radio que quiere que tenga");
        radio = keyboard.nextFloat();
    }
}
