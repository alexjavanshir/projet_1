public class Main {
    public static void main(String[] args) {
        Vol vol1 = new Vol();
        vol1.setNumeroVol("AF123");
        vol1.setOrigine("Paris");
        vol1.setDestination("New York");

        Avion avion1 = new Avion();
        avion1.affecterVol(vol1);

        Pilote pilote1 = new Pilote();
        pilote1.affecterVol(vol1);

        PersonnelCabine cabine1 = new PersonnelCabine();
        cabine1.affecterVol(vol1);

/*
        GestionnaireVol gestionnaire = new GestionnaireVol(vol1);
        gestionnaire.affecterAvion(avion1);
        gestionnaire.affecterPilote(pilote1);
        gestionnaire.affecterPersonnelCabine(cabine1);*/
    }
}
