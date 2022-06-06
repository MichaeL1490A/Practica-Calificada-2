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

Esta regla consiste en que si ves en tu proyecto tres fragmetos de código similares
es una señal de que debemos refactorizar. Y esto se relaciona con nuestro problema 
porque al hacer el tipo PremiumFlight notamos que el código seria similar al de
EconomyFlight y BusinessFlight.

## Pregunta 5

El diseño inicial de la clase PremiumFlight es el siguiente:

    public class PremiumFlight extends Flight {

        // Diseño inicial de la clase PremiumFlight. Pregunta 5
        public PremiumFlight(String id) {
            super(id);
        }
        @Override
        public boolean addPassenger(Passenger passenger){
            return false;
        }
    
        @Override
        public boolean removePassenger(Passenger passenger){
            return false;
        }
    }

## Pregunta 6

El código de prueba para el vuelo Premium será el siguiente

    @DisplayName("Dado que hay un vuelo Premium")
    @Nested
    class PremiumFlightTest{

        private Flight premiumFlight;
        private Passenger jessica;
        private Passenger cesar;

        @BeforeEach
        void setUp() {
            premiumFlight = new PremiumFlight("3");
            jessica = new Passenger("Jessica", false);
            cesar = new Passenger("Cesar", true);
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero VIP")
        class VipPassenger {
            @Test
            @DisplayName("El pasajero es agregado al vuelo premium")
            public void testPremiumFlightVipPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero VIP y un vuelo premium",
                        () -> assertEquals(true, premiumFlight.addPassenger(cesar)),
                        () -> assertEquals(1, premiumFlight.getPassengersList().size()),
                        () -> assertEquals("Cesar", premiumFlight.getPassengersList().get(0).getName())
                );
            }
        }
        @Nested
        @DisplayName("Cuando tenemos un pasajero regular")
        class RegularPassenger {
            @Test
            @DisplayName("El pasajero es rechazado del vuelo premium")
            public void testPremiumFlightRegularPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero regular y un vuelo premium",
                        () -> assertEquals(false, premiumFlight.addPassenger(jessica)),
                        () -> assertEquals(0, premiumFlight.getPassengersList().size())
                );
            }
        }
        @Nested
        @DisplayName("Cuando tenemos que remover un pasajero")
        class RemovePassenger {
            @Test
            @DisplayName("El pasajero sera removido del vuelo premium")
            public void testPremiumFlightRemovePassenger() {
                assertAll("Verifica todas las condiciones para remover un pasajero",
                        () -> assertEquals(true, premiumFlight.addPassenger(cesar)),
                        () -> assertEquals(1, premiumFlight.getPassengersList().size()),
                        () -> assertEquals(true, premiumFlight.removePassenger(cesar)),
                        () -> assertEquals(0, premiumFlight.getPassengersList().size())
                );
            }
        }
    }

Como es normal y estamos utilizando TDD algunas pruebas fallaran ya que aun no esta implementada
la lógica comercial del programa

![img.png](images/imagen11.png)

## Pregunta 7



## Pregunta 8