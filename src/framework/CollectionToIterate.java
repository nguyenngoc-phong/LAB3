/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: CollectionToIterate.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Modification du Javadoc.
*******************************************************/  

package framework;

import java.util.Iterator;

/**
 * Cette interface permet à une collection de se créer un itérateur.
 * Cette interface suit le patron itérateur.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public interface CollectionToIterate {

	/**
	 * Créer un itérateur pour la collection.
	 * @return L'itérateur nouvellement créé de la collection.
	 */
	public Iterator<Object> creerIterateur();
	
}
