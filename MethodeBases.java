public class MethodeBases {
    public static void main(String [] args){
        String s = "  TerangaShop, Dakar - Sénégal  ";
        String sn = s.strip() ;
        System.out.println(sn);
        System.out.println("Longueur avant nettoyage" +s.length());
        System.out.println("Longueur apres nettoyage"+sn.length());
        System.out.println("La position de la virgule:"+ sn.indexOf(','));
        System.out.println(sn.contains("Dakar"));
        System.out.println(sn.indexOf("Dakar"));
        System.out.println(sn.substring(13, 18));
        System.out.println(sn.toUpperCase());
        sn = sn.replace("-", ",");
        System.out.println(sn);
        int nbmots = sn.split(",").length;
        System.out.println(sn);
        System.out.println("Nombre de mots:"+nbmots);
    }
}
