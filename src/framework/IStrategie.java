/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: IStrategie.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-02 Ajout du paramètre nbTours de la méthode calculerScoreTour().
2015-07-03 Changement du nom du paramètre nbTours de la méthode calculerScoreTour() pour numTour.
*******************************************************/  

package framework;

/**
 * Cette interface contient les méthodes où seront contenus les algorithmes pour calculer le score d'un joueur
 * après avoir lancer des dés et pour trier les joueurs selon leurs scores décroissants. Cette interface suit le
 * patron "Stratégie".
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public interface IStrategie {

	/**
	 * Calcule le score du joueur courant après un lancer de dés
	 * @param tabDes : Le tableau de dés contentant les dés lancés par le joueur.
	 * @param numTour : Le numéro du tour courant.
	 */
	public Object[] calculerScoreTour(AbstractDe[] tabDes, int numTour);

	/**
	 * Trie les joueurs selon leurs scores décroissants.
	 * @param tabJoueurs : Le tableau des joueurs à trier.
	 */
	public AbstractJoueur[] calculerVainqueur(AbstractJoueur[] tabJoueurs);
	
}
