import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Passager choisirPassager(Scanner scanner, List<Passager> passagers) {
        System.out.println("Choisir le passager :");
        for (int i = 0; i < passagers.size(); i++)
            System.out.println((i + 1) + ". " + passagers.get(i).getNom());
        Passager selectedPassager = passagers.get(scanner.nextInt() - 1);
        scanner.nextLine();
        return selectedPassager;
    }
    private static Vol choisirVol(Scanner scanner, List<Vol> vols) {
        System.out.println("Choisir le vol :");
        for (int i = 0; i < vols.size(); i++)
            System.out.println((i + 1) + ". " + vols.get(i).getNumeroVol());
        Vol selectedVol = vols.get(scanner.nextInt() - 1);
        scanner.nextLine();
        return selectedVol;
    }
    private static Pilote choisirPilote(Scanner scanner, List<Pilote> pilotes) {
        System.out.println("Choisir le pilote :");
        for (int i = 0; i < pilotes.size(); i++)
            System.out.println((i + 1) + ". " + pilotes.get(i).getNom());
        Pilote selectedPilote = pilotes.get(scanner.nextInt() - 1);
        scanner.nextLine();
        return selectedPilote;
    }
    private static PersonnelCabine choisirPersonnelCabine(Scanner scanner, List<PersonnelCabine> personnelsCabine) {
        System.out.println("Choisir le personnel cabine :");
        for (int i = 0; i < personnelsCabine.size(); i++)
            System.out.println((i + 1) + ". " + personnelsCabine.get(i).getNom());
        PersonnelCabine selectedCabine = personnelsCabine.get(scanner.nextInt() - 1);
        scanner.nextLine();
        return selectedCabine;
    }
    private static Avion choisirAvion(Scanner scanner, List<Avion> avions) {
        System.out.println("Choisir l'avion :");
        for (int i = 0; i < avions.size(); i++)
            System.out.println((i + 1) + ". " + avions.get(i).getImmatriculation() + " (" + avions.get(i).getModele() + ")");
        Avion selectedAvion = avions.get(scanner.nextInt() - 1);
        scanner.nextLine();
        return selectedAvion;
    }
    private static Aeroport choisirAeroport(Scanner scanner, List<Aeroport> aeroports) {
        System.out.println("Choisir l'aéroport :");
        for (int i = 0; i < aeroports.size(); i++) {
            System.out.println((i + 1) + ". " + aeroports.get(i).getNom() + " (" + aeroports.get(i).getLocalisation() + ")");
        }
        Aeroport selectedAeroport = aeroports.get(scanner.nextInt() - 1);
        scanner.nextLine();
        return selectedAeroport;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Passager passager1 = new Passager("Esteban Boulet", "13 Rue de Montreuil", 622457159, "A1234567");
        Passager passager2 = new Passager("Jeanne Dupont", "25 Boulevard Raspail", 656102398, "B7654321");
        Passager passager3 = new Passager("Pierre Java", "12 Rue du Temple", 601858078, "C7519364");
        Passager passager4 = new Passager("Louis Desmoulins", "141 Avenue Philippe Auguste", 699152003, "D2187439");

        Avion avion1 = new Avion("F-WOEH", "Airbus A320", 180);
        Avion avion2 = new Avion("F-PAMC", "Boeing 737", 160);
        Avion avion3 = new Avion("F-ZJHD", "Airbus A220", 135);
        Avion avion4 = new Avion("F-CONC", "Le Concorde", 100);

        Vol vol1 = new Vol("AFPNY", "Paris", "New York");
        Vol vol2 = new Vol("AFPMB", "Paris", "Mumbai");
        Vol vol3 = new Vol("AFPSL", "Paris", "Séoul");

        vol1.setDateHeureDepart("2024-12-10 08:00");
        vol1.setDateHeureArrivee("2024-12-10 14:00");
        vol1.setEtat("Planifié");

        vol2.setDateHeureDepart("2024-12-15 09:00");
        vol2.setDateHeureArrivee("2024-12-15 17:00");
        vol2.setEtat("Planifié");

        vol3.setDateHeureDepart("2024-12-24 14:30");
        vol3.setDateHeureArrivee("2024-12-25 06:00");
        vol3.setEtat("Planifié");

        Aeroport aeroportParis = new Aeroport("CDG", "Paris");
        Aeroport aeroportNY = new Aeroport("JFK", "New York");
        Aeroport aeroportMB = new Aeroport("BOM", "Mumbai");
        Aeroport aeroportSL = new Aeroport("ICN", "Séoul");

        aeroportParis.ajouterVol(vol1);
        aeroportParis.ajouterVol(vol2);
        aeroportParis.ajouterVol(vol3);

        aeroportNY.ajouterVol(vol1);
        aeroportMB.ajouterVol(vol2);
        aeroportSL.ajouterVol(vol3);


        Pilote pilote1 = new Pilote("Nicolas Durand", "79 Rue de Charonne", 658121101, 1, "2020-03-01", 12345, 500);
        Pilote pilote2 = new Pilote("Emma Boulanger", "99 Rue de la Roquette", 650148995, 2, "2018-01-01", 12345, 700);

        PersonnelCabine cabine1 = new PersonnelCabine("Lucie Lemercier", "101 Rue de Paris", 633223298, 3, "2022-05-10", "Intermédiaire");
        PersonnelCabine cabine2 = new PersonnelCabine("Claude Simon", "46 Boulevard Voltaire", 621108907, 4, "2024-12-4", "Novice");


        List<Passager> passagers = new ArrayList<>(List.of(passager1, passager2, passager3, passager4));
        List<Avion> avions = new ArrayList<>(List.of(avion1, avion2, avion3, avion4));
        List<Vol> vols = new ArrayList<>(List.of(vol1, vol2, vol3));
        List<Pilote> pilotes = new ArrayList<>(List.of(pilote1, pilote2));
        List<PersonnelCabine> personnelsCabine = new ArrayList<>(List.of(cabine1, cabine2));
        List<Aeroport> aeroports = new ArrayList<>(List.of(aeroportParis, aeroportNY, aeroportMB, aeroportSL));

        int choice;
        do {
            System.out.println("[------------MENU-DE-COMMANDES------------]");
            System.out.println("1. Réserver un vol\n2. Annuler une réservation\n3. Affecter un avion à un vol\n4. Affecter un équipage à un vol\n<--------AFFICHAGES-------->\n5. Afficher les réservations d'un passager\n6. Afficher détails d'un vol\n7. Afficher détails du personnel\n8. Afficher détails d'un avion\n9. Afficher détails d'un passager\n10. Afficher les vols d'un aéroport\n11. Quitter");
            System.out.print("[------------MENU-DE-COMMANDES------------]\n>>> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    Passager selectedPassager = choisirPassager(scanner, passagers);
                    Vol selectedVol = choisirVol(scanner, vols);
                    selectedPassager.reserverVol(selectedVol);
                }
                case 2 -> {
                    Passager selectedPassager = choisirPassager(scanner, passagers);
                    List<Reservation> reservations = selectedPassager.getReservations();
                    if (reservations.isEmpty()) {
                        System.out.println("\nAucune réservation à annuler.\n");
                    } else {
                        for (Reservation reservation : reservations)
                            System.out.println(reservation);
                        System.out.print("Numéro de réservation à annuler : ");
                        int reservationId = scanner.nextInt();
                        scanner.nextLine();
                        selectedPassager.annulerReservation(reservationId);
                    }
                }
                case 3 -> {
                    Avion selectedAvion = choisirAvion(scanner, avions);
                    Vol selectedVol = choisirVol(scanner, vols);
                    selectedAvion.affecterVol(selectedVol);
                    selectedVol.setAvion(selectedAvion);
                }
                case 4 -> {
                    Pilote selectedPilote = choisirPilote(scanner, pilotes);
                    PersonnelCabine selectedCabine = choisirPersonnelCabine(scanner, personnelsCabine);
                    Vol selectedVol = choisirVol(scanner, vols);
                    selectedPilote.affecterVol(selectedVol);
                    selectedCabine.affecterVol(selectedVol);
                }
                case 5 -> {
                    Passager selectedPassager = choisirPassager(scanner, passagers);
                    selectedPassager.obtenirReservations();
                }
                case 6 -> {
                    Vol selectedVol = choisirVol(scanner, vols);
                    selectedVol.obtenirVol();
                }
                case 7 -> {
                    System.out.println("Type de personnel :\n1. Pilote\n2. Personnel de cabine\nVotre choix :");
                    int personnelType = scanner.nextInt();
                    scanner.nextLine();

                    if (personnelType == 1) {
                        Pilote selectedPilote = choisirPilote(scanner, pilotes);
                        selectedPilote.obtenirInfos();
                    } else if (personnelType == 2) {
                        PersonnelCabine selectedCabine = choisirPersonnelCabine(scanner, personnelsCabine);
                        selectedCabine.obtenirInfos();
                    } else {
                        System.out.println("Choix invalide.");
                    }
                }
                case 8 -> {
                    Avion selectedAvion = choisirAvion(scanner, avions);
                    selectedAvion.obtenirInfos();
                }
                case 9 -> {
                    Passager selectedPassager = choisirPassager(scanner, passagers);
                    selectedPassager.obtenirInfos();
                }
                case 10 -> {
                    Aeroport selectedAeroport = choisirAeroport(scanner, aeroports);
                    selectedAeroport.afficherVols();
                }
                case 11 -> {
                    System.out.println("Fin de programme.");
                    System.exit(0);
                }
                default -> System.out.println("\nChoix invalide.\n");
            }
        } while (choice != 11);

        scanner.close();
    }
}
