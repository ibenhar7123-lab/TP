package exer;

public class Main {

	    public static void main(String[] args) {

	        Filiere info = new Filiere("Informatique");
	        Filiere genie = new Filiere("Génie Civil");

	        Eleves e1 = new   Eleves("David", "Beckham");
	        Eleves e2 = new   Eleves("Hakimi", "Achraf");
	        Eleves e3 = new   Eleves("Paul", "Pogba");
	        Eleves e4 = new   Eleves("Jude", "Bellingham");
	        Eleves e5 = new   Eleves("Xavi", "Hernandez");
	        Eleves e6 = new   Eleves("Luka", "Modric");

	        info.ajouterEtudiant(e1);
	        info.ajouterEtudiant(e2);
	        info.ajouterEtudiant(e3);
	        info.ajouterEtudiant(e4);
	        info.ajouterEtudiant(e5);
	        info.ajouterEtudiant(e6);

	  
	        genie.ajouterEtudiant(
	                new   Eleves("Toni", "Kroos")
	        );

	        genie.ajouterEtudiant(
	                new   Eleves("Arda", "Guler")
	        );

	        System.out.println(info);
	        info.afficherEtudiants();

	        System.out.println();

	        System.out.println(genie);
	        genie.afficherEtudiants();

	        System.out.println();

	        System.out.println("Détail de e3 : " + e3);
	    }
}

