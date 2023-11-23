public class Moldu extends Personne{
    Moldu(String nom, String prenom, int age){
        super(nom, prenom, age);
    }

    public String toString() {
        return "Moldu{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\''+
                '}';
    }

}
