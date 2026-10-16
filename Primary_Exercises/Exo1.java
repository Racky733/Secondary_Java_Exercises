public class Exo1 {
    static void main(){
        int a = 4;
        int b = 2;
        int rest;

        rest = a % b;

        if(rest == 0){

            System.out.println("Vrai");
        }
        else if(b % a == 0){

            System.out.println("Vrai");
        }
    }
}
