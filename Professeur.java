public class Professeur extends Sorcier{
    //Variables d'instance
    String matiere;
    Boolean profPrincipal;

    //Constructeur
    Professeur (String nom, String prenom, int age, String matiere, Boolean profPrincipal){
        super(nom, prenom, age, Maison.POUDLARD);
        this.matiere=matiere;
        this.profPrincipal=profPrincipal;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Boolean getProfPrincipal() {
        return profPrincipal;
    }

    public void setProfPrincipal(Boolean profPrincipal) {
        this.profPrincipal = profPrincipal;
    }

    public String toString() {
        return "Professeur{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", age=" + getAge() +
                ", matière ='" + getMatiere() + '\'' +
                ", maison=" + getMaison() +
                ", Principal=" + getProfPrincipal()+
                '}';
    }
}
