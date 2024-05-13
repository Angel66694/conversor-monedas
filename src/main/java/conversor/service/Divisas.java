package conversor.service;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Divisas (
        @JsonAlias("conversion_rate") double respuestaApi
){
    public double totalDivisa(double cantidad) {
        return respuestaApi * cantidad;
    }

}
