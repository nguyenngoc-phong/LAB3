/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
�tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: ApplicationBuncoPlus.java
Date cr��: 2015-06-23
Date dern. modif.: 2015-07-01
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
@author Dam-Hissey Kantchil
2015-07-01 Ajout de m�thode main() et du constructeur d'ApplicationBuncoPlus.
*******************************************************/  

package buncoPlus;

/**
 * Cette classe permet de lancer l'application Bunco+ dans son ensemble.
 * @author Dam-Hissey Kantchil et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public class ApplicationBuncoPlus {

	/**
	 * La m�thode main() de l'application.
	 * @param args : Tableau des arguments de main()
	 */
	public static void main(String[] args) {
		ApplicationBuncoPlus application = new ApplicationBuncoPlus();
	}
	
	/**
	 * Constructeur
	 */
	public ApplicationBuncoPlus() {
		FenetrePrincipale fenetre = new FenetrePrincipale();
	}
	
}
