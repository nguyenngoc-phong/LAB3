/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: Strategie.java
Date créé: 2015-06-23
Date dern. modif.: 2015-07-02
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-02 Modification des m�thodes calculerScoreTour() et calculerVainqueur().
@author Dam-Hissey Kantchil
2015-07-01 Ajout des m�thodes calculerScoreTour() et calculerVainqueur().
*******************************************************/  

package buncoPlus;

import framework.*;

/**
 * Cette classe concr�te permet de calculer le score d'un joueur apr�s avoir lancer des d�s selon les r�gles du jeu
 * Bunco+ et de trier les joueurs selon leur score en ordre d�croissant. Cette classe suit le patron "Strat�gie".
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class Strategie implements IStrategie {
	
	public Strategie() {
		
	}

	/**
	 * Calcule le score du tour courant pour un joueur.
	 * @param tabDes : Le tableau de d� avec lequel on calcule le score.
	 * @param numTour : Le num�ro du tour courant.
	 * @return Un tableau d'objet qui contient le score du joueur en entier et un bool�en qui d�termine
	 * 			s'il passe au suivant ou non.
	 */
	@Override
	public Object[] calculerScoreTour(AbstractDe[] tabDes, int numTour) {
		int[] tabValeurs = new int[tabDes.length];
		
		for(int i = 0; i < tabDes.length; i++) {
			tabValeurs[i] = tabDes[i].getValeur();
		}
		
		int score = 0;
		boolean passe;
		
		if(tabValeurs[0] == tabValeurs[1] && tabValeurs[1] == tabValeurs[2]) {
			if(tabValeurs[0] == numTour) {
				score = 21;
			}
			else {
				score = 5;
			}
		}
		else {
			for(int i : tabValeurs) {
				if(i == numTour) {
					score++;
				}
			}
		}

		if(score != 0 && score != 21) {
			passe = false;
		}
		else {
			passe = true;
		}
		
		Object[] tabScores = {score, passe};
		return tabScores;
	}

	/**
	 * Trie le tableau de joueurs selon leur score respectif en ordre d�croissant.
	 * @param tabJoueurs : Le tableau de joueurs avec lequel on veut trier les joueurs.
	 * @return Le tableau de joueurs tri�.
	 */
	@Override
	public Joueur[] calculerVainqueur(AbstractJoueur[] tabJoueurs) {
		AbstractJoueur joueurTemp;
		
		for(int i = 1; i < tabJoueurs.length; i++) {
			for(int j = i; j > 0; j--) {
				if(tabJoueurs[j].getScore() > tabJoueurs[j - 1].getScore()) {
					joueurTemp = tabJoueurs[j - 1];
					tabJoueurs[j - 1] = tabJoueurs[j];
					tabJoueurs[j] = joueurTemp;
				}
				// Si les scores des joueurs sont �gales, ceux-ci sont tri�s selon leurs noms
				else if(tabJoueurs[j].getScore() == tabJoueurs[j - 1].getScore()) {
					if(tabJoueurs[j].getNom().compareTo(tabJoueurs[j - 1].getNom()) == -1) {
						joueurTemp = tabJoueurs[j - 1];
						tabJoueurs[j - 1] = tabJoueurs[j];
						tabJoueurs[j] = joueurTemp;
					}
				}
			}
		}
		
		return (Joueur[]) tabJoueurs;
	}

}