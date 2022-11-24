package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet{
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince0() {
		cpt = 0;
		argent = 100;
		nom = "Petit Prince";
		console = new ConsoleJavaBoy(this);
		run();
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public int getArgent() {
		return argent;
	}

	@Override
	public void run() {
		console.parler("J'ai fait " +cpt+ " tour");
		console.seDirigerVers(0);
		cpt++;
	}



}
