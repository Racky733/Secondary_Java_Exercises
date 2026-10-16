public class Exo2 {

    public static void main(){

        int nb_copie = 10;
        float prix;
        
        if(nb_copie <= 10){
            
            prix = nb_copie * 0.10f
            ;
        }
        else if(nb_copie >10 && nb_copie <=30){

            prix = 10 * 0.10f + (nb_copie - 10) * 0.08f;
        }
        else{
            
            prix = (nb_copie - 30) * 0.07f;
        }

     System.out.println("Le prix des " + nb_copie+ "copies est :" + prix);
    }

}
