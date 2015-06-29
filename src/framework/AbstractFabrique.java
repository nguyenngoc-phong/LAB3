/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractFabrique.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification du Javadoc.
2015-06-29 Ajout de la m�thode creerDe() red�finie avec la valeur du d� en param�tre.
*******************************************************/  

package framework;

/**
 * Cette classe abstraite sert � cr�er des instances des classes AbstractDe, AbstractJoueur et AbstractJeu.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractFabrique {

	/**
	 * Cr�e une instance de la classe AbstractDe.
	 * @param unNbFaces : Le nombre de faces du d�.
	 * @return Une instance de la la classe AbstractDe.
	 */
	protected abstract AbstractDe creerDe(int unNbFaces);

	/**
	 * Cr�e une instance de la classe AbstractDe.
	 * @param unNbFaces : Le nombre de faces du d�.
	 * @param uneValeur : la valeur initial  du d�.
	 * @return Une instance de la la classe AbstractDe.
	 */
	protected abstract AbstractDe creerDe(int unNbFaces, int uneValeur);

	/**
	 * Cr�e une instance de la classe AbstractJoueur.
	 * @param unNom : Le nom du joueur.
	 * @param unScore : Le score initial du joueur.
	 * @return Une instance de la la classe AbstractJoueur.
	 */
	protected abstract AbstractJoueur creerJoueur(String unNom, int unScore);

	/**
	 * Cr�e une instance de la classe AbstractJeu.
	 * @return Une instance de la la classe AbstractJeu.
	 */
	protected abstract AbstractJeu creerJeu();
	
}
