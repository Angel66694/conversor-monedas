package conversor.modulos;

public class Monedas {
    private String monedaDeOrigen;
    private String monedaDeDestino;
    private Double respuestaApi;
    private double totalConvercion;

    public Double getRespuestaApi() {
        return respuestaApi;
    }

    public void setRespuestaApi(Double respuestaApi) {
        this.respuestaApi = respuestaApi;
    }

    public String getMonedaDeOrigen() {
        return monedaDeOrigen;
    }

    public void setMonedaDeOrigen(String monedaDeOrigen) {
        this.monedaDeOrigen = monedaDeOrigen;
    }

    public String getMonedaDeDestino() {
        return monedaDeDestino;
    }

    public void setMonedaDeDestino(String monedaDeDestino) {
        this.monedaDeDestino = monedaDeDestino;
    }

    public double getTotalConvercion() {
        return totalConvercion;
    }

    public void setTotalConvercion(double totalConvercion) {
        this.totalConvercion = totalConvercion;
    }

}
