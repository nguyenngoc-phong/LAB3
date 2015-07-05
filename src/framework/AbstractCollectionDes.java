/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
�tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractCollectionDes.java
Date cr��: 2015-06-23
Date dern. modif.: 2015-06-29
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification du Javadoc.
2015-06-29 Ajout du mutateur du tableau tabDes et de la m�thode roulerDes().
@author Carole Fabeleu
2015-06-27 Ajout des accesseurs de nbDes et tabDes et de la m�thode ajouterDe(). Remplissage du contrat de l'interface
			CollectionToIterate. 
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Cette classe repr�sente une collection abstraite de d�s. Elle g�re les m�thodes d'acc�s au tableau de d�s et d'ajouter un d�
 * au tableau et de rouler les d�s. Une de ses m�thodes permet de cr�er un it�rateur qui la parcoure selon le patron it�rateur.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractCollectionDes implements CollectionToIterate {

	protected int nbDes;
	protected AbstractDe[] tabDes;
	
	/**
	 * Ajoute un d� au tableau de d�s.
	 * @param unDe : Le d� � ajouter.
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
	 * Roule les d�s de tabDes.
	 * @return Le tableau de d�s apr�s avoir rouler les d�s.
	 */
	public AbstractDe[] roulerDes() {
		for(AbstractDe d : tabDes) {
			d.setValeur((int)( 1 + 6 * Math.random()));
		}
		return tabDes;
	}
	
	/**
	 * Cr�er un it�rateur qui va pouvoir parcourir le tableau de d�s.
	 * @return L'it�rateur nouvellement cr�� du tableau de d�s.
	 */
	@Override
	public Iterator<Object> creerIterateur() {
		ArrayIterator iterateurDes = new ArrayIterator(tabDes);
		return iterateurDes;
	}
	
	/**
	 * Accesseur du nombre de d� dans le tableau.
	 * @return Le nombre de d� dans le tableau.
	 */
	public int getNbDes() {
		return nbDes;
	}
	
	/**
	 * Accesseur du tableau de d�s.
	 * @return Le tableau de d�.
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
