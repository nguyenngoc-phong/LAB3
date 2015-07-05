/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: DeTest.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-07-05
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-05 Optimisation de méthodes et ajout de l'attribut fabrique.
@author Ngoc-Phong Nguyen
2015-07-04 Ajout des attributs de1 et de2, de la méthode faireAvant() et des tests unitaires.
*******************************************************/  

package tests;

import buncoplus.*;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Classe de tests unitaires pour la classe De du paquet buncoPlus.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class DeTest {

	private Fabrique fabrique;
	private DeConcret de1;
	private DeConcret de6;

	/**
	 * Initialisation des attributs à faire avant de commencer les test unitaires.
	 */
	@Before
	public void faireAvant() {
		fabrique = new Fabrique();
		
		de1 = fabrique.creerDe(6, 1);
		de6 = fabrique.creerDe(6, 6);
	}
	
	/**
	 * Test de la méthode compareTo() lorsque que la valeur du dé entré en paramètre est plus petite que celle du dé
	 * courant.
	 * Vérifie si la méthode retourne bien -1 comme valeur.
	 */
	@Test
	public void deSuperieurTest() {
		assertTrue(de6.compareTo(de1) == 1);
	}
	
	/**
	 * Test de la méthode compareTo() lorsque que la valeur du dé entré en paramètre est plus grande que celle du dé
	 * courant.
	 * Vérifie si la méthode retourne bien 1 comme valeur.
	 */
	@Test
	public void deInferieurTest() {
		assertTrue(de1.compareTo(de6) == -1);
	}
	
	/**
	 * Test de la méthode compareTo() lorsque que la valeur du dé entré en paramètre est égale à celle du dé courant.
	 * Vérifie si la méthode retourne bien 0 comme valeur.
	 */
	@Test
	public void memeDeTest() {
		de1.setValeur(6);
		assertTrue(de1.compareTo(de6) == 0);
	}
	
	/**
	 * Test de la méthode compareTo() lorsque que le dé entré en paramètre est nulle.
	 * Vérifie si la méthode attrape bien l'exception.
	 */
	@Test(expected = NullPointerException.class)
	public void deNullTest() {
		de1.compareTo(null);
	}

}
