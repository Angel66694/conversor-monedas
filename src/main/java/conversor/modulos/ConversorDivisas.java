package conversor.modulos;

import java.util.Scanner;

public class ConversorDivisas {
    private final Scanner teclado = new Scanner(System.in);
    protected Monedas monedas = new Monedas();
    private final String[] tiposDeCambioDisponibles =
            {"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN",
            "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL",
            "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY",
            "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP",
            "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP", "GHS",
            "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF",
            "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD",
            "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD", "KZT",
            "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD",
            "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN",
            "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK",
            "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR",
            "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLE", "SOS", "SRD", "SSP",
            "STN", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD",
            "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VES", "VND",
            "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR"};

    public boolean esNumero(String str) {
        return str.matches("\\d+");
    }

    public void Divisas() {
        System.out.println("Ingresa el tipo de cambio que deseas convertir:");
        String monedaOrigen = teclado.nextLine();

        if (!validarTipoDeCambio(monedaOrigen, tiposDeCambioDisponibles)) {
            System.out.println("Tipo de cambio no válido. Por favor, elige uno de la lista.");
            return;
        }
        monedas.setMonedaDeOrigen(monedaOrigen);

        System.out.println("Ingresa el tipo de cambio al que deseas convertir:");
        String monedaDestino = teclado.nextLine();

        if (!validarTipoDeCambio(monedaDestino, tiposDeCambioDisponibles)) {
            System.out.println("Tipo de cambio no válido. Por favor, elige uno de la lista.");
            return;

        }
        monedas.setMonedaDeDestino(monedaDestino);

        System.out.println("Ingresa la cantidad que deseas convertir:");
        String cantidadStr = teclado.nextLine();

        if (!esNumero(cantidadStr)) {
            System.out.println("El valor que ingresaste no es válido");
            return;
        }


        double cantidad = Double.parseDouble(cantidadStr);
        monedas.setTotalConvercion(cantidad);


        // Llamar al método de búsqueda o cualquier otra lógica de conversión
    }

    private boolean validarTipoDeCambio(String tipoCambio, String[] tiposDeCambioDisponibles) {
        for (String tipo : tiposDeCambioDisponibles) {
            if (tipo.equals(tipoCambio)) {
                return true;
            }
        }
        return false;
    }
}