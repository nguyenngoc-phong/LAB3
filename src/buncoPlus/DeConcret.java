/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: De.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-23
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Ajout du constructeur de De.
2015-06-29 Ajout de la redéfinition du constructeur de De avec la valeur du dé en plus comme paramètre.
*******************************************************/  

package buncoplus;

import framework.*;

/**
 * Cette classe représente un dé.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class DeConcret extends AbstractDe {

	/**
	 * Constructeur
	 * @param unNbFaces : Le nombre de faces du dé.
	 */
	public DeConcret(int unNbFaces) {
		nbFaces = unNbFaces;
		valeur = 1;
	}


	/**
	 * Constructeur
	 * @param unNbFaces : Le nombre de faces du dé.
	 * @param uneValeur : La valeur initiale du dé.
	 */
	public DeConcret(int unNbFaces, int uneValeur) {
		nbFaces = unNbFaces;
		valeur = uneValeur;
	}
	
}
