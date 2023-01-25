# Operación fuego de quasar
## _Proyecto para envio de mensaje secreto, evaluando la triangulación de posiciones entre los satelites y la nave principal._

## Instrucciones
Recomendaciones a tener en cuenta:
- Ambiente Java local en la versión 18 
- Tener instalado el gestor de paquetes Maven.
- Postman o soap ui o insomnia (herramienta para realizar consumos a rest).

## Instalación

Descargue el proyecto del repositorio [GitHub](https://github.com/dpanqueva/commerce-test-dev).

Siguiendo el comando:

```sh
cd carpeta-proyecto
git clone https://github.com/dpanqueva/commerce-test-dev.git
```

Una vez descargo el proyecto encontraremos la carpeta
> commerce-test-dev


Ingresamos a cada carpeta, una vez allí en la carpeta (commerce-test-dev), es necesario descargar los paquetes necesarios para su correcto funcionamiento.
Para este proceso seguimos el siguiente comando:

Abrimos la consola en la carpeta y/o proyecto correspondiente, **Importante, se debe hacer antes de correr el proyecto.

```sh
mvn clean install
```

## Run (desplegar proyecto)
Para correr el proyecto, se debe ingresar a la carpeta donde se descargo el código fuente (git), abrir la consola y ejecutar el siguiente comando:
Antes de desdplegar el proyecto, debemos ubicar la carpeta (en la raiz del pryecto) target, allí se encuentra el jar generado por maven con todo lo correspondiente a la ejecución, nos situamos dentro de esta carpeta y ejecutamos en consola:
```sh
java -jar commerce-test-dev-0.0.1-SNAPSHOT.jar
```

El proyecto está configurado para que al iniciar, inicie en el puerto
```sh
server.port=8087 #puerto a elegir
```

Ya con esto nuestro proyecto ha quedado desplegado y listo para probar.


## Ejecución
Para la ejecución, en mi caso utilizare [Postman](https://www.postman.com/downloads/), ya en la herramienta debemos tener en cuenta los endposints:

> Tener en cuenta el ambiente al cual se le va a realizar la prueba
> localhost: maquina de desarrollo
> http://localhost:8087/api/v1/search


|Número| Operacion | Endpoint heroku|Endpoint local|
|------ | ------ | ------ | ------ |
|1| POST | http://localhost:8087/api/v1/search |


## Explicación servicio 
Este servicio lo que pretende es consultar información de una marca, a partir de una fecha trae el precio a ofertar de un producto en particular

Para ver la documentación del servicio [aquí](https://github.com/dpanqueva/commerce-test-dev/wiki)

## Tech
Para la solución de este reto, se implemento:
| Herramienta | Url |
| ------ | ------ |
| Java | [Jdk](https://openjdk.java.net/projects/jdk/18/) |
| Maven | [Maven](https://maven.apache.org/download.cgi) |
| Intellij Idea | [Intellij](https://www.jetbrains.com/es-es/idea/download) |
| GitHub | [https://github.com/](https://github.com/) |
| Spring Boot | [https://start.spring.io/](https://start.spring.io/) |
| Junit5 | [Junit](https://junit.org/junit5/) |


## Pruebas unitarias
Se realiza test unitarios al controller, partiendo en la información inicial de la prueba

[![N|Solid](https://github.com/dpanqueva/commerce-test-dev/blob/master/documentacion/wiki/arquitectura/test.PNG)]()

## Gracias!!