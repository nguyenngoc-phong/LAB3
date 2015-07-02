/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
�tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractJoueur.java
Date cr��: 2015-06-23
Date dern. modif.: 2015-06-29
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-29 Ajout du mutateur de score.
@author Carole Fabeleu
2015-06-27 Ajout de la m�thode compareTo() et des accesseurs de nom et score.
*******************************************************/  

package framework;

/**
 * Cette classe abstraite repr�sente un joueur.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractJoueur implements Comparable<AbstractJoueur> {
	
	protected String nom;
	protected int score;

	/**
	 * Compare les scores de deux objets de la classe AbstractJoueur entre eux.
	 * @param unJoueur : Le joueur avec lequel on d�sire comparer les scores.
	 * @return -1 si le score du joueur actuel est plus petit que celui du joueur entr� en param�tre, 1 si celui-ci est sup�rieur
	 * 			au score du deuxi�me joueur et 0 si les deux scores sont �gaux.
	 */
	@Override
	public int compareTo(AbstractJoueur unJoueur) {		
		if(score < unJoueur.score) {
			return -1;
		}
		else if(score > unJoueur.score) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Accesseur du nom du joueur.
	 * @return Le nom du joueur.
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Accesseur du score du joueur.
	 * @return Le score du joueur.
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Mutateur du score du joueur.
	 * @param unScore : Le nouveau score du joueur.
	 */
	public void setScore(int unScore) {
		score = unScore;
	}
	
}
