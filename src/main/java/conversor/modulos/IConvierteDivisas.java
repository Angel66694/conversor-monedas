package conversor.modulos;

public interface IConvierteDivisas {

    <T> T obtenerDatos(String json, Class<T> clase);
}
