/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: Jeu.java
Date créé: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification des m�thodes initialiserNbTours(), creerCollectionDes(), creerCollectionJoueurs(),
			calculerScoreTour() et calculerVainqueurs.
2015-06-29 Correction des m�thodes creerCollectionJoueurs() et calculerScoreTour(). Modification du Javadoc.
2015-07-02 Modification de la m�thode initialiserNbTours() par initialiserTours(). Ajout de l'initialisation des
			attributs tourJoueur et numTour dans la m�thode initialiserTours().
2015-07-03 Ajout de l'initialisation de strategie et des accesseurs pour le tableau de d�s et le score d'un joueur.
			Correction de la m�thode calculerScoreTour().
*******************************************************/  

package buncoPlus;

import javax.swing.JOptionPane;

import framework.*;

/**
 * Cette classe repr�sente le jeu Bunco+.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class Jeu extends AbstractJeu {
	
	private Strategie strategie = new Strategie();
	
	/**
	 * Constructeur
	 */
	public void Jeu() {
	}
	
	/**
	 * Initialise le nombre de tours du jeu.
	 */
	@Override
	public void initialiserTours() {
		tourJoueur = 1;
		numTour = 1;
		nbTours = 6;
	}

	/**
	 * Cr�e la collection de d�s qu'utilise le jeu.
	 */
	@Override
	public void creerCollectionDes() {
		int unNbDes = 3;
		int unNbFaces = 6;
		
		collectionDes = new CollectionDes(unNbDes, unNbFaces);
	}

	/**
	 * Cr�e la collection de joueurs qu'utilise le jeu.
	 */
	@Override
	public void creerCollectionJoueurs() {
		int nbJoueurs = 5;
		String[] tabNoms = {"Joueur 1", "Joueur 2", "Joueur 3", "Joueur 4", "Joueur 5"};
		
		collectionJoueurs = new CollectionJoueurs(nbJoueurs, tabNoms);
	}

	/**
	 * Calcule le score du tour courant pour un joueur.
	 * @return Un tableau d'objet qui contient le score du joueur en entier et un bool�en qui d�termine s'il passe
	 * 			au suivant ou non.
	 */
	@Override
	public Object[] calculerScoreTour() {
		Object[] tabScores = strategie.calculerScoreTour(collectionDes.roulerDes(), numTour);
		
		int score = (int) tabScores[0];
		boolean passe = (boolean) tabScores[1];
		
		collectionJoueurs.ajouterScore(tourJoueur, score);
		
		if(passe) {
			if(tourJoueur < 5) {
				tourJoueur++;
			}
			else {
				tourJoueur = 1;
				numTour++;
			}
		}
		
		return tabScores;
	}

	/**
	 * Trie le tableau de joueurs selon leur score respectif.
	 * @return Le tableau de joueurs tri�.
	 */
	@Override
	public Joueur[] calculerVainqueur() {
		Joueur[] tabVainqueurs = strategie.calculerVainqueur(collectionJoueurs.getTabJoueurs());
		return tabVainqueurs;
	}

	/**
	 * Accesseur du tableau de d�s dans collectionDes.
	 * @return Le tableau de d�s de collectionDes.
	 */
	public De[] getTabDes() {
		return (De[]) collectionDes.getTabDes();
	}

	/**
	 * Accesseur du score d'un joueur dans collectionJoueurs selon son num�ro de joueur
	 * (Num�ro du joueur 1 = 1, Num�ro du joueur 2 = 2, etc.).
	 * @param unNumJoueur : Le num�ro du joueur que l'on cherche � modifier le score.
	 * @return Le score du joueur selectionn�.
	 */
	public int getScoreJoueur(int unNumJoueur) {
		return collectionJoueurs.getScore(unNumJoueur);
	}
	
}
