/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: FenetrePrincipale.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-03 Ajout de l'attribut jeu et la méthode propertyChange(). Modification du constructeur de la classe.
@author Dam-Hissey Kantchil
2015-07-01 Ajout des compasantes fenetreJeu et menu et du constructeur de FenetrePrincipale.
*******************************************************/  

package buncoPlus;

import java.awt.BorderLayout;
import java.beans.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Cette classe représente la fenêtre principale de l'application.
 * @author Dam-Hissey Kantchil et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class FenetrePrincipale extends JFrame implements PropertyChangeListener {
	
	private static final long serialVersionUID = -9185075273229847740L;
	
	private Jeu jeu;
	
	private FenetreJeu fenetreJeu;
	private MenuFenetre menu;

	/**
	 * Constructeur
	 */
	public FenetrePrincipale() {
		this.setTitle("Bunco+");
		jeu = new Jeu();
		menu = new MenuFenetre(jeu);
		this.setLayout(new BorderLayout());
		this.add(menu);
		this.add(menu, BorderLayout.NORTH);
		fenetreJeu = new FenetreJeu();
		this.add(fenetreJeu, BorderLayout.CENTER); // Ajoute la fenêtre de jeu à la fenêtre principale
		this.pack(); // Ajuste la dimension de la fenêtre principale selon celle de ses composantes
		this.setVisible(true); // Rend la fenêtre principale visible.
		
		menu.addPropertyChangeListener(this);
	}

	/**
	 * Appelle les méthodes du l'objet jeu lorsque l'usager veut commencer une partie ou lancer des dés. Cette méthode est appelé lorsque la classe MenuFenetre appele
	 * "firePropertyChange".
	 * @param evt : Événement de changement d'état d'une propriété envoyé par MenuFenetre.
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("LANCEMENT_JEU")) {
			jeu.initialiserJeu();
			fenetreJeu.rafraichir();
		}
		else if(evt.getPropertyName().equals("ROULER_DES")) {
			Object[] tabScores = jeu.calculerScoreTour();
			De[] tabDes = jeu.getTabDes();
			int score = (int) jeu.getScoreJoueur(jeu.getTourJoueur());
			int tourJoueur = (int) jeu.getTourJoueur();
			int numTour = (int) jeu.getNumTour();
			
			if(numTour <= 6) {
				int i = 1;
				for(De d : tabDes) {
					fenetreJeu.getTirage().setCell(i++, d.getValeur());
				}
				
				if(tourJoueur > 1) {
					fenetreJeu.getJoueur().colorCell(tourJoueur - 1, false);
				}
				else {
					fenetreJeu.getJoueur().colorCell(5, false);
				}
				fenetreJeu.getScore().setCell(tourJoueur, score);
				
				fenetreJeu.getJoueur().colorCell(tourJoueur, true);
				fenetreJeu.getTour().setCell(1, numTour);
			}
			else {
				Joueur[] tabVainqueurs = jeu.calculerVainqueur();
				String message = "Fin de la partie. Voici les scores finaux :\n";
				
				for(Joueur j : tabVainqueurs) {
					message = message + j.getNom() + ": " + j.getScore() + " pts.\n";
				}
				
				JOptionPane.showMessageDialog(null, message, "Fin de la partie", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
}
