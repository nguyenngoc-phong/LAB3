/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractFabrique.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification du Javadoc.
2015-06-29 Ajout de la méthode creerDe() redéfinie avec la valeur du dé en paramètre.
*******************************************************/  

package framework;

/**
 * Cette classe abstraite sert à créer des instances des classes AbstractDe, AbstractJoueur et AbstractJeu.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractFabrique {

	/**
	 * Crée une instance de la classe AbstractDe.
	 * @param unNbFaces : Le nombre de faces du dé.
	 * @return Une instance de la la classe AbstractDe.
	 */
	protected abstract AbstractDe creerDe(int unNbFaces);

	/**
	 * Crée une instance de la classe AbstractDe.
	 * @param unNbFaces : Le nombre de faces du dé.
	 * @param uneValeur : la valeur initial  du dé.
	 * @return Une instance de la la classe AbstractDe.
	 */
	protected abstract AbstractDe creerDe(int unNbFaces, int uneValeur);

	/**
	 * Crée une instance de la classe AbstractJoueur.
	 * @param unNom : Le nom du joueur.
	 * @param unScore : Le score initial du joueur.
	 * @return Une instance de la la classe AbstractJoueur.
	 */
	protected abstract AbstractJoueur creerJoueur(String unNom, int unScore);

	/**
	 * Crée une instance de la classe AbstractJeu.
	 * @return Une instance de la la classe AbstractJeu.
	 */
	protected abstract AbstractJeu creerJeu();
	
}
