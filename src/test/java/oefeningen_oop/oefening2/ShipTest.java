package oefeningen_oop.oefening2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class ShipTest {
    @Test
    void testTotalWeight1Car() {
        Ship ship = new Ship();
        ship.addVehicle(new Car());

        Assertions.assertThat(ship.totalWeight()).isEqualTo(1000);
    }

    @Test
    void testTotalWeight1Van() {
        Ship ship = new Ship();
        ship.addVehicle(new Van());

        Assertions.assertThat(ship.totalWeight()).isEqualTo(1500);
    }

    @Test
    void testTotalWeight() {
        Ship ship = new Ship();
        ship.addVehicle(new Van());
        ship.addVehicle(new Van());
        ship.addVehicle(new Van());
        ship.addVehicle(new Car());
        ship.addVehicle(new Car());
        ship.addVehicle(new Car());

        Assertions.assertThat(ship.totalWeight()).isEqualTo(7500);
    }

    @Test
    void testGetContent() {
        Ship ship = new Ship();
        ship.addVehicle(new Van());
        ship.addVehicle(new Van());
        ship.addVehicle(new Van());
        ship.removeVehicle();
        ship.addVehicle(new Van());
        ship.addVehicle(new Car());
        ship.addVehicle(new Car());
        ship.addVehicle(new Car());

        Assertions.assertThat(ship.getContent()).isEqualTo("7500 kg and 9 places taken");
    }

    @Test
    void testMaxWeight() {
        Ship ship = new Ship();
        for (int i = 0; i < 96  ; i++) {
            ship.addVehicle(new Car());
        }

        Assertions.assertThatThrownBy(()-> ship.addVehicle(new Car())).hasMessage("Ship is full");
    }

    @Test
    void testMaxAmountOfPlaces() {
        Ship ship = new Ship();
        for (int i = 0; i < 50  ; i++) {
            ship.addVehicle(new Van());
        }

        Assertions.assertThatThrownBy(()-> ship.addVehicle(new Car())).hasMessage("Ship is full");
    }


}