
# **Tecnologías Utilizadas**
El Convertidor de Divisas y Temperaturas se desarrolló utilizando las siguientes tecnologías:

## Java: 
Lenguaje de programación principal utilizado para la implementación del proyecto.
Spring: Se utilizó el framework Spring para la gestión de dependencias y la implementación de la lógica de negocio.
IntelliJ IDEA: Entorno de desarrollo integrado *(IDE)* utilizado para escribir, compilar y depurar el código del proyecto.
GitHub: Plataforma de alojamiento de código fuente utilizada para el control de versiones y colaboración en el desarrollo del proyecto.
ExchangeRate-API: API utilizada para obtener las tasas de cambio en tiempo real necesarias para las conversiones de divisas.
El proyecto se desarrolló como parte del desafío de conversor de divisas de AluraLatam, una plataforma de educación en línea que ofrece cursos de programación y desarrollo de software.

Instalación y Ejecución
Requisitos del Sistema
Antes de proceder con la instalación y ejecución del proyecto, asegúrate de tener instalado lo siguiente en tu sistema:

Java JDK 8 o superior: Necesario para compilar y ejecutar el código Java.
Git (opcional): Útil si deseas clonar el repositorio desde GitHub.
Pasos para la Instalación
Clonar el Repositorio:
Si decides clonar el repositorio desde GitHub, puedes usar el siguiente comando en tu terminal o símbolo del sistema:

bash
Copiar código
git clone https://github.com/tu-usuario/convertidor-divisas-temperaturas.git
Abrir el Proyecto en IntelliJ IDEA:
Abre IntelliJ IDEA y selecciona la opción para abrir un proyecto existente. Navega hasta la ubicación donde clonaste el repositorio y selecciona la carpeta del proyecto para abrirlo en IntelliJ.

