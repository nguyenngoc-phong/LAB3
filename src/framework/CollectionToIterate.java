/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: CollectionToIterate.java
Date créé: 2015-06-23
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
 * Cette interface permet � une collection de se cr�er un it�rateur.
 * Cette interface suit le patron it�rateur.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public interface CollectionToIterate {

	/**
	 * Cr�er un it�rateur pour la collection.
	 * @return L'it�rateur nouvellement cr�� de la collection.
	 */
	public Iterator<Object> creerIterateur();
	
}
