package jeu;

public abstract class JeuSimple {

	protected String nom;
	
	public abstract int arbitrer(String c1, String c2);
	
	public String getNom() {
		return nom;
	}
	
	public abstract String jouerTour();
}
