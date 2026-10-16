import java.util.Scanner;

public class Conjuguaison{
    static void Present(String verbe){
        String[] pronoms = {"je ", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] formes = new String[6];
        String radical = verbe.substring(0, verbe.length() - 2);

        if (verbe.equals("aller")) {
            formes = new String[]{"vais", "vas", "va", "allons", "allez", "vont"};
        } else if (verbe.equals("etre") || verbe.equals("être")) {
            formes = new String[]{"suis", "es", "est", "sommes", "êtes", "sont"};
        } else if (verbe.equals("avoir")) {
            formes = new String[]{"ai", "as", "a", "avons", "avez", "ont"};
        } else if (verbe.endsWith("er")) {
            String[] t = {"e", "es", "e", "ons", "ez", "ent"};
            for (int i = 0; i < 6; i++) formes[i] = radical + t[i];
        } else if (verbe.endsWith("ir")) {
            String[] t = {"is", "is", "it", "issons", "issez", "issent"};
            for (int i = 0; i < 6; i++) formes[i] = radical + t[i];
        } else if (verbe.endsWith("re")) {
            String[] t = {"s", "s", "", "ons", "ez", "ent"};
            for (int i = 0; i < 6; i++) formes[i] = radical + t[i];
        } else {
            System.out.println("Verbe non reconnu");
            return;
        }

        StringBuilder v = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            v.append(pronoms[i]).append(formes[i]).append("\n");
        }
        System.out.println(v);
    }

    static void Future(String verbe){
        String[] pronoms = {"je ", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] terminaisons = {"ai", "as", "a", "ons", "ez", "ont"};
        String base = verbe;

        if (verbe.equals("être") || verbe.equals("etre")) {
            base = "ser";
        } else if (verbe.equals("avoir")) {
            base = "aur";
        } else if (verbe.equals("aller")) {
            base = "ir";
        } else if (verbe.equals("faire")) {
            base = "fer";
        } else if (verbe.endsWith("re")) {
            base = verbe.substring(0, verbe.length() - 1);
        }

        StringBuilder v = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            v.append(pronoms[i]).append(base).append(terminaisons[i]).append("\n");
        }
        System.out.println(v);
    }

    static void PasseSimple(String verbe){
        String[] pronoms = {"je ", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] formes = new String[6];
        String radical = verbe.substring(0, verbe.length() - 2);

        if (verbe.equals("être") || verbe.equals("etre")) {
            formes = new String[]{"fus", "fus", "fut", "fûmes", "fûtes", "furent"};
        } else if (verbe.equals("avoir")) {
            formes = new String[]{"eus", "eus", "eut", "eûmes", "eûtes", "eurent"};
        } else if (verbe.equals("faire")) {
            formes = new String[]{"fis", "fis", "fit", "fîmes", "fîtes", "firent"};
        } else if (verbe.equals("boire")) {
            formes = new String[]{"bus", "bus", "but", "bûmes", "bûtes", "burent"};
        } else if (verbe.endsWith("er")) {
            String[] t = {"ai", "as", "a", "âmes", "âtes", "èrent"};
            for (int i = 0; i < 6; i++) formes[i] = radical + t[i];
        } else if (verbe.endsWith("ir") || verbe.endsWith("re")) {
            String[] t = {"is", "is", "it", "îmes", "îtes", "irent"};
            for (int i = 0; i < 6; i++) formes[i] = radical + t[i];
        } else {
            System.out.println("Verbe non reconnu");
            return;
        }

        StringBuilder v = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            v.append(pronoms[i]).append(formes[i]).append("\n");
        }
        System.out.println(v);
    }
    static void PasseCompose(String verbe){
        String[] pronoms = {"j'", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] auxiliaire = {"ai", "as", "a", "avons", "avez", "ont"};
        String radical = verbe.substring(0, verbe.length() - 2);
        String participe;

        if (verbe.equals("faire")) {
            participe = "fait";
        } else if (verbe.equals("boire")) {
            participe = "bu";
        } else if (verbe.equals("avoir")) {
            participe = "eu";
        } else if (verbe.endsWith("er")) {
            participe = radical + "é";
        } else if (verbe.endsWith("ir")) {
            participe = radical + "i";
        } else if (verbe.endsWith("re")) {
            participe = radical + "u";
        } else {
            System.out.println("Verbe non reconnu");
            return;
        }

        StringBuilder v = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            v.append(pronoms[i]).append(auxiliaire[i]).append(" ").append(participe).append("\n");
        }
        System.out.println(v);
    }
    static void PlusQueParfait(String verbe){
        String[] pronoms = {"j'", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] auxiliaire = {"avais", "avais", "avait", "avions", "aviez", "avaient"};
        String radical = verbe.substring(0, verbe.length() - 2);
        String participe;

        if (verbe.equals("faire")) {
            participe = "fait";
        } else if (verbe.equals("boire")) {
            participe = "bu";
        } else if (verbe.equals("avoir")) {
            participe = "eu";
        } else if (verbe.endsWith("er")) {
            participe = radical + "é";
        } else if (verbe.endsWith("ir")) {
            participe = radical + "i";
        } else if (verbe.endsWith("re")) {
            participe = radical + "u";
        } else {
            System.out.println("Verbe non reconnu");
            return;
        }

        StringBuilder v = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            v.append(pronoms[i]).append(auxiliaire[i]).append(" ").append(participe).append("\n");
        }
        System.out.println(v);
    }

    static void Imparfait(String verbe){
            String[] pronoms = {"je ", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
            String[] terminaisons = {"ais", "ais", "ait", "ions", "iez", "aient"};
            String radical = verbe.substring(0, verbe.length() - 2);
            String base;

            if (verbe.equals("être") || verbe.equals("etre")) {
                base = "ét";
            } else if (verbe.equals("avoir")) {
                base = "av";
            } else if (verbe.equals("aller")) {
                base = "all";
            } else if (verbe.equals("faire")) {
                base = "fais";
            } else if (verbe.equals("boire")) {
                base = "buv";
            } else if (verbe.endsWith("er")) {
                base = radical;
            } else if (verbe.endsWith("ir")) {
                base = radical + "iss";
            } else if (verbe.endsWith("re")) {
                base = radical;
            } else {
                System.out.println("Verbe non reconnu");
                return;
            }

            StringBuilder v = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                v.append(pronoms[i]).append(base).append(terminaisons[i]).append("\n");
            }
            System.out.println(v);
        }

    static void PasseAnterieur(String verbe){
        String[] pronoms = {"j'", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] auxiliaire = {"eus", "eus", "eut", "eûmes", "eûtes","eurent"};
        String radical = verbe.substring(0, verbe.length() - 2);
        String participe;

        if (verbe.equals("faire")) {
            participe = "fait";
        } else if (verbe.equals("boire")) {
            participe = "bu";
        } else if (verbe.equals("avoir")) {
            participe = "eu";
        } else if (verbe.endsWith("er")) {
            participe = radical + "é";
        } else if (verbe.endsWith("ir")) {
            participe = radical + "i";
        } else if (verbe.endsWith("re")) {
            participe = radical + "u";
        } else {
            System.out.println("Verbe non reconnu");
            return;
        }

        StringBuilder v = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            v.append(pronoms[i]).append(auxiliaire[i]).append(" ").append(participe).append("\n");
        }
        System.out.println(v);
    }
    static void FuturAnterieur(String verbe){
        String[] pronoms = {"j'", "tu ", "il/elle ", "nous ", "vous ", "ils/elles "};
        String[] auxiliaire = {"aurai", "auras", "aura", "aurons", "aurez", "auront"};
        String radical = verbe.substring(0, verbe.length() - 2);
        String participe;

        if (verbe.equals("faire")) {
            participe = "fait";
        } else if (verbe.equals("boire")) {
            participe = "bu";
        } else if (verbe.equals("avoir")) {
            participe = "eu";
        } else if (verbe.endsWith("er")) {
            participe = radical + "é";
        } else if (verbe.endsWith("ir")) {
            participe = radical + "i";
        } else if (verbe.endsWith("re")) {
            participe = radical + "u";
        } else {
            System.out.println("Verbe non reconnu");
            return;
        }

        StringBuilder v = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            v.append(pronoms[i]).append(auxiliaire[i]).append(" ").append(participe).append("\n");
        }
        System.out.println(v);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le verbe que vous souhaitez conjuguer :");
        String verbe = scanner.nextLine();
        System.out.println("Choisissez un temps :");
        int choix ;
        do{
            System.out.println("1.Present");
            System.out.println("2.Passé simple");
            System.out.println("3.Passé composé");
            System.out.println("4.Plus que parfait");
            System.out.println("5.Future");
            System.out.println("6.Imparfait");
            System.out.println("7.Passé antérieur");
            System.out.println("8.Futur antérieur");
            System.out.println("0.Quitter");
            choix = scanner.nextInt();
            scanner.nextLine();
            switch(choix){
                case 1:
                    Present(verbe);
                    break;

                case 2:
                    PasseSimple(verbe);
                    break;

                case 3:
                    PasseCompose(verbe);
                    break;

                case 4:
                    PlusQueParfait(verbe);
                    break;

                case 5:
                    Future(verbe);
                    break;

                case 6:
                    Imparfait(verbe);
                    break;

                case 7:
                    PasseAnterieur(verbe);
                    break;

                case 8:
                    FuturAnterieur(verbe);
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default :
                    System.out.println("Choix invalide");
            }
        }while (choix != 0);
        scanner.close();
    }
}