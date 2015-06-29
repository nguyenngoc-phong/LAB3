/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionJoueurs.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Remplissage du contrat de l'interface CollectionToIterate. Modification du Javadoc.
2015-06-26 Ajout de l'accesseur et mutateur du tableau tabJoueurs.
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
	 * Description de la mÃ©thode.
	 * @param 
	 * @return 
	 */
	public void ajouterJoueur(AbstractJoueur unJoueur) {
		// TODO Ã‰crire le code dans la mÃ©thode
	}
	
	/**
	 * Créer un itérateur pour le tableau de joueurs.
	 * @return L'itérateur nouvellement créé du tableau de joueurs.
	 */
	@Override
	public Iterator<Object> creerIterateur() {
		ArrayIterator iterateurJoueurs = new ArrayIterator<AbstractJoueur>(tabJoueurs);
		return iterateurJoueurs;
	}

	/**
	 * Accesseur du tableau de joueurs.
	 * @returns Le tableau de joueurs.
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
