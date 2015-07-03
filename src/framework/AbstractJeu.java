/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractJeu.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-29 Ajout des attributs collectionDes et collectionJoueurs et des méthodes setNbTours(), setTabDes() et
			setTabJoueurs(). Changement de la méthode creerJeu() pour initiliaserJeu(). 
2015-07-03 Ajout des attributs tourJoueur et numJoueur et des accesseurs de ces variables.
*******************************************************/  

package framework;

/**
 * Cette classe représente le jeu en tant que tel.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractJeu {

	protected int tourJoueur;
	protected int numTour;
	protected int nbTours;
	protected AbstractCollectionDes collectionDes;
	protected AbstractCollectionJoueurs collectionJoueurs;
	
	/**
	 * Initialise le jeu en appelant les méthodes néssaires. Elle suit le patron "méthode template".
	 */
	public void initialiserJeu() {
		initialiserTours();
		creerCollectionDes();
		creerCollectionJoueurs();
	}

	/**
	 * Initialise les attributs tourJoueur, numTour et nbTours pour pouvoir lancer le jeu. Elle suit le patron
	 * "méthode template".
	 */
	public abstract void initialiserTours();

	/**
	 * Crée la collection de dés pour pouvoir lancer le jeu. Elle suit le patron
	 * "méthode template".
	 */
	public abstract void creerCollectionDes();

	/**
	 * Crée la collection de joueur pour pouvoir lancer le jeu. Elle suit le patron
	 * "méthode template".
	 */
	public abstract void creerCollectionJoueurs();

	/**
	 * Calcule le score du tour courant pour un joueur.
	 * @return Un tableau d'objet qui contient toutes les informations nécessaires à retourner.
	 */
	public abstract Object[] calculerScoreTour();

	/**
	 * Trie le tableau de joueurs selon certains critères et retourne celui-ci.
	 * @return Le tableau de joueurs trié selon les critères.
	 */
	public abstract AbstractJoueur[] calculerVainqueur();

	/**
	 * Accesseur le tour du joueur courant. En d'autres mots, qui est le prochain à jouer.
	 * @return Le tour du joueur courant.
	 */
	public int getTourJoueur() {
		return tourJoueur;
	}
	
	/**
	 * Accesseur du numéro du tour courant.
	 * @return Le numéro du tour courant.
	 */
	public int getNumTour() {
		return numTour;
	}
	
	/**
	 * Mutateur du nombre de tours total.
	 * @param unNbTours : le nouveau nombre de tours total.
	 */
	public void setNbTours(int unNbTours) {
		nbTours = unNbTours;
	}
	
	/**
	 * Mutateur du tableau de dés de collectionDes.
	 * @param unTabDes : le nouveau tableau de dés de collectionDes.
	 */
	public void setTabDes(AbstractDe[] unTabDes) {
		collectionDes.setTabDes(unTabDes);
	}
	
	/**
	 * Mutateur du tableau de joueurs de collectionJoueurs.
	 * @param unTabDes : le nouveau tableau de joueurs de collectionJoueurs.
	 */
	public void setTabJoueurs(AbstractJoueur[] unTabJoueurs) {
		collectionJoueurs.setTabJoueurs(unTabJoueurs);
	}
	
}
