public class RecuJS {

    static String recuJson(String client, String[] articles, long[] prix, int[] quantites) {
        StringBuilder lignes = new StringBuilder();
        long total = 0;

        for (int i = 0; i < articles.length; i++) {
            long sousTotal = prix[i] * quantites[i];
            total += sousTotal;

            if (i > 0) {
                lignes.append(",\n");
            }
            lignes.append("    {\n")
                  .append("      \"libelle\": \"").append(articles[i]).append("\",\n")
                  .append("      \"quantite\": ").append(quantites[i]).append(",\n")
                  .append("      \"prixUnitaire\": ").append(prix[i]).append(",\n")
                  .append("      \"sousTotal\": ").append(sousTotal).append("\n")
                  .append("    }");
        }

        return """
                {
                  "client": "%s",
                  "lignes": [
                %s
                  ],
                  "total": %d
                }
                """.formatted(client, lignes, total);
    }

    public static void main(String[] args) {
        String[] articles = {"Riz 5kg", "Huile 1L", "Sucre 1kg"};
        long[] prix = {4500, 1800, 700};
        int[] quantites = {2, 1, 3};

        System.out.println(recuJson("Awa Diop", articles, prix, quantites));
    }
}