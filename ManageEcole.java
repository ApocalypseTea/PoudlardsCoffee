import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ManageEcole {

    public static Ecole creerEcole(){
        Scanner saisieClavier = new Scanner(System.in);
        System.out.println("Donnez le nom à votre école :");
        String nomEcole = saisieClavier.next();
        System.out.println("Nombre de classes");
        int nbClasses = saisieClavier.nextInt();
        Ecole nouvelleEcole=new Ecole(nomEcole, nbClasses);
        return nouvelleEcole;
    }
    public static void menuSecretariat(Ecole ecole) {
        System.out.println("Bienvenue au sécretariat de l'école de Poudlard");
        System.out.println("Que souhaitez vous faire ?");
        System.out.println("1 : Ajouter un Sorcier");
        System.out.println("2 : Supprimer un Sorcier");
        System.out.println("3 : Rechercher un Sorcier");
        System.out.println("4 : Recuperer la liste des Sorciers");

        Scanner saisieClavier = new Scanner(System.in);
        int choixMenu = saisieClavier.nextInt();

        switch (choixMenu) {
            case 1 : menuAjout(ecole);
                break;
            case 2 : menuSuppr(ecole);
                break;
            case 3 : menuRecherche(ecole);
                break;
            case 4 : menuListe(ecole);
                break;
            default: menuSecretariat(ecole);
        }
    }

    public static void menuAjout(Ecole ecole){

        System.out.println("Menu : Ajouter un Sorcier");

        System.out.println("1:Ajouter un étudiant");
        System.out.println("2:Ajouter un professeur");
        System.out.println("3:Ajouter un Moldu");
        System.out.println("4:Revenir au menu initial");

        Scanner saisieClavier = new Scanner(System.in);
        int choixMenuAjouter = saisieClavier.nextInt();

        switch (choixMenuAjouter) {
            case 1:
                Etudiant nouvelEtudiant = new Etudiant();

                System.out.println("Nom de l'étudiant ?");
                String nomEtudiant = saisieClavier.next();
                nouvelEtudiant.setNom(nomEtudiant);

                System.out.println("Prenom de l'étudiant ?");
                String prenomEtudiant = saisieClavier.next();
                nouvelEtudiant.setPrenom(prenomEtudiant);

                System.out.println("Niveau de l'étudiant ?");
                nouvelEtudiant.setNiveauEtude(saisieClavier.next());

                System.out.println("Age de l'étudiant ?");
                nouvelEtudiant.setAge(saisieClavier.nextInt());

                System.out.println("Le Choixpeau Magique n'a pas encore determiné de maison pour cet étudiant");
                nouvelEtudiant.setMaison(Maison.INCONNUE);

                ecole.ajouterEtudiant(nouvelEtudiant);
                menuSecretariat(ecole);
                break;
            case 2:
                System.out.println("Nom du professeur ?");
                String nom = saisieClavier.next();
                System.out.println("Prenom du professeur ?");
                String prenom = saisieClavier.next();
                System.out.println("Age du professeur ?");
                int age = saisieClavier.nextInt();
                System.out.println("Matière enseignée ?");
                String matiere = saisieClavier.next();
                System.out.println("Professeur principal ? true ou false");
                Boolean principal = saisieClavier.hasNextBoolean();

                Professeur nouveauProf = new Professeur(nom, prenom, age, matiere, principal);
                ecole.ajouterProfesseur(nouveauProf);
                menuSecretariat(ecole);
                break;

            case 3:
                System.out.println("Nom du moldu ?");
                String nomM = saisieClavier.next();
                System.out.println("Prenom du moldu ?");
                String prenomM = saisieClavier.next();
                System.out.println("Age du moldu ?");
                int ageM = saisieClavier.nextInt();

                Moldu nouveauMoldu = new Moldu(nomM, prenomM, ageM);
                ecole.ajouterMoldu(nouveauMoldu);
                menuSecretariat(ecole);

                break;

            default:
                System.out.println("Retour au menu principal");
                menuSecretariat(ecole);


        }
    }

    public static void menuSuppr(Ecole ecole){
        System.out.println("Menu : Supprimer un Sorcier");

        System.out.println("1:Supprimer un étudiant");
        System.out.println("2:Supprimer un professeur");
        System.out.println("3:Supprimer un Moldu");
        System.out.println("4:Revenir au menu initial");

        Scanner saisieClavier = new Scanner(System.in);
        int choixMenuSuppr = saisieClavier.nextInt();

        switch (choixMenuSuppr) {
            case 1:
                System.out.println("Nom ou Prenom de l'étudiant");
                String rechercheEtu = saisieClavier.next();
                ecole.supprimerEtudiant(ecole.trouverEtudiant(rechercheEtu));
                menuSecretariat(ecole);
                break;
            case 2:
                System.out.println("Nom, prenom ou matiere enseignée du professeur ?");
                String rechercheProf = saisieClavier.next();
                ecole.supprimerProfesseur(ecole.trouverProf(rechercheProf));
                menuSecretariat(ecole);
                break;

            case 3:
                System.out.println("Nom ou prenom du moldu ?");
                String rechercheMoldu = saisieClavier.next();
                ecole.supprimerMoldu(ecole.trouverMoldu(rechercheMoldu));
                menuSecretariat(ecole);
                break;

            default:
                System.out.println("Retour au menu principal");
                menuSecretariat(ecole);


        }

    }

    public static void menuRecherche(Ecole ecole){
        System.out.println("Sorcier en cours de recherche");
        menuSecretariat(ecole);
    }
/*
    public static Sorcier menuRecherche(){

        System.out.println("Menu : Rechercher un Sorcier");

        System.out.println("1:Rechercher par nom ou prénom");
        System.out.println("2:Rechercher par maison");
        System.out.println("3:Rechercher par fonction");
        System.out.println("4:Revenir au menu initial");

        Scanner saisieClavier = new Scanner(System.in);
        int choixMenuRecherche = saisieClavier.nextInt();
        switch (choixMenuRecherche){
            case 1 :
                System.out.println("Nom ou Prenom du sorcier ?");
                String rechercheNom = saisieClavier.next();
                Etudiant etudiant = trouverEtudiant(rechercheNom);
                Professeur professeur = trouverProf(rechercheNom);
                Moldu moldu = trouverMoldu(rechercheNom);
                if (etudiant != null){
                    return etudiant;
                } else if (professeur != null){
                    return professeur;
                } else if (moldu != null){
                    return moldu;
                } else {
                    System.out.println("Pas de sorcier de ce nom ou prenom");
                    return null;
                }

            case 2 :
                System.out.println("Maison du sorcier ?");
                String rechercheParMaison = saisieClavier.next();
                if(rechercheParMaison.equals("GRYFFONDOR")){
                    for (int i = 0; i < tableauEtudiants.size(); i++) {
                        if(tableauEtudiants.get(i).equals("GRYFFONDOR"){
                            return (Sorcier)tableauEtudiants.get(i);
                        }

                    }
                }
                return null;

            case 3 :
                System.out.println("Fonction du Sorcier ?");
                String rechercheFonction = saisieClavier.next();

                for (int i = 0; i < tableauEtudiants.size(); i++) {
                    if(rechercheFonction.equals(tableauEtudiants.get(i))){
                        return (Sorcier) tableauEtudiants.get(i);
                    }
                }

                if(rechercheFonction instanceof Etudiant){
                    return (Sorcier)tableauEtudiants;
                } else if(rechercheFonction instanceof Professeur){
                    return (Sorcier)tableauProfs;
                } else if (rechercheFonction instanceof Moldu) {
                    return (Sorcier)tableauMoldu;

                }else {
                    System.out.println("Pas de Sorcier enregistré avec cette fonction");
                    return null;
                }


            default:
                System.out.println("Retour au menu");
                menuSecretariat();
                return null;
        }
    }*/

    public static void menuListe(Ecole ecole){
        System.out.println("Quel listing de Sorciers souhaitez vous ?");
        System.out.println("1: Professeurs");
        System.out.println("2: Etudiants");
        System.out.println("3: Moldus");
        System.out.println("4: Retour au menu principal");

        Scanner saisieClavier = new Scanner(System.in);
        int choixMenuListe = saisieClavier.nextInt();

        switch (choixMenuListe){
            case 1 :
                for (int i = 0; i < ecole.getTableauProf().size(); i++) {
                    System.out.println(ecole.getTableauProf().get(i).toString());
                }
                break;

            case 2 :
                for (int i = 0; i < ecole.getTableauEtudiants().size(); i++) {
                    System.out.println(ecole.getTableauEtudiants().get(i).toString());
                }
                break;

            case 3 :
                for (int i = 0; i < ecole.getTableauMoldu().size(); i++) {
                    System.out.println(ecole.getTableauMoldu().get(i).toString());
                }
                break;

            default:
                System.out.println("Retour au menu principal");
                menuSecretariat(ecole);

        }
    }

    public static void recupEtudiants(Ecole ecole){
        BufferedReader reader=new BufferedReader(new FileReader("ListeEtudiants.txt"));
        String ligne=reader.readLine();
        String [] section = ligne.split(",");
    }


}
