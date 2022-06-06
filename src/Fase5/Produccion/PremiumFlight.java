public class PremiumFlight extends Flight {

   // Diseño de la lógica comercial para los pasajeros VIP.Pregunta 7
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
