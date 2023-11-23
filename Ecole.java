import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecole {
    //Variables d'instance
    private String nomEcole;
    int nbClasse;
    private List<Professeur> tableauProfs;
    private List<Etudiant> tableauEtudiants;
    private List<Moldu> tableauMoldu;

    //Constructeur
    Ecole (String nomEcole, int nbClasse){
        this.nomEcole = nomEcole;
        this.nbClasse = nbClasse;
        tableauProfs = new ArrayList<>();
        tableauEtudiants = new ArrayList<>();
        tableauMoldu = new ArrayList<>();
    }

    //Méthodes
    void ajouterProfesseur(Professeur nouveauProf) {
        tableauProfs.add(nouveauProf);
        System.out.println("Le professeur " + nouveauProf.getNom() + " " + nouveauProf.getPrenom() + "a été ajouté à l'école " + getNomEcole());
    }

    void ajouterEtudiant(Etudiant ...nouveauEtudiant) {
        for(Etudiant e:nouveauEtudiant) {
            tableauEtudiants.add(e);
            System.out.println("L'etudiant " + e.getNom() + " " + e.getPrenom() + " a été ajouté à l'école " + getNomEcole());
        }
    }
    void ajouterMoldu(Moldu ...nouveauMoldu){
        for(Moldu m:nouveauMoldu) {
            tableauMoldu.add(m);
            System.out.println("Le moldu " + m.getNom() + " " + m.getPrenom() + " a été ajouté à l'école " + getNomEcole());
        }

    }
    List <Professeur> getTableauProfs(){
        return tableauProfs;
    }

    String getNomEcole(){
        return nomEcole;
    }

    void setNomEcole(String nomEcole){
        this.nomEcole=nomEcole;
    }

    void supprimerProfesseur(Professeur ancienProf){
        tableauProfs.remove(ancienProf);
        System.out.println("Le professeur " + ancienProf.getNom() + " " + ancienProf.getPrenom() + " a été retiré de l'école " + getNomEcole());
    }

    void supprimerEtudiant(Etudiant etudiantMort){
        tableauEtudiants.remove(etudiantMort);
        System.out.println("L'étudiant " + etudiantMort.getPrenom() + " " + etudiantMort.getNom() + " a été retiré de l'école " + getNomEcole());
    }

    void supprimerMoldu(Moldu ancienMoldu){
        tableauMoldu.remove(ancienMoldu);
        System.out.println("Le Moldu " + ancienMoldu.getPrenom() + " " + ancienMoldu.getNom() + " a été retiré de l'école " + getNomEcole());
    }

    public Etudiant trouverEtudiant(String motClef) {

            for(int i=0; i< tableauEtudiants.size(); i++){
                if(motClef.equals(tableauEtudiants.get(i).getNom())||motClef.equals(tableauEtudiants.get(i).getPrenom())){
                    return tableauEtudiants.get(i);
                }
            }
            return null;
    }

    public Professeur trouverProf(String motClef) {
        for (int i = 0; i < tableauProfs.size(); i++) {
            if (motClef.equals(tableauProfs.get(i).getNom()) || motClef.equals(tableauProfs.get(i).getPrenom())||motClef.equals(tableauProfs.get(i).getMatiere())) {
                return tableauProfs.get(i);
            }
        }
        return null;
    }

    public Moldu trouverMoldu(String motclef){
        for (int i=0; i< tableauMoldu.size(); i++){
            if(motclef.equals(tableauMoldu.get(i).getNom())||motclef.equals(tableauMoldu.get(i).getPrenom())){
                return tableauMoldu.get(i);
            }
        }
        return null;
    }

    public List<Moldu> getTableauMoldu(){
        return tableauMoldu;
    }

    public List<Professeur> getTableauProf(){
        return tableauProfs;
    }

    public List<Etudiant> getTableauEtudiants(){
        return tableauEtudiants;
    }




}
