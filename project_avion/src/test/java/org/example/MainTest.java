package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassagerTest {
    private Passager passager;
    private Vol vol;

    @BeforeEach
    void setUp() {
        passager = new Passager("John Doe", "123 Test Street", 123456789, "A1234567");
        vol = new Vol("AF123", "Paris", "New York");
    }

    @Test
    void testPassagerCreation() {
        assertNotNull(passager);
        assertEquals("John Doe", passager.getNom());
        assertEquals("123 Test Street", passager.getAdresse());
        assertEquals("A1234567", passager.getPasseport());
    }

    @Test
    void testReservation() {
        assertTrue(passager.getReservations().isEmpty());

        passager.reserverVol(vol);

        assertEquals(1, passager.getReservations().size());
        assertEquals(vol, passager.getReservations().get(0).getVol());
    }

    @Test
    void testAnnulerReservation() {
        passager.reserverVol(vol);
        assertEquals(1, passager.getReservations().size());
        int reservationId = passager.getReservations().get(0).getId();
        passager.annulerReservation(reservationId);
        assertTrue(passager.getReservations().isEmpty());
    }
}

class VolTest {
    private Vol vol;
    private Avion avion;
    private Passager passager;

    @BeforeEach
    void setUp() {
        vol = new Vol("AF456", "London", "Tokyo");
        avion = new Avion("F-ABCD", "Boeing 787", 300);
        passager = new Passager("Jane Smith", "456 Test Avenue", 987654321, "B7654321");
    }

    @Test
    void testVolCreation() {
        assertNotNull(vol);
        assertEquals("AF456", vol.getNumeroVol());
        assertEquals("London", vol.getDepart());
        assertEquals("Tokyo", vol.getArrivee());
    }

    @Test
    void testSetAvion() {
        assertNull(vol.getAvion());
        vol.setAvion(avion);
        assertEquals(avion, vol.getAvion());
        assertEquals("Boeing 787", vol.getAvion().getModele());
    }

    @Test
    void testAjouterPassager() {
        assertTrue(vol.getPassagers() == null || vol.getPassagers().isEmpty());
        vol.ajouterPassager(passager);

        assertEquals(1, vol.getPassagers().size());
        assertEquals(passager, vol.getPassagers().get(0));
    }
}

class AvionTest {
    private Avion avion;
    private Vol vol;

    @BeforeEach
    void setUp() {
        avion = new Avion("F-WXYZ", "Airbus A320", 180);
        vol = new Vol("BA789", "Paris", "London");
    }

    @Test
    void testAvionCreation() {
        assertNotNull(avion);
        assertEquals("F-WXYZ", avion.getImmatriculation());
        assertEquals("Airbus A320", avion.getModele());
        assertEquals(180, avion.getCapacite());
    }

    @Test
    void testAffecterVol() {
        assertDoesNotThrow(() -> avion.affecterVol(vol));
    }
}

class ReservationTest {
    private Passager passager;
    private Vol vol;
    private Reservation reservation;

    @BeforeEach
    void setUp() {
        passager = new Passager("Alice Johnson", "789 Test Road", 567890123, "C9876543");
        vol = new Vol("LH101", "Berlin", "Madrid");
        reservation = new Reservation(passager, vol);
    }

    @Test
    void testReservationCreation() {
        assertNotNull(reservation);
        assertEquals(passager, reservation.getPassager());
        assertEquals(vol, reservation.getVol());
        assertTrue(reservation.getId() > 0);
    }
}