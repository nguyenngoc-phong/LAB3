/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: Fabrique.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Remplissage du contrat de la classe abstraite AbstractFabrique. Modification du Javadoc.
2015-06-29 Ajout du constructeur et de la méthode creerDe rédefinie avec la valeur du dé en paramètre.
*******************************************************/  

package buncoPlus;

import framework.*;

/**
 * Cette classe sert à créer des instances des classes De, Joueur et Jeu.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class Fabrique extends AbstractFabrique {
	
	/**
	 * Constructeur
	 */
	public Fabrique() {
		
	}
	
	/**
	 * Crée une instance de la classe De.
	 * @param unNbFaces : Le nombre de faces du dé.
	 * @return Une instance de la la classe De.
	 */
	@Override
	public De creerDe(int unNbFaces) {
		De unDe = new De(unNbFaces);
		return unDe;
	}

	/**
	 * Crée une instance de la classe AbstractDe.
	 * @param unNbFaces : Le nombre de faces du dé.
	 * @param uneValeur : la valeur initial  du dé.
	 * @return Une instance de la la classe AbstractDe.
	 */
	public De creerDe(int unNbFaces, int uneValeur) {
		De unDe = new De(unNbFaces, uneValeur);
		return unDe;
	};

	/**
	 * Crée une instance de la classe Joueur.
	 * @param unNom : Le nom du joueur.
	 * @param unScore : Le score initial du joueur.
	 * @return Une instance de la la classe Joueur.
	 */
	@Override
	public Joueur creerJoueur(String unNom, int unScore) {
		Joueur unJoueur = new Joueur(unNom, unScore);
		return unJoueur;
	}

	/**
	 * Crée une instance de la classe Jeu.
	 * @return Une instance de la la classe Jeu.
	 */
	@Override
	public Jeu creerJeu() {
		Jeu unJeu = new Jeu();
		return unJeu;
	}

}
