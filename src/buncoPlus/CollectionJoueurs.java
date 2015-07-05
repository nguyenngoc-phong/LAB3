/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: CollectionJoueurs.java
Date créé: 2015-06-23
Date dern. modif.: 2015-07-02
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-02 Modification du constructeur.
@author Dam-Hissey Kantchil
2015-07-01 Ajout du constructeur.
*******************************************************/  

package buncoplus;

import framework.*;

/**
 * Cette classe définit une collection de joueurs.
 * @author Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class CollectionJoueurs extends AbstractCollectionJoueurs {
	
	private Fabrique fabrique = new Fabrique();
	
	/**
	 * Constructeur
	 * @param unNbJoueurs : Le nombre de joueurs.
	 * @param uneTabNomsJoueurs : Un tableau des noms des joueurs.
	 */
	public CollectionJoueurs(int unNbJoueurs, String[] uneTabNoms) {
		nbJoueurs = unNbJoueurs;
		tabJoueurs = new Joueur[nbJoueurs];
		
		for(int i = 0; i < nbJoueurs; i++) {
			tabJoueurs[i] = fabrique.creerJoueur(uneTabNoms[i], 0);
		}
	}
	
}
