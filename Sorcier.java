public class Sorcier extends Personne{

    private Maison maison;


    //CONSTRUCTEUR
    Sorcier(String nom, String prenom, int age, Maison maison){
        super(nom, prenom, age);
        this.maison=maison.POUDLARD;
    }



    public Maison getMaison() {
        return maison;
    }
    public void setMaison(Maison maison) {
        this.maison = maison;
    }


}
