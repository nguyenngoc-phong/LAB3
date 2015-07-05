/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: FenetreJeu.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-07-04
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-03 Ajout des accesseurs des PanelBoutons et modification de la méthode colorCell().
2015-07-04 Ajout de la méthode rafraichir() pour rafraichir les informations affichées lors d'une nouvelle partie.
			Modification de la dimension de la fenêtre.
@author Dam-Hissey Kantchil
2015-07-01 Ajout de la classe interne PanelBoutons et du constructeur de FenetreJeu.
*******************************************************/  

package buncoplus;

import java.awt.*;

import javax.swing.*;

/**
 * Cette classe représente la fenêtre de jeu où s'affichera les dés et les scores des joueurs.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class FenetreJeu extends JComponent {
	
	private static final long serialVersionUID = 1316305658354433025L;
	public static final Dimension DIMENSION = new Dimension(350,150);
	private PanelBoutons tirage;
	private PanelBoutons joueur;
	private PanelBoutons score;
	private PanelBoutons tour;
	
	/**
	 * Constructeur
	 */
	public FenetreJeu (){
		
		tirage = new PanelBoutons ("Tirage",4,true);
		joueur = new PanelBoutons ("Joueur",6,false);
		score = new PanelBoutons ("Score",6,true);
		tour = new PanelBoutons ("Tour",2,true);
		
		joueur.colorCell(1, true);
			
		this.setLayout(new GridLayout(4, 1));
		this.add(tirage);
		this.add(joueur);
		this.add(score);
		this.add(tour);	
		
		this.setPreferredSize(DIMENSION);
	}

	/**
	 * Cette classe interne crée un JPanel contenant un tableau de cellules pour le jeu Bunco+.
	 * @author Dam-Hissey Kantchil
	 * @date 2015/07/01
	 */	
	class PanelBoutons extends JPanel {
		private JButton panel[]; 
		
		/**
		 * Constructeur
		 * @param titre : Le titre au début du tableau de JButton.
		 * @param longueur : La longueur du tableau de JButton.
		 * @param vide : Si le JButton est initialisé à 0 ou pas.
		 */
		public PanelBoutons(String titre, int longueur, boolean vide) {
			panel =  new JButton[longueur];
			panel[0] = new JButton(titre); 
			add(panel[0]);
			for(int i = 1; i < longueur; i++) {
				if(vide) {
					panel[i] = new JButton("0"); 
				}
				else {
					panel[i] = new JButton(Integer.toString(i)); 
				}
				add(panel [i]);
			}				
		}

		/**
		 * Accesseur de la valeur affichée dans l'une des cellules.
		 * @return Un entier correspondant à la valeur affichée.
		 */
		public int getCell(int num) {
			return Integer.parseInt(panel[num].getText());
		}

		/**
		 * Mutateur de la valeur affichée par l'une des cellules.
		 * @param num : L'index de la cellule dans le tableau.
		 * @param valeur : La nouvelle valeur affichée.
		 */
		public void setCell(int num, int valeur) {
			panel[num].setText(Integer.toString(valeur));
		}
		
					
		/** Modifie la couleur d'une cellule active de manière à indiquer qu'elle fait l'objet d'un traitement.
		 * @param num : L'index de la cellule dans le tableau à modifier.
		 * @param isActif : Booléen pour savoir si on change la couleur ou on la remet à la normale.
		 */
		public void colorCell(int num, boolean isActif) {
			if(isActif) {
				panel[num].setBackground(Color.cyan);
			}
			else {
				panel[num].setBackground(super.getBackground());
			}
		}
	}
	
	/** 
	 * Remet les informations affichées dans les cellules à leurs valeurs initiales (0 ou 1) lors du lancement d'une
	 * nouvelle partie.
	 */
	public void rafraichir() {
		
		for(int i = 1; i < tirage.panel.length; i++) {
			tirage.setCell(i, 0);
		}
		
		joueur.colorCell(1, true);
		joueur.colorCell(5, false);
		
		for(int j = 1; j < score.panel.length; j++) {
			score.setCell(j, 0);
		}
		
		tour.setCell(1, 1);
	}
	
	/**
	 * Accesseur du PanelBoutons tirage.
	 * @return Le panelBoutons tirage.
	 */
	public PanelBoutons getTirage() {
		return tirage;
	}
	
	/**
	 * Accesseur du PanelBoutons joueur.
	 * @return Le panelBoutons joueur.
	 */
	public PanelBoutons getJoueur() {
		return joueur;
	}
	
	/**
	 * Accesseur du PanelBoutons score.
	 * @return Le panelBoutons score.
	 */
	public PanelBoutons getScore() {
		return score;
	}
	
	/**
	 * Accesseur du PanelBoutons tour.
	 * @return Le panelBoutons tour.
	 */
	public PanelBoutons getTour() {
		return tour;
	}
}
