/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Ã‰tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: MenuFenetre.java
Date crÃ©Ã©: 2015-06-23
Date dern. modif.: 2015-07-03
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-07-03 Ajout de l'observateur et des appels aux méthodes de l'objet jeu.
@author Dam-Hissey Kantchil
2015-07-01 Ajout des différents menus (Constructeur + Méthodes addMenuJeu() et addMenuDes()).
*******************************************************/  

package buncoPlus;

import java.awt.event.*;
import java.beans.PropertyChangeListener;

import javax.swing.*;

/**
 * Cette classe représente le menu de l'application.
 * @author Dam-Hissey Kantchil et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class MenuFenetre extends JMenuBar {
	
	private static final long serialVersionUID = -5660624876069672786L;
	private PropertyChangeListener listener = null;
	
	/**
	 * Constructeur
	 * @param jeu : L'objet jeu de l'application.
	 */
	public MenuFenetre(Jeu jeu) {
		addMenuJeu();
		addMenuDes();
	}
	
	/**
	 * Ajoute le menu Jeu pour commencer une partie ou quitter l'application.
	 */
	private void addMenuJeu() {
		JMenu menu = new JMenu("Jeu");
		menu.add(new JMenuItem("Commencer un nouvelle partie"));
		menu.add(new JMenuItem("Quitter"));
		menu.getItem(0).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firePropertyChange("LANCEMENT_JEU", null, null);
			}
		});
		menu.getItem(1).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		add(menu);
	}
	
	/**
	 * Ajoute le menu Dés pour lancer des dés.
	 */
	private void addMenuDes() {
		JMenu menu = new JMenu("Dés");
		menu.add(new JMenuItem("Lancer les dés"));
		menu.getItem(0).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firePropertyChange("ROULER_DES", null, null);
			}
		});
		menu.getItem(0).setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		add(menu);
	}
	
	/**
	 * Mutateur de l'observateur listener.
	 * @param listener : Le nouvel observateur.
	 */
	public void setPropertyChangeListener(PropertyChangeListener listener) {
		this.listener = listener;
	}

}
