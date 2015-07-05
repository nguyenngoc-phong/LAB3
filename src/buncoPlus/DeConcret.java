/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
�tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: De.java
Date cr��: 2015-06-23
Date dern. modif.: 2015-06-23
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Ajout du constructeur de De.
2015-06-29 Ajout de la red�finition du constructeur de De avec la valeur du d� en plus comme param�tre.
*******************************************************/  

package buncoplus;

import framework.*;

/**
 * Cette classe repr�sente un d�.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class DeConcret extends AbstractDe {

	/**
	 * Constructeur
	 * @param unNbFaces : Le nombre de faces du d�.
	 */
	public DeConcret(int unNbFaces) {
		nbFaces = unNbFaces;
		valeur = 1;
	}


	/**
	 * Constructeur
	 * @param unNbFaces : Le nombre de faces du d�.
	 * @param uneValeur : La valeur initiale du d�.
	 */
	public DeConcret(int unNbFaces, int uneValeur) {
		nbFaces = unNbFaces;
		valeur = uneValeur;
	}
	
}
