/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionDes.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-29
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification du Javadoc.
2015-06-29 Ajout du mutateur du tableau tabDes et de la méthode roulerDes().
@author Carole Fabeleu
2015-06-27 Ajout des accesseurs de nbDes et tabDes et de la méthode ajouterDe(). Remplissage du contrat de l'interface
			CollectionToIterate. 
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Cette classe représente une collection abstraite de dés. Elle gère les méthodes d'accès au tableau de dés et d'ajouter un dé
 * au tableau et de rouler les dés. Une de ses méthodes permet de créer un itérateur qui la parcoure selon le patron itérateur.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractCollectionDes implements CollectionToIterate {

	protected int nbDes;
	protected AbstractDe[] tabDes;
	
	/**
	 * Ajoute un dé au tableau de dés.
	 * @param unDe : Le dé à ajouter.
	 */
	public void ajouterDe(AbstractDe unDe) {
		AbstractDe[] tabDesTemp = new AbstractDe[nbDes + 1];
		for(int i = 0; i < nbDes; i++) {
			tabDesTemp[i] = tabDes[i];
		}
		tabDesTemp[nbDes] = unDe;
		tabDes = tabDesTemp;
		nbDes++;
	}
	
	/**
	 * Roule les dés de tabDes.
	 * @return Le tableau de dés après avoir rouler les dés.
	 */
	public AbstractDe[] roulerDes() {
		for(AbstractDe d : tabDes) {
			d.setValeur((int)( 1 + 6 * Math.random()));
		}
		return tabDes;
	}
	
	/**
	 * Créer un itérateur qui va pouvoir parcourir le tableau de dés.
	 * @return L'itérateur nouvellement créé du tableau de dés.
	 */
	@Override
	public Iterator<Object> creerIterateur() {
		ArrayIterator iterateurDes = new ArrayIterator(tabDes);
		return iterateurDes;
	}
	
	/**
	 * Accesseur du nombre de dé dans le tableau.
	 * @return Le nombre de dé dans le tableau.
	 */
	public int getNbDes() {
		return nbDes;
	}
	
	/**
	 * Accesseur du tableau de dés.
	 * @return Le tableau de dé.
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
