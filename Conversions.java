public class Conversions { 
    public static void main(String[] args) { 
        double prixMoyen = 2749.87; 
        int arrondiInf = (int) prixMoyen;           // troncature : 2749 
        long arrondi = Math.round(prixMoyen);       // arrondi : 2750 
        System.out.println(arrondiInf + " / " + arrondi); 
 
        int grand = 130; 
        byte petit = (byte) grand;                  // dépasse 127 : -126 ! 
        System.out.println("130 en byte = " + petit); 
 
        // Division entière : le piège classique 
        int total = 7, nbArticles = 2; 
        System.out.println("7 / 2       = " + (total / nbArticles)); 
        System.out.println("7 / 2.0     = " + (total / 2.0)); 
        System.out.println("(double) 7/2 = " + ((double) total / nbArticles)); 
        System.out.println("(double)(7/2) = " + (double) (total / nbArticles)); 
    } 
}