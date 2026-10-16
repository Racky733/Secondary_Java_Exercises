public class Montre {
    int heure;
    int minute;

public Montre(int heure, int minute) {
        this.heure = heure;   
        this.minute = minute; 
    }

public void afficherMinute(){

    System.out.println(heure+"h:"+minute+"mn");
}
public void avanceeHeure(){
    if(this.minute < 59 ){
        this.minute = this.minute + 1;
    }
    else{
        if(this.heure < 24){
            this.heure = this.heure +1;
            this.minute = 0;
        }
        else{
            this.heure = 0;
            this.minute = 0;
        }
    }
}

 public static void main(String[] args){
    Montre M1 = new Montre(13,45);
    Montre M2 = new Montre(M1.heure,M1.minute);

    M1.afficherMinute();
    M2.afficherMinute();
    M1.avanceeHeure();
    M2.avanceeHeure();

 }

}



