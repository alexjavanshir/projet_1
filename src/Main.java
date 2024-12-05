public class Main {
    public static void main(String[] args) {

        Passager passager1 = new Passager("John Doe", "123 Rue Example", 123456789, "A1234567");
        Passager passager2 = new Passager("Jane Smith", "456 Rue Sample", 987654321, "B7654321");

        Avion avion1 = new Avion("F-ABCD", "Airbus A320", 180);
        Avion avion2 = new Avion("F-EFGH", "Boeing 737", 160);

        Vol vol1 = new Vol("AF123", "Paris", "New York");
        Vol vol2 = new Vol("AF456", "London", "Tokyo");

        vol1.setDateHeureDepart("2024-12-10 08:00");
        vol1.setDateHeureArrivee("2024-12-10 14:00");
        vol1.setEtat("Planifié");

        vol2.setDateHeureDepart("2024-12-15 09:00");
        vol2.setDateHeureArrivee("2024-12-15 17:00");
        vol2.setEtat("Planifié");

        passager1.reserverVol(vol1);
        passager2.reserverVol(vol2);

        System.out.println("\nReservations de Passager 1 :");
        passager1.obtenirReservations();
        System.out.println("\nReservations de Passager 2 :");
        passager2.obtenirReservations();

        passager1.annulerReservation(1);

        System.out.println("\nReservations après annulation de Passager 1 :");
        passager1.obtenirReservations();

        avion1.affecterVol(vol1);
        avion2.affecterVol(vol2);

        vol1.obtenirVol();
        vol2.obtenirVol();

        Pilote pilote1 = new Pilote("Pierre Durand", "789 Rue Pilot", 234567890, 1, "2020-03-01", 12345, 500);
        PersonnelCabine cabine1 = new PersonnelCabine("Lucie Martin", "101 Rue Cabin", 112233445, 2, "2022-05-10", "Novice");

        pilote1.affecterVol(vol1);
        cabine1.affecterVol(vol1);

        System.out.println("\nLe vol " + vol1.getNumeroVol() + " a été affecté à l'équipage suivant :");
        pilote1.obtenirVol();
        cabine1.obtenirVol();
    }
}
