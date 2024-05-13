

# Convertidor de Divisas y Temperaturas

![Logo del Proyecto](URL_DEL_LOGO)

---

## Descripción

El **Convertidor de Divisas y Temperaturas** es un proyecto desarrollado en Java que proporciona una herramienta eficiente para realizar conversiones entre diferentes monedas internacionales y unidades de temperatura. A continuación, se detallarán todas las características del proyecto, su instalación, uso, requisitos y cómo contribuir al mismo.

---

## Funcionalidades

- **Conversión de Divisas:**
    - Utiliza la API de ExchangeRate-API para obtener tasas de cambio en tiempo real.
    - Conversión entre una amplia gama de monedas internacionales.
    - Visualización de la tasa de cambio utilizada en la conversión.
    - Captura de errores en caso de ingreso de monedas inválidas o problemas de conexión.

- **Conversión de Temperaturas:**
    - Permite convertir entre grados Celsius, Fahrenheit y Kelvin.
    - Conversión precisa y rápida entre las diferentes escalas de temperatura.
    - Soporte para ingreso de valores negativos y positivos.
    - Validación de datos de entrada para asegurar la precisión en la conversión.

---

## Arquitectura del Proyecto

El proyecto está estructurado en varios paquetes y clases que se encargan de funciones específicas:

- **conversor.Principal:** Contiene la clase `Principal` que actúa como punto de entrada al programa y muestra el menú principal al usuario.
- **conversor.modulos:** En este paquete se encuentran las clases relacionadas con la lógica de conversión, mensajes y consumo de la API.
- **conversor.service:** Aquí se implementa la clase `Buscar` que se encarga de realizar las consultas a la API y realizar las operaciones de conversión.

---

## Instalación y Ejecución

### Requisitos del Sistema

Antes de instalar y ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

- Java JDK 8 o superior.
- Git (opcional si deseas clonar el repositorio).

### Pasos para la Instalación

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/Angel66694/conversor-monedas




