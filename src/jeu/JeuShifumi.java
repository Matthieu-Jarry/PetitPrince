package jeu;

import java.util.Random;

public class JeuShifumi extends JeuSimple{
	
	private static enum Shifumi { FEUILLE, CISEAUX, PIERRE}

	public JeuShifumi() {
		super();
		nom = "Shifumi";
	}

	@Override
	public int arbitrer(String c1, String c2) {
		Shifumi s1 = Shifumi.valueOf(c1);
		Shifumi s2 = Shifumi.valueOf(c2);
		System.out.println(c1 + " vs " + c2);
		if ((s1.compareTo(s2) < 0 || (s2.compareTo(Shifumi.FEUILLE) == 0 && s1.compareTo(Shifumi.PIERRE) == 0)) && !(s1.compareTo(Shifumi.FEUILLE) == 0 && s2.compareTo(Shifumi.PIERRE) == 0)) {
			return 1;
		}
		else if (s1.compareTo(s2) > 0 || (s1.compareTo(Shifumi.FEUILLE) == 0 && s2.compareTo(Shifumi.PIERRE) == 0)) {
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	public String jouerTour() {
		Shifumi s;
		Random r = new Random();
		int i = r.nextInt(0, 3);
		switch (i) {
		case 0 -> s = Shifumi.FEUILLE;
		case 1 -> s = Shifumi.CISEAUX;
		case 2 -> s = Shifumi.PIERRE;
		default ->
		throw new IllegalArgumentException("Unexpected value: " + i);
		}
		return s.toString();
	}

	public static void main(String[] args) {
		JeuSimple jeu = new JeuShifumi();
		System.out.println(jeu.arbitrer(jeu.jouerTour(),jeu.jouerTour()));
	}
}
