package ex;

public class Main {

    public static void main(String[] args) {

        Auteur hugo = new Auteur("Victor Hugo");
        Auteur sefrioui = new Auteur("Ahmed Sefrioui");

        Livre m1 = new Livre(
                "Les Misérables",
                hugo
        );

        Livre ndp = new Livre(
                "Notre-Dame de Paris",
                hugo
        );

        Livre boite = new Livre(
                "La Boite A Merveilles",
                sefrioui
        );

        Bibliotheque centrale =
                new Bibliotheque("Centrale");

        Bibliotheque quartier =
                new Bibliotheque("Quartier");

        centrale.ajouterLivre(m1);
        centrale.ajouterLivre(boite);

        quartier.ajouterLivre(m1);
        quartier.ajouterLivre(ndp);

        System.out.println(hugo);

        for (Livre livre : hugo.getLivres()) {
            System.out.println("  • " + livre);
        }
        }

        System.out.println(sefrioui);

        for (Livre livre : sefrioui.getLivres()) {
            System.out.println("  • " + livre);
        }

        System.out.println(centrale);

        for (Livre livre : centrale.getCollection()) {
            System.out.println(
                    "  – "
                    + livre.getTitre()
                    + " (id="
                    + livre.getId()
                    + ")"
            );
        }

        System.out.println(quartier);

        for (Livre livre : quartier.getCollection()) {
            System.out.println(
                    "  – "
                    + livre.getTitre()
                    + " (id="
                    + livre.getId()
                    + ")"
            );
        }
    }
}
