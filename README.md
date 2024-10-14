# Conversor de Monedas

Este proyecto es un conversor de monedas que utiliza la API de [Exchangerate API](https://app.exchangerate-api.com) para enviar peticiones y recibir respuestas en formato JSON. El conversor permite convertir una cantidad de dinero de una moneda a su valor equivalente en otra moneda y mostrar el resultado por pantalla.

## Características

- Realiza peticiones a la API de Exchangerate API para obtener tasas de cambio.
- Convierte cantidades de dinero entre diferentes monedas.
- Imprime los resultados por pantalla.
- Utiliza Gson para leer y procesar los datos en formato JSON.
- Desarrollado en Java jdk 23.
- Usando el gestor Maven 
  
## Instalación

1. Clonar el repositorio:
    ```sh
    git clone https://github.com/franco-robles/ConversorDeMonedas.git
    ```

2. Para hacer este proyecto se utilizó Intellij en su última versión
3. Asegurarse de tener Java instalado en su última versión, jdk 23 o superior y configuradas las variables de entorno.

4. Instalar las dependencias:
    - Descargar la librería Gson desde [aquí](https://github.com/google/gson) o agregarla a su gestor de dependencias desde [aquí]([https://github.com/google/gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)) .
  
      
## Uso

1. Crear una cuenta en [Exchangerate API](https://app.exchangerate-api.com) para obtener una clave de API.

2. Accede a la clase Convertidor y cambia la API-key por la tuya. Ejemplo https://v6.exchangerate-api.com/v6/_API_KEY_/pair/.

3. Ya puedes Correr el programa y probar las opciones de conversion

## Screenshots
.Este es el menu Principal por consola 
![Menú Principal](screenshots/MenuPrincial.png)

.Esto es la salida despues de seleccionar la opción 1 y convertir 1 USD a ARG
![salida](screenshots/salida.png)
