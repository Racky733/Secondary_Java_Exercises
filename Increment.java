    public class Increment {
    public static void main(String[] args) { 
        int i = 5; 
        int a = i++;   // a reçoit 5, PUIS i passe à 6 
        int j = 5; 
        int b = ++j;   // j passe à 6, PUIS b reçoit 6 
        System.out.println("a=" + a + " i=" + i + " b=" + b + " j=" + j); 
        System.out.println(-7 / 2 + " " + -7 % 2);             // troncature vers 0 
        System.out.println(Math.floorDiv(-7, 2) + " " + Math.floorMod(-7, 2)); 
    } 
}