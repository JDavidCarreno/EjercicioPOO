import java.util.Scanner;

public abstract class PoligonoRegular extends Figura {
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargarDatos() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escriba la base que quiere que tenga");
        base = keyboard.nextDouble();
        System.out.println("Escriba la altura que quiere que tenga");
        altura = keyboard.nextDouble();
    }
}
