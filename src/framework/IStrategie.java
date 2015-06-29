/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: IStrategie.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-23
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
*******************************************************/  

package framework;

/**
 * Description de la classe.
 * @author Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public interface IStrategie {

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public Object[] calculerScoreTour(AbstractDe[] tabDes);

	/**
	 * Description de la méthode.
	 * @param 
	 * @return 
	 */
	public AbstractJoueur[] calculerVainqueur(AbstractJoueur[] tabJoueurs);
	
}
