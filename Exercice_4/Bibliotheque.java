package ex;
	import java.util.HashSet;
	import java.util.Set;

public class Bibliotheque {
	Bibliotheque centrale = new Bibliotheque("Centrale");
	    private static int compteur = 0;
	    public Set<Livre> getCollection() {
	        return collection;
	    }
	    private final int id;
	    private String nom;
	    private Set<Livre> collection = new HashSet<>();

	    public Bibliotheque(String nom) {
	        this.id = ++compteur;
	        this.nom = nom;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public java.util.Set<Livre> getCollection() {
	        return collection;
	    
	    }

	    public void ajouterLivre(Livre livre) {
	        collection.add(livre);
	    }

	    public String toString() {
	        return "Bibliotheque[id=" + id
	                + ", nom=" + nom
	                + ", taille=" + collection.size()
	                + "]";
	}
}
