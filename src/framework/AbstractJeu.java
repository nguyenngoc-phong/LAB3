/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractJeu.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-23
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
*******************************************************/  

package framework;

/**
 * Description de la classe.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractJeu {

	protected int nbTours;
	
	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public void creerJeu() {
		initialiserNbTours();
		creerCollectionDes();
		creerCollectionJoueurs();
	}

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public abstract void initialiserNbTours();

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public abstract void creerCollectionDes();

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public abstract void creerCollectionJoueurs();

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public abstract Object[] calculerScoreTour();

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public abstract AbstractJoueur[] calculerVainqueur();
	
	
}
