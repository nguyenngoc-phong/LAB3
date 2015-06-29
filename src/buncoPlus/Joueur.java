/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: Joueur.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-23
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Ajout du constructeur de Joueur.
*******************************************************/  

package buncoPlus;

import framework.*;

/**
 * Cette classe repr�sente un joueur.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class Joueur extends AbstractJoueur {

	/**
	 * Constructeur
	 * @param unNom : Le nom du joueur
	 * @param unScore : Le score initial du joueur
	 */
	public Joueur(String unNom, int unScore) {
		nom = unNom;
		score = unScore;
	}

}
