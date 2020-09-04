# SPARK WEB 
> En este taller se realizará los cálculos de desviación estándar y la media de una tabla con n números, por medio de una
> aplicación web con
> Si quiere saber mas sobre el proyecto, puede leer el [Informe](https://github.com/FelipeRojas15/AREP-TallerSPARKWEB2/blob/master/SparkWebAbstract.pdf).

## Requerimientos 
Se necesita que tenga instalado en su computadora:
```sh
$ Java 1.8
$ Maven 3.6.3
```
con su respectiva configuracion
## Instalación
> **Clonar el repositorio:** 
```sh
$ https://github.com/FelipeRojas15/AREP-TallerSPARKWEB2
```
> **Compilar el proyecto:**
```sh
$ mvn package
```
> **Ejecutar el programa:** 
```sh
$ java -cp target/tallerLinkedList-1.0-SNAPSHOT.jar edu.escuelaing.arem.app.sparkWeb.SparkWeb
```
> **Abrir la aplicacion con heroku:** 
```sh
$ https://guarded-dusk-94649.herokuapp.com/
```


> **Ejecutar las pruebas:** 
```sh
$ mvn test
```
![Resultado de la prueba ](https://i.ibb.co/ZTbXYzY/TestRun.png)
> **Generar Javadoc:**
```sh
$ mvn javadoc:javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```
## Autor
**Brayan Felipe Rojas Bernal**
## Lincencia
Este proyecto posee la licencia MIT. Para mas detalles [Licencia](https://github.com/FelipeRojas15/AREP_TallerMVN1/blob/master/LICENSE.txt).


