/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionDes.java
Date créé: 2015-06-23
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
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public void ajouterDe(AbstractDe unDe) {
		// TODO Écrire le code dans la méthode
	}
	
	/**
	 * Cr�er un it�rateur pour le tableau de d�s.
	 * @return L'it�rateur nouvellement cr�� du tableau de d�s.
	 */
	@Override
	public Iterator<Object> creerIterateur() {
		ArrayIterator iterateurDes = new ArrayIterator<AbstractDe>(tabDes);
		return iterateurDes;
	}
	
	/**
	 * Accesseur du tableau de d�s.
	 * @returns Le tableau de d�.
	 */
	public AbstractDe[] getTabDes() {
		return tabDes;
	}
	
	/**
	 * Mutateur du tableau de d�s.
	 * @param Le nouveau tableau de d�s.
	 */
	public void setTabDes(AbstractDe[] uneTabDes) {
		tabDes = uneTabDes;
	}

}
