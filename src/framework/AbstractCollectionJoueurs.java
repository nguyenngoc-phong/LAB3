/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionJoueurs.java
Date créé: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification du Javadoc.
2015-06-29 Ajout du mutateur du tableau tabJoueurs.
2015-07-03 Ajout du méthodes ajouterScore() et getScore().
@author Carole Fabeleu
2015-06-27 Ajout des accesseurs de nbJoueurs et tabJoueurs et de la méthode ajouterJoueur(). Remplissage du contrat de
			l'interface CollectionToIterate.
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Cette classe représente une collection abstraite de joueurs. Elle gère les méthodes d'accès au tableau de joueurs et d'ajouter
 * un joueur au tableau. Une de ses méthodes permet de créer un itérateur qui la parcoure selon le patron itérateur.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractCollectionJoueurs implements CollectionToIterate {

	protected int nbJoueurs;
	protected AbstractJoueur[] tabJoueurs;
	
	/**
	 * Ajoute un joueur au tableau de joueurs.
	 * @param unJoueur : Le joueur à ajouter.
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
	 * Créer un itérateur qui va pouvoir parcourir le tableau de joueurs.
	 * @return L'itérateur nouvellement créé du tableau de joueurs.
	 */
	@Override
	public Iterator<Object> creerIterateur() {
		ArrayIterator iterateurJoueurs = new ArrayIterator(tabJoueurs);
		return iterateurJoueurs;
	}

	/**
	 * Mutateur du score d'un joueur selectionné dans tabJoueurs selon son numéro de joueur
	 * (Numéro du joueur 1 = 1, Numéro du joueur 2 = 2, etc.).
	 * @param unNumJoueur : Le numéro du joueur que l'on cherche à modifier le score.
	 * @param unNbPoints : Les points à ajouter au score du joueur selectionné.
	 */
	public void ajouterScore(int unNumJoueur, int unNbPoints) {
		tabJoueurs[unNumJoueur - 1].ajouterScore(unNbPoints);
	}

	/**
	 * Accesseur au score d'un joueur selectionné dans tabJoueurs selon son numéro de joueur
	 * (Numéro du joueur 1 = 1, Numéro du joueur 2 = 2, etc.).
	 * @param unNumJoueur : Le numéro du joueur dont on cherche le score.
	 * @return Le score actuel du joueur selectionné.
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
