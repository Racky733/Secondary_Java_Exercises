public class Test {
    public static void main(String[] args) {
        Montre M1 = new Montre(13,45);

        Personne p1 = new Personne("Fatou");
        Personne p2 = new Personne("Moussa");

        p1.fairePorter(M1);
        p1.m.afficherMinute();
        p2.enlever();

        String heure = p2.demanderHeure(p1);
        System.out.println(heure);
        p2.fairePorter(M1);


    }
    
}
