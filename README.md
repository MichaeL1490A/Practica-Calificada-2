# PC2 DESARROLO DE SOFTWARE

## Pregunta 0
Este es el resultado de ejecución
![image info](./images/imagen1.png)

Inicializamos los vuelos economico y de negocio

![image info](./images/imagen2.png)

Vemos que en el código se presenta que Cesar se declara como un pasajero VIP
mientras que Jessica se declara como una pasajera no VIP.

![image info](./images/imagen3.png)


En las siguientes líneas del programa (siguiente imagen), primero agregamos
a Cesar en el vuelo de tipo Negocios y es agregado satisfactoriamente a este vuelo 
por ser un pasajero VIP (basado en el método addPassenger de la clase Flight), en la siguiente línea tratamos de remover a Cesar
del vuelo de Negocios pero al ser un vuelo de tipo Negocios nos retorna false directamente,
impidiendo que podamos removerlo (basado en el método removePassenger de la clase Flight). 

Luego tratamos de agregar a Jessica al vuelo de tipo Negocios, pero al no ser un 
pasajero VIP es rechazada (basado en el método removePassenger de la clase Flight) 
y no se agrega a este vuelo. En la siguiente línea agregamos a Jessica al vuelo de tipo 
Economico y es agregada satisfactoriamente (basado en el método addPassenger de la clase Flight)

![image info](./images/imagen4.png)

Finalmente en las últimas líneas de la clase Airport imprimimos los pasajeros que hay en cada vuelo (siguiente imagen).

![image info](./images/imagen5.png)

Y obtenemos el siguiente resultado.

![image info](./images/imagen1.png)

## Pregunta 1

![image info](./images/imagen6.png)
Podemos observar que directamente al ejecutar el test no se alcanza a realizar
algún test en la clase main. Ya que en esta clase no se ejecuta ningún método 
que se evalué en el test, por tanto su coverage es de 0%. En el Flight hay un
que no se ejecuta, el cual vendría a ser getFlightType, así como tampoco se corren
las excepciones. Por lo que haría falta una revisión para que estas sean ejecutadas.

## Pregunta 2

Jhon realiza la refactorización para que sus pruebas cubran la mayor parte del código
ya que en la fase actual los test no cubren el total del código de producción.

## Pregunta 2.5

![image info](./images/imagen7.png)
Podemos apreciar que ahora las pruebas pueden cubrir absolutamente todos los
métodos del código de producción. Gracias a la refactorización ahora si es posible
evaluar por completo tanto los métodos de BusinessFlight y EconomyFlight, ya que
son clases extendidas de la clase Flight donde fueron declaradas como abstractas.

## Pregunta 3

## Pregunta 4

## Pregunta 5

## Pregunta 6

## Pregunta 7

## Pregunta 8