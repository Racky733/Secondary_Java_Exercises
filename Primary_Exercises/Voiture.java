public class Voiture {
    
    String mark, model, coul, mat;
    double vitesse;
    
public void demarrer(){
    System.out.println("J'ai demarrer");
}

public void modifier(String c){
    this.coul = c;
}

public void accelerer(double v){
    this.vitesse = this.vitesse+v ;
}

public Voiture(String mark, String model, String coul, String mat, double vitesse){
    this.mark = mark;
    this.model = model;
    this.coul = coul;
    this.mat = mat;
    this.vitesse = vitesse;
}

public static void main(){
    Voiture v1 = new Voiture("BMW","X5","Black","DK-574",300);
    Voiture v2 = new Voiture(null,null,null,null,0.0);
    //v1.init("BMW","X5","Black","DK-574",300);
    System.out.println("Marque:"+v1.mark+"\n Model:"+v1.model+"\n Couleur:"+v1.coul+
    "\n Matricule:"+v1.mat+"\nVitesse:"+v1.vitesse+"Km/h");
    v1.demarrer();
    v2.mark = v1.mark;
    v2.accelerer(200);
    v1.accelerer(100);
    System.out.println("Marque:"+v1.mark+"\n Model:"+v1.model+"\n Couleur:"+v1.coul+
    "\n Matricule:"+v1.mat+"\nVitesse:"+v1.vitesse+"Km/h");
    System.out.println("Marque:"+v2.mark+"\n Model:"+v2.model+"\n Couleur:"+v2.coul+
    "\n Matricule:"+v2.mat+"\nVitesse:"+v2.vitesse+"Km/h");
}
}