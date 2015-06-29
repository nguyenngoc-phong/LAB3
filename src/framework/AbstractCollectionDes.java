/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionDes.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Remplissage du contrat de l'interface CollectionToIterate. Modification du Javadoc.
2015-06-26 Ajout de l'accesseur et mutateur du tableau tabDes.
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Description de la classe.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractCollectionDes implements CollectionToIterate {

	protected int nbDes;
	protected AbstractDe[] tabDes;
	
	/**
	 * Description de la mÃ©thode.
	 * @param 
	 * @return 
	 */
	public void ajouterDe(AbstractDe unDe) {
		// TODO Ã‰crire le code dans la mÃ©thode
	}
	
	/**
	 * Créer un itérateur pour le tableau de dés.
	 * @return L'itérateur nouvellement créé du tableau de dés.
	 */
	@Override
	public Iterator<Object> creerIterateur() {
		ArrayIterator iterateurDes = new ArrayIterator<AbstractDe>(tabDes);
		return iterateurDes;
	}
	
	/**
	 * Accesseur du tableau de dés.
	 * @returns Le tableau de dé.
	 */
	public AbstractDe[] getTabDes() {
		return tabDes;
	}
	
	/**
	 * Mutateur du tableau de dés.
	 * @param Le nouveau tableau de dés.
	 */
	public void setTabDes(AbstractDe[] uneTabDes) {
		tabDes = uneTabDes;
	}

}
