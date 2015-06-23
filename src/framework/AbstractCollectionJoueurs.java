/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionJoueurs.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-23
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Description de la classe.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractCollectionJoueurs implements CollectionToIterate {

	protected int nbJoueurs;
	protected AbstractJoueur[] tabJoueurs;
	
	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public void ajouterJoueur(AbstractJoueur unJoueur) {
		// TODO Écrire le code dans la méthode
	}
	
	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	@Override
	public Iterator<Object> creerIterator() {
		// TODO Écrire le code dans la méthode
		return null;
	}

}
