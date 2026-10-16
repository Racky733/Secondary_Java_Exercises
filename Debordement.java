public class Debordement { 
    public static void main(String[] args) { 
        int ventesJour = 2_000_000_000;           // 2 milliards de FCFA 
        int ventesDeuxJours = ventesJour * 2;     // débordement ! 
        System.out.println("Avec int  : " + ventesDeuxJours); 
 
        long correct = ventesJour * 2L;           // le calcul se fait en long 
        System.out.println("Avec long : " + correct); 
 
        try { 
            Math.multiplyExact(ventesJour, 2);    // lève une exception au lieu de mentir 
        } catch (ArithmeticException e) { 
            System.out.println("Détecté : " + e.getMessage()); 
        } 
    } 
} 