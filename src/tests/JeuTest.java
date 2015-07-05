/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: JeuTest.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-06-23
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-26 Ajout des attributs et des méthodes faireAvant() et testScoreBunco().
2015-06-29 Modification de la classe pour qu'elle utilise JUnit 4 à la place de JUnit 3. Correction de la méthode
			testScoreBunco(). Ajout des méthodes testScoreTriple(), testScoreDeux(), testScoreUn, testScoreZero(),
			calculerScoreTour() et calculerVainqueur(). Modification du Javadoc.
*******************************************************/  

package tests;

import buncoplus.*;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Classe de tests unitaires pour la classe Jeu du paquet buncoPlus.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class JeuTest {
	
	private Fabrique fabrique;
	private JeuBunco jeu;
	private DeConcret de1, de5, de6;
	private Joueur joueur1, joueur2, joueur3, joueur4, joueur5;
	
	/**
	 * Initialisation des attributs à faire avant de commencer les test unitaires.
	 */
	@Before
	public void faireAvant() {
		fabrique = new Fabrique();
		
		jeu = fabrique.creerJeu();
		jeu.initialiserJeu();
		
		de1 = fabrique.creerDe(6, 1);
		de5 = fabrique.creerDe(6, 5);
		de6 = fabrique.creerDe(6, 6);
		
		joueur1 = fabrique.creerJoueur("Joueur 1", 1);
		joueur2 = fabrique.creerJoueur("Joueur 2", 5);
		joueur3 = fabrique.creerJoueur("Joueur 3", 0);
		joueur4 = fabrique.creerJoueur("Joueur 4", 2);
		joueur5 = fabrique.creerJoueur("Joueur 5", 21);
	}

	/**
	 * Test de la méthode calculerScoreTour() lorsque qu'on a un Bunco lors du lancer de dés.
	 * Vérifie si le jeu assigne bien 21 points au joueur et passe les dés au suivant.
	 */
	@Test
	public void scoreBuncoTest() {
		DeConcret[] unTabDes = {de1, de1, de1};
		jeu.setTabDes(unTabDes);
		jeu.setNbTours(1);
		Object[] tabScores = jeu.calculerScoreTour();
		Object[] tabValidation = {21, true};
		assertArrayEquals(tabScores, tabValidation);
	}
	
	/**
	 * Test de la méthode calculerScoreTour() lorsque qu'on a un triple qui n'est pas égal au tour actuel lors du lancer de dés.
	 * Vérifie si le jeu assigne bien 5 points au joueur et ne passe pas les dés au suivant.
	 */
	@Test
	public void scoreTripletest() {
		DeConcret[] unTabDes = {de6, de6, de6};
		jeu.setTabDes(unTabDes);
		jeu.setNbTours(1);
		Object[] tabScores = jeu.calculerScoreTour();
		Object[] tabValidation = {5, false};
		assertArrayEquals(tabScores, tabValidation);
	}
	
	/**
	 * Test de la méthode calculerScoreTour() lorsque qu'on a deux dés qui est égal au tour actuel lors du lancer de dés.
	 * Vérifie si le jeu assigne bien 2 points au joueur et ne passe pas les dés au suivant.
	 */
	@Test
	public void scoreDeuxTest() {
		DeConcret[] unTabDes = {de1, de1, de6};
		jeu.setTabDes(unTabDes);
		jeu.setNbTours(1);
		Object[] tabScores = jeu.calculerScoreTour();
		Object[] tabValidation = {2, false};
		assertArrayEquals(tabScores, tabValidation);
	}
	
	/**
	 * Test de la méthode calculerScoreTour() lorsque qu'on a un dé qui est égal au tour actuel lors du lancer de dés.
	 * Vérifie si le jeu assigne bien 1 points au joueur et ne passe pas les dés au suivant.
	 */
	@Test
	public void scoreUnTest() {
		DeConcret[] unTabDes = {de1, de6, de6};
		jeu.setTabDes(unTabDes);
		jeu.setNbTours(1);
		Object[] tabScores = jeu.calculerScoreTour();
		Object[] tabValidation = {1, false};
		assertArrayEquals(tabScores, tabValidation);
	}
	
	/**
	 * Test de la méthode calculerScoreTour() lorsque qu'on a aucun dé qui est égal au tour actuel lors du lancer de dés
	 * et qui n'est pas un triple. Vérifie si le jeu assigne bien aucun point au joueur et passe les dés au suivant.
	 */
	@Test
	public void scoreZeroTest() {
		DeConcret[] unTabDes = {de5, de6, de6};
		jeu.setTabDes(unTabDes);
		jeu.setNbTours(1);
		Object[] tabScores = jeu.calculerScoreTour();
		Object[] tabValidation = {0, true};
		assertArrayEquals(tabScores, tabValidation);
	}
	
	/**
	 * Test de la méthode calculerVainqueurs().
	 * Vérifie si le jeu trie bien les joueurs selon leur score en ordre décroissant et retourne un tableau de ces joueurs trié.
	 */
	@Test
	public void calculerVainqueurTest() {
		Joueur[] unTabJoueurs = {joueur1, joueur2, joueur3, joueur4, joueur5};
		jeu.setTabJoueurs(unTabJoueurs);
		Object[] tabVainqueurs = jeu.calculerVainqueur();
		Object[] tabValidation = {joueur5, joueur2, joueur4, joueur1, joueur3};
		assertArrayEquals(tabVainqueurs, tabValidation);
	}
}
