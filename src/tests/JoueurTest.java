/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: JoueurTest.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-07-05
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-05 Optimisation de méthodes et ajout de l'attribut fabrique.
@author Ngoc-Phong Nguyen
2015-07-04 Ajout des attributs joueur1 et joueur2, de la méthode faireAvant() et des tests unitaires.
*******************************************************/  

package tests;

import buncoplus.*;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Classe de tests unitaires pour la classe Joueur du paquet buncoPlus.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class JoueurTest {

	private Fabrique fabrique;
	private Joueur joueur1;
	private Joueur joueur2;
	
	/**
	 * Initialisation des attributs à faire avant de commencer les test unitaires.
	 */
	@Before
	public void faireAvant() {
		fabrique = new Fabrique();
		
		joueur1 = fabrique.creerJoueur("Joueur 1", 21);
		joueur2 = fabrique.creerJoueur("Joueur 2", 0);
				
	}

	/**
	 * Test de la méthode compareTo() lorsque que le score du joueur entré en paramètre est plus petite que celle du
	 * joueur courant.
	 * Vérifie si la méthode retourne bien -1 comme valeur.
	 */
	@Test
	public void scoreSuperieurTest() {
		assertTrue(joueur1.compareTo(joueur2) == 1);
	}
	
	/**
	 * Test de la méthode compareTo() lorsque que le score du joueur entré en paramètre est plus grande que celle du
	 * joueur courant.
	 * Vérifie si la méthode retourne bien 1 comme valeur.
	 */
	@Test
	public void scoreInferieurTest() {
		assertTrue(joueur2.compareTo(joueur1) == -1);	
	}
	
	/**
	 * Test de la méthode compareTo() lorsque que le score du joueur entré en paramètre est égale à celle du joueur
	 * courant.
	 * Vérifie si la méthode retourne bien 0 comme valeur.
	 */
	@Test
	public void memeScore() {
		joueur2.setScore(21);
		assertTrue(joueur1.compareTo(joueur2) == 0);
	}
	
	/**
	 * Test de la méthode compareTo() lorsque que le joueur entré en paramètre est nulle.
	 * Vérifie si la méthode attrape bien l'exception.
	 */
	@Test(expected = NullPointerException.class)
	public void deNullTest() {
		joueur1.compareTo(null);
	}

}
