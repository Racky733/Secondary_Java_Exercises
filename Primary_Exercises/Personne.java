public class Personne {
    String nom ;
    Montre m;
    
    public Personne(String nom){
        this.nom = nom;
        this.m = null;
    }

    public void fairePorter(Montre m){
        if(this.m == null){
            this.m = m;
        }
        else{
            System.out.println("J'ai deja une montre :)");
        }
    }
    
    public void enlever(){
        if(this.m != null){
            this.m = null;
        }
        else{
            System.out.println("Je ne porte pas de montre!");
        }
    }

    public String demanderHeure(Personne p){
        if (p.m != null){
            return p.m.heure+"h:"+p.m.minute+"mn";
        }
        else{
            System.out.println("je ne porte pas de montre.");
            return"";
        }
        
}
}
