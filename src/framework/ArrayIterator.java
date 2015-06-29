/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: ArrayIterator.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Ajout des attributs et du constructeur. Remplissage du contrat de l'interface Iterator. Modification du Javadoc.
2015-06-29 Correction de la méthode hasNext().
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Cette classe représente l'itérateur qui parcoure à travers des tableaux d'objets.
 * Cette méthode suit le patron itérateur.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class ArrayIterator<Object> implements Iterator<Object> {

	private Object[] items;
	private int position = 0;
	
	/**
	 * Constructeur
	 * @param items : Le tableau d'objets pour lequel on veut créer un itérateur
	 */
	public ArrayIterator(Object[] desItems) {
		items = desItems;
	}
	
	/**
	 * Retourne l'existence d'un objet dans le tableau après l'itérateur.
	 * @return True s'il existe un objet après l'itérateur, autrement False.
	 */
	@Override
	public boolean hasNext() {
		if(position < items.length && items[position + 1] != null) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Retourne l'objet dans le tableau après l'itérateur.
	 * @return L'objet après l'itérateur.
	 */
	@Override
	public Object next() {
		position++;
		return items[position];
	}

	/**
	 * Supprime l'objet sur lequel se trouve l'itérateur. 
	 */
	@Override
	public void remove() {
		items[position] = null;
	}

}
