import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {

    @DisplayName("Dado que hay un vuelo economico")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
        }

        @Test
        public void testEconomyFlightRegularPassenger() {
            Passenger jessica = new Passenger("Jessica", false);

            assertEquals("1", economyFlight.getId());
            assertTrue(economyFlight.addPassenger(jessica));
            assertEquals(1,economyFlight.getPassengersList().size());
            assertEquals("Jessica", economyFlight.getPassengersList().get(0).getName());

            assertTrue(economyFlight.removePassenger(jessica));
            assertEquals(0,economyFlight.getPassengersList().size());
        }

        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger cesar = new Passenger("Cesar", true);

            assertEquals("1", economyFlight.getId());
            assertTrue(economyFlight.addPassenger(cesar));
            assertEquals(1,economyFlight.getPassengersList().size());
            assertEquals("Cesar", economyFlight.getPassengersList().get(0).getName());

            assertFalse(economyFlight.removePassenger(cesar));
            assertEquals(1,economyFlight.getPassengersList().size());
        }

    }

    @DisplayName("Dado que hay un vuelo negocios")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
        }

        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger jessica = new Passenger("Jessica", false);

            assertFalse(businessFlight.addPassenger(jessica));
            assertEquals(0,businessFlight.getPassengersList().size());
            assertFalse(businessFlight.removePassenger(jessica));
            assertEquals(0,businessFlight.getPassengersList().size());

        }

        @Test
        public void testBusinessFlightVipPassenger() {
            Passenger cesar = new Passenger("Cesar", true);

            assertTrue(businessFlight.addPassenger(cesar));
            assertEquals(1,businessFlight.getPassengersList().size());
            assertFalse(businessFlight.removePassenger(cesar));
            assertEquals(1,businessFlight.getPassengersList().size());

        }

    }

}
