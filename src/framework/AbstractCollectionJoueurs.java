/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
�tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionJoueurs.java
Date cr��: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification du Javadoc.
2015-06-29 Ajout du mutateur du tableau tabJoueurs.
2015-07-03 Ajout du m�thodes ajouterScore() et getScore().
@author Carole Fabeleu
2015-06-27 Ajout des accesseurs de nbJoueurs et tabJoueurs et de la m�thode ajouterJoueur(). Remplissage du contrat de
			l'interface CollectionToIterate.
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Cette classe repr�sente une collection abstraite de joueurs. Elle g�re les m�thodes d'acc�s au tableau de joueurs et d'ajouter
 * un joueur au tableau. Une de ses m�thodes permet de cr�er un it�rateur qui la parcoure selon le patron it�rateur.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractCollectionJoueurs implements CollectionToIterate {

	protected int nbJoueurs;
	protected AbstractJoueur[] tabJoueurs;
	
	/**
	 * Ajoute un joueur au tableau de joueurs.
	 * @param unJoueur : Le joueur � ajouter.
	 */
	public void ajouterJoueur(AbstractJoueur unJoueur) {
		AbstractJoueur[] tabJoueursTemp = new AbstractJoueur[nbJoueurs + 1];
		for(int i = 0; i < nbJoueurs; i++) {
			tabJoueursTemp[i] = tabJoueurs[i];
		}
		tabJoueursTemp[nbJoueurs] = unJoueur;
		tabJoueurs = tabJoueursTemp;
		nbJoueurs++;
	}
	
	/**
	 * Cr�er un it�rateur qui va pouvoir parcourir le tableau de joueurs.
	 * @return L'it�rateur nouvellement cr�� du tableau de joueurs.
	 */
	@Override
	public Iterator<Object> creerIterateur() {
		ArrayIterator iterateurJoueurs = new ArrayIterator(tabJoueurs);
		return iterateurJoueurs;
	}

	/**
	 * Mutateur du score d'un joueur selectionn� dans tabJoueurs selon son num�ro de joueur
	 * (Num�ro du joueur 1 = 1, Num�ro du joueur 2 = 2, etc.).
	 * @param unNumJoueur : Le num�ro du joueur que l'on cherche � modifier le score.
	 * @param unNbPoints : Les points � ajouter au score du joueur selectionn�.
	 */
	public void ajouterScore(int unNumJoueur, int unNbPoints) {
		tabJoueurs[unNumJoueur - 1].ajouterScore(unNbPoints);
	}

	/**
	 * Accesseur au score d'un joueur selectionn� dans tabJoueurs selon son num�ro de joueur
	 * (Num�ro du joueur 1 = 1, Num�ro du joueur 2 = 2, etc.).
	 * @param unNumJoueur : Le num�ro du joueur dont on cherche le score.
	 * @return Le score actuel du joueur selectionn�.
	 */
	public int getScore(int unNumJoueur) {
		return tabJoueurs[unNumJoueur - 1].getScore();
	}

	/**
	 * Accesseur du nombre de joueurs dans le tableau.
	 * @return Le nombre de joueurs dans le tableau.
	 */
	public int getNbJoueurs() {
		return nbJoueurs;
	}

	/**
	 * Accesseur du tableau de joueurs.
	 * @return Le tableau de joueurs.
	 */
	public AbstractJoueur[] getTabJoueurs() {
		return tabJoueurs;
	}

	/**
	 * Mutateur du tableau de joueurs.
	 * @param Le nouveau tableau de joueurs.
	 */
	public void setTabJoueurs(AbstractJoueur[] unTabJoueurs) {
		tabJoueurs = unTabJoueurs;
	}
	
}
