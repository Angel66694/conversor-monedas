package conversor.modulos;

import java.util.Scanner;

public class ConvertidorGrados {
    private final Scanner teclado = new Scanner(System.in);


    public void convertidor() {

        System.out.println("Ingresa la temperatura en grados Celsius:");
        double celsius = teclado.nextDouble();
        double fahrenheit = convertirCelsiusAFahrenheit(celsius);
        System.out.println("***********************************\n");
        System.out.println("El resultado de la convercion es: ");
        System.out.println(celsius + " grados Celsius equivalen a: "
                + fahrenheit + " grados Fahrenheit\n");

    }
    // Método para convertir grados Celsius a Fahrenheit
    private double convertirCelsiusAFahrenheit( double celsius){
        return (celsius * 9 / 5) + 32;
    }
}