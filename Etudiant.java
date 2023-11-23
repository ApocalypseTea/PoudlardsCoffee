public class Etudiant extends Sorcier{
    //Variables d'instance
    private String niveauEtude;


    //Constructeurs
    Etudiant(){
        this("inconnu","inconnu", 0, "inconnu", Maison.INCONNUE);
        System.out.println("Nouvel étudiant inconnu");
    }

    Etudiant (String nom, String prenom, int age, String niveauEtude){
        this(nom,prenom, age, niveauEtude, Maison.INCONNUE);
    }

    Etudiant (String nom, String prenom, int age, String niveauEtude, Maison maison){
        super(nom, prenom, age, maison);
        this.setAge(age);
        this.setNiveauEtude(niveauEtude);
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", age=" + getAge() +
                ", niveauEtude='" + getNiveauEtude() + '\'' +
                ", maison=" + getMaison() +
                '}';
    }

    public void setNiveauEtude(String niveauEtude){
        this.niveauEtude=niveauEtude;
    }

    public String getNiveauEtude(){
        return niveauEtude;
    }
}
