package conversor.modulos;

import com.google.gson.Gson;

public class ConvierteJson implements IConvierteDivisas {
    private final Gson gson = new Gson();

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        return gson.fromJson(json, clase);
    }
}
