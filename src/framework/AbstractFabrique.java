/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractFabrique.java
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
public abstract class AbstractFabrique {

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	protected abstract AbstractDe creerDe(int unNbFaces);

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	protected abstract AbstractJoueur creerJoueur(String unNom, int unScore);

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	protected abstract AbstractJeu creerJeu();
	
}
