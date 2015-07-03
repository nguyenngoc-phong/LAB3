/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: CollectionDes.java
Date créé: 2015-06-23
Date dern. modif.: 2015-07-02
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-02 Modification du constructeur
@author Dam-Hissey Kantchil
2015-07-01 Ajout du constructeur.
*******************************************************/  

package buncoPlus;

import framework.*;

/**
 * Cette classe définit une collection de dés.
 * @author Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class CollectionDes extends AbstractCollectionDes {
	
	private Fabrique fabrique = new Fabrique();
	
	/**
	 * Constructeur
	 * @param unNbDes : Le nombre de dés dans la collection.
	 * @param unDe : Le type de dé que contient la collection.
	 */
	public CollectionDes(int unNbDes, int unNbFaces) {
		nbDes = unNbDes;
		tabDes = new De[unNbDes];
		
		for(int i = 0; i < nbDes; i++) {
			tabDes[i] = fabrique.creerDe(unNbFaces);
		}
	}
	
}
