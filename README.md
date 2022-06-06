# PC2 DESARROLO DE SOFTWARE

## Pregunta 0
Este es el resultado de ejecución
![image info](./images/imagen1.png)

Inicializamos los vuelos economicos y de negocio

![image info](./images/imagen2.png)

Vemos que en el código se presenta que Cesar se declara como un pasajero VIP
mientras que Jessica se declara como una pasajera no VIP.

![image info](./images/imagen3.png)


Entonces en el programa añadimos a Cesar al listado de pasajeros del vuelo de
negocios, para posteriormente tratar de removerlo. Pero en el código Flight
podemos ver que a en el vuelo del tipo negocios, el código por defecto no remueve
al pasajero porque para ser añadido por defecto este tiene que ser VIP.
Luego tratamos de añadir a Jessica al listado de pasajeros en el vuelo de negocios
pero en el código Flight podemos ver que al estar definida como no VIP, simplemente
no se le añade al listado.

![image info](./images/imagen4.png)

Luego si pasa cuando se le añade al listado de económicos,
y finalmente por ello se imprimen ambos cada uno en su respectiva lista.

![image info](./images/imagen5.png)

## Pregunta 1

![image info](./images/imagen6.png)
Podemos observar que directamente al ejecutar el test no se alcanza a realizar
algún test en la clase main. Ya que en esta clase no se ejecuta ningún método 
que se evalúe en el test, por tanto, su coverage es de 0%. En el Flight hay un
que no se ejecuta, el cual vendría a ser getFlightType, así como tampoco se corren
las excepciones. Por lo que haría falta una revisión para que estas sean ejecutadas.

## Pregunta 2

Jhon realiza la refactorización para que sus pruebas cubran la mayor parte del código,
ya que en la fase actual los test no cubren el total del código de producción.

## Pregunta 2.5

![image info](./images/imagen7.png)

Podemos apreciar que ahora las pruebas pueden cubrir absolutamente todos los
métodos del código de producción. Gracias a la refactorización ahora si es posible
evaluar por completo tanto los métodos de BusinessFlight y EconomyFlight, ya que
son clases extendidas de la clase Flight donde fueron declaradas como abstractas.

## Pregunta 3

Luego de refactorizar las pruebas

![img.png](images/imagen9.png)

La cobertura del código es de un 100% para todas las clases

![img.png](images/imagen10.png)

Sí, la refactorizacion usando TDD ayudó a mejorar la calidad del código haciendolo
más entendible

## Pregunta 4

## Pregunta 5

## Pregunta 6

## Pregunta 7

## Pregunta 8