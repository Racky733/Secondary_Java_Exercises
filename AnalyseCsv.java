public class AnalyseCsv {

    static void afficherResume(String ligne) {
        String[] champs = ligne.split(";", -1);

        if (champs.length != 6) {
            System.out.println("Ligne invalide");
            return;
        }

        System.out.println("Date      : " + champs[0]);
        System.out.println("Référence : " + champs[1]);
        System.out.println("Client    : " + champs[2]);
        System.out.println("Quartier  : " + champs[3].toUpperCase());
        System.out.println("Paiement  : " + champs[4]);
        System.out.println("Montant   : " + champs[5] + " FCFA");
    }

    public static void main(String[] args) {
        String ligne = "2026-09-14;TS-2026-000087;Awa Diop;Médina;WAVE;18500";
        afficherResume(ligne);

    }
}