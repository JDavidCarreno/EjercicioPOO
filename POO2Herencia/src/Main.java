
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Figura> figuras = new ArrayList<>();

    public static void main(String[] args) {

        boolean mostrarMenu = true;

        while (mostrarMenu) {
            System.out.println("**** MENU ****");
            System.out.println("1. Crear una figura");
            System.out.println("2. Mostrar la sumatoria de areas de la figura");
            System.out.println("0. Salir");

            Scanner key = new Scanner(System.in);
            int selection = key.nextInt();

            switch (selection) {
                case 1:
                    crearFigura();
                    break;
                case 2:
                    mostrarSumatoriaDeFiguras();
                    break;
                case 0:
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("Opcion NO válida");
                    break;
            }
        }

    }

    private static void crearFigura() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Que figura desea crear?");
        System.out.println("1) Circulo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Triángulo");

        Integer option = keyboard.nextInt();

        if (option == 1) {
            Circulo circulo = new Circulo();
            circulo.cargarDatos();
            System.out.println("El radio de tu circulo es " + circulo.calcularArea());
            figuras.add(circulo);
        }

        if (option == 2) {
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.cargarDatos();
            System.out.println("El area de tu cuadrado es " + cuadrado.calcularArea());
            figuras.add(cuadrado);
        }

        if (option == 3) {
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            System.out.println("El área de tu triángulo es de: " + triangulo.calcularArea());
            figuras.add(triangulo);
        }
    }

    private static void mostrarSumatoriaDeFiguras() {
        double sumatoriaDeAreas = 0;
        for (Figura figura : figuras) {
            sumatoriaDeAreas += figura.calcularArea();
        }
        System.out.println("la sumatoria es: " + sumatoriaDeAreas + " cm.");
    }
}