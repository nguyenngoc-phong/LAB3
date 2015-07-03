/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: IStrategie.java
Date créé: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-02 Ajout du param�tre nbTours de la m�thode calculerScoreTour().
2015-07-03 Changement du nom du param�tre nbTours de la m�thode calculerScoreTour() pour numTour.
*******************************************************/  

package framework;

/**
 * Cette interface contient les m�thodes o� seront contenus les algorithmes pour calculer le score d'un joueur
 * apr�s avoir lancer des d�s et pour trier les joueurs selon leurs scores d�croissants. Cette interface suit le
 * patron "Strat�gie".
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public interface IStrategie {

	/**
	 * Calcule le score du joueur courant apr�s un lancer de d�s
	 * @param tabDes : Le tableau de d�s contentant les d�s lanc�s par le joueur.
	 * @param numTour : Le num�ro du tour courant.
	 */
	public Object[] calculerScoreTour(AbstractDe[] tabDes, int numTour);

	/**
	 * Trie les joueurs selon leurs scores d�croissants.
	 * @param tabJoueurs : Le tableau des joueurs � trier.
	 */
	public AbstractJoueur[] calculerVainqueur(AbstractJoueur[] tabJoueurs);
	
}
