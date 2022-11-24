package jeu;

import java.util.Random;

public class JeuDe extends JeuSimple{

	public JeuDe() {
		super();
		nom = "Jeu Dé";
	}

	@Override
	public int arbitrer(String c1, String c2) {
		int j1 = Integer.parseInt(c1);
		int j2 = Integer.parseInt(c2);
		return j2-j1;
	}

	@Override
	public String jouerTour() {
		Random r = new Random();
		int c = r.nextInt(1,7);
		String s = "" + c;
		return s;
	}

}
