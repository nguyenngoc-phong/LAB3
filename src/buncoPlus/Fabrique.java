/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: Fabrique.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-26
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Remplissage du contrat de la classe abstraite AbstractFabrique. Modification du Javadoc.
2015-06-29 Ajout du constructeur et de la m�thode creerDe r�definie avec la valeur du d� en param�tre.
*******************************************************/  

package buncoplus;

import framework.*;

/**
 * Cette classe sert � cr�er des instances des classes De, Joueur et Jeu.
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
	 * Cr�e une instance de la classe De.
	 * @param unNbFaces : Le nombre de faces du d�.
	 * @return Une instance de la la classe De.
	 */
	@Override
	public DeConcret creerDe(int unNbFaces) {
		DeConcret unDe = new DeConcret(unNbFaces);
		return unDe;
	}

	/**
	 * Cr�e une instance de la classe AbstractDe.
	 * @param unNbFaces : Le nombre de faces du d�.
	 * @param uneValeur : la valeur initial  du d�.
	 * @return Une instance de la la classe AbstractDe.
	 */
	public DeConcret creerDe(int unNbFaces, int uneValeur) {
		DeConcret unDe = new DeConcret(unNbFaces, uneValeur);
		return unDe;
	};

	/**
	 * Cr�e une instance de la classe Joueur.
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
	 * Cr�e une instance de la classe Jeu.
	 * @return Une instance de la la classe Jeu.
	 */
	@Override
	public JeuBunco creerJeu() {
		JeuBunco unJeu = new JeuBunco();
		return unJeu;
	}

}
