package conversor.service;


import com.google.gson.Gson;
import conversor.modulos.ConsumoAPI;
import conversor.modulos.ConversorDivisas;
import conversor.modulos.ConvierteJson;
import conversor.modulos.Monedas;

import java.text.DecimalFormat;

public class Buscar extends ConversorDivisas {
    private final ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://v6.exchangerate-api.com/" +
            "v6/09db8e2e2fa7b42ff96391d5/pair/";
    private final ConvierteJson conversor = new ConvierteJson();
    private final Gson gson = new Gson();

    @Override
    public void Divisas() {
        super.Divisas();

        Monedas monedas = getMonedas();

        // Imprimir la URL antes de enviar la solicitud
        String url = URL_BASE + monedas.getMonedaDeOrigen() + "/" + monedas.getMonedaDeDestino();

        try {
            // Enviar la URL al método obtenerDatos
            String json = consumoApi.obtenerDatos(url);
            //System.out.println("JSON recibido de la API: " + json);

            boolean exitoso = !json.contains("error");

            if (exitoso) {
                // Convertir el JSON a un objeto Java utilizando Gson
                RespuestaAPI respuestaAPI = gson.fromJson(json, RespuestaAPI.class);

                // Obtener el valor de conversion_rate como double
                double conversionRate = respuestaAPI.getConversionRate();

                // Obtener la cantidad de la moneda de origen
                double cantidadMonedaOrigen = monedas.getTotalConvercion();

                // Guardar el resultado en Monedas
                monedas.setRespuestaApi(conversionRate);
                Operacion();
            } else {
                System.err.println("La API devolvió un error.");
            }
        } catch (Exception e) {
            System.err.println("Error al obtener o procesar los datos de la API: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void Operacion(){
        Double respuestaApi = monedas.getRespuestaApi();
        Double totalConvercion = monedas.getTotalConvercion();
        System.out.println("*********************************");

        if (respuestaApi != null && totalConvercion != null) {
            Double total = respuestaApi * totalConvercion;

            DecimalFormat df = new DecimalFormat("#.##");
            total = Double.valueOf(df.format(total));

            System.out.println(totalConvercion + " Es equivalente a: " + total);
            System.out.println("*********************************\n");
        } else {
            System.out.println("Error:");
        }
    }

    private Monedas getMonedas() {
        return super.monedas; // Devuelve la instancia de Monedas de la superclase
    }
}

// Clase para representar la respuesta de la API en formato Java
class RespuestaAPI {
    private double conversion_rate;

    public double getConversionRate() {
        return conversion_rate;
    }
}