Configurar API Key de ExchangeRate-API:
Obtén una API Key gratuita de ExchangeRate-API registrándote en su sitio web (https://www.exchangerate-api.com/). Una vez que tengas tu API Key, agrégala al proyecto en la clase Buscar del paquete conversor.service. Busca la línea que dice String apiKey = "TU_API_KEY"; y reemplaza TU_API_KEY con tu API Key.

Compilar y Ejecutar el Proyecto:
Una vez que hayas configurado la API Key, puedes compilar y ejecutar el proyecto desde IntelliJ IDEA. Abre la clase Principal del paquete conversor.Principal y ejecuta el programa para comenzar a utilizar el Convertidor de Divisas y Temperaturas.

Uso del Convertidor
Una vez que el programa esté en ejecución, podrás utilizar las siguientes funcionalidades:

Conversión de Divisas: Selecciona la opción correspondiente en el menú para ingresar el monto y las monedas a convertir. El programa mostrará la tasa de cambio utilizada y el resultado de la conversión.
Conversión de Temperaturas: Elige la opción de conversión de temperaturas para ingresar el valor y la escala de temperatura a convertir. El programa realizará la conversión y mostrará el resultado.
Capturas de Pantalla y Demostración
Aquí se incluyen capturas de pantalla del programa en ejecución y un breve video demostrativo para mostrar cómo funciona el Convertidor de Divisas y Temperaturas.

Capturas de Pantalla
Menú Principal:
[![menu.png](https://i.postimg.cc/wTxrrnZC/menu.png)](https://postimg.cc/DmD5Jp26)
![Uploading convertidor.png…]()


<<<<<<< HEAD
Conversión de Divisas:
![Conversión de Divisas](ruta/imagen2.png)
=======
Tecnologías Utilizadas
El Convertidor de Divisas y Temperaturas se desarrolló utilizando las siguientes tecnologías:

Java: Lenguaje de programación principal utilizado para la implementación del proyecto.
Spring: Se utilizó el framework Spring para la gestión de dependencias y la implementación de la lógica de negocio.
IntelliJ IDEA: Entorno de desarrollo integrado (IDE) utilizado para escribir, compilar y depurar el código del proyecto.
GitHub: Plataforma de alojamiento de código fuente utilizada para el control de versiones y colaboración en el desarrollo del proyecto.
ExchangeRate-API: API utilizada para obtener las tasas de cambio en tiempo real necesarias para las conversiones de divisas.
El proyecto se desarrolló como parte del desafío de conversor de divisas de AluraLatam, una plataforma de educación en línea que ofrece cursos de programación y desarrollo de software.

Instalación y Ejecución
Requisitos del Sistema
Antes de proceder con la instalación y ejecución del proyecto, asegúrate de tener instalado lo siguiente en tu sistema:

Java JDK 8 o superior: Necesario para compilar y ejecutar el código Java.
Git (opcional): Útil si deseas clonar el repositorio desde GitHub.
Pasos para la Instalación
Clonar el Repositorio:
Si decides clonar el repositorio desde GitHub, puedes usar el siguiente comando en tu terminal o símbolo del sistema:

bash
Copiar código
git clone https://github.com/tu-usuario/convertidor-divisas-temperaturas.git
Abrir el Proyecto en IntelliJ IDEA:
Abre IntelliJ IDEA y selecciona la opción para abrir un proyecto existente. Navega hasta la ubicación donde clonaste el repositorio y selecciona la carpeta del proyecto para abrirlo en IntelliJ.

Configurar API Key de ExchangeRate-API:
Obtén una API Key gratuita de ExchangeRate-API registrándote en su sitio web (https://www.exchangerate-api.com/). Una vez que tengas tu API Key, agrégala al proyecto en la clase Buscar del paquete conversor.service. Busca la línea que dice String apiKey = "TU_API_KEY"; y reemplaza TU_API_KEY con tu API Key.

Compilar y Ejecutar el Proyecto:
Una vez que hayas configurado la API Key, puedes compilar y ejecutar el proyecto desde IntelliJ IDEA. Abre la clase Principal del paquete conversor.Principal y ejecuta el programa para comenzar a utilizar el Convertidor de Divisas y Temperaturas.

Uso del Convertidor
Una vez que el programa esté en ejecución, podrás utilizar las siguientes funcionalidades:

Conversión de Divisas: Selecciona la opción correspondiente en el menú para ingresar el monto y las monedas a convertir. El programa mostrará la tasa de cambio utilizada y el resultado de la conversión.
Conversión de Temperaturas: Elige la opción de conversión de temperaturas para ingresar el valor y la escala de temperatura a convertir. El programa realizará la conversión y mostrará el resultado.
Capturas de Pantalla y Demostración
Aquí se incluyen capturas de pantalla del programa en ejecución y un breve video demostrativo para mostrar cómo funciona el Convertidor de Divisas y Temperaturas.

Capturas de Pantalla
Menú Principal:
![Menú Principal](C:\Users\strik\OneDrive\Documents\proyecto screenmatch\rest-service\img\menu.png)


Conversión de Divisas:
![Conversión de Divisas](ruta/imagen2.png)


Conversión de Temperaturas:
![Conversión de Temperaturas](ruta/imagen3.png)


Tasa de Cambio Utilizada:
![Tasa de Cambio](ruta/imagen4.png)


Video Demostrativo
[Enlace al Video Demostrativo](ruta/video_demo.mp4)


Contribuciones al Proyecto
Si deseas contribuir al proyecto, puedes hacer lo siguiente:

Realizar mejoras en la interfaz de usuario.
Agregar nuevas funcionalidades, como conversiones de unidades adicionales.
Optimizar el código para mejorar la eficiencia y la precisión en las conversiones.
Corregir errores o realizar pruebas adicionales para garantizar la calidad del programa.
Para contribuir, puedes hacer un fork del repositorio en GitHub, realizar tus cambios en una rama separada y luego enviar un pull request para que tus cambios sean revisados y fusionados con el proyecto principal.

¡Gracias por tu interés en contribuir al Convertidor de Divisas y Temperaturas!

Este documento proporciona una guía completa para la instalación, ejecución y contribución al proyecto Convertidor de Divisas y Temperaturas, detallando sus funcionalidades, arquitectura, tecnologías utilizadas y pasos prácticos para comenzar a trabajar con él.


>>>>>>> 6cb7a7038e8c0446f944fe0080a0c75624ab6783


Conversión de Temperaturas:
![Conversión de Temperaturas](ruta/imagen3.png)


Tasa de Cambio Utilizada:
![Tasa de Cambio](ruta/imagen4.png)


Video Demostrativo
[Enlace al Video Demostrativo](ruta/video_demo.mp4)


Contribuciones al Proyecto
Si deseas contribuir al proyecto, puedes hacer lo siguiente:

Realizar mejoras en la interfaz de usuario.
Agregar nuevas funcionalidades, como conversiones de unidades adicionales.
Optimizar el código para mejorar la eficiencia y la precisión en las conversiones.
Corregir errores o realizar pruebas adicionales para garantizar la calidad del programa.
Para contribuir, puedes hacer un fork del repositorio en GitHub, realizar tus cambios en una rama separada y luego enviar un pull request para que tus cambios sean revisados y fusionados con el proyecto principal.

¡Gracias por tu interés en contribuir al Convertidor de Divisas y Temperaturas!

Este documento proporciona una guía completa para la instalación, ejecución y contribución al proyecto Convertidor de Divisas y Temperaturas, detallando sus funcionalidades, arquitectura, tecnologías utilizadas y pasos prácticos para comenzar a trabajar con él.
