

package conversor.Principal;



import conversor.modulos.ConversorDivisas;
import conversor.modulos.ConvertidorGrados;
import conversor.modulos.Mensajes;
import conversor.modulos.Monedas;
import conversor.service.Buscar;

import java.util.Scanner;


public class Principal {
    public void setMenu(){

        Scanner teclado = new Scanner(System.in);
        Mensajes mensajes = new Mensajes();
        Monedas monedas = new Monedas();
        ConversorDivisas conversorDivisas = new ConversorDivisas();
        ConvertidorGrados convertidorGrados = new ConvertidorGrados();
        Buscar buscar = new Buscar();


        mensajes.menjaEntrada();
        mensajes.menuInicio();
        int lectura = teclado.nextInt();

        while (lectura != 9) {
            switch (lectura) {
                case 1:
                    buscar.Divisas();
                    break;
                case 2:
                    convertidorGrados.convertidor();
                    break;
                case 3:
                    mensajes.mensaje();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige nuevamente.");
                    break;
            }
           mensajes.menjaEntrada();
            mensajes.menuInicio();
            lectura = teclado.nextInt();
            teclado.nextLine();
            //teclado.close();
        }

        System.out.println("Gracias por usar nuestro convertidor ¡Hasta luego!");
    }


}