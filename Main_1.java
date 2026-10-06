package TP;

public class Main {
	    public static void main(String[] args) {

	        Etudiant e1 = new Etudiant("Lio", "Messi");
	        Etudiant e2 = new Etudiant("Cristiano", "Ronado");

	        e1.ajouterNote(14.5);
	        e1.ajouterNote(12.0);
	        e1.ajouterNote(16.0);

	        e2.ajouterNote(10.0);
	        e2.ajouterNote(13.5);

	        e1.afficherNotes();
	        System.out.println(e1);

	        e2.afficherNotes();
	        System.out.println(e2);
	    }
}
