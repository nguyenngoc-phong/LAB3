/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
Étudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractDe.java
Date créé: 2015-06-23
Date dern. modif.: 2015-06-29
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-29 Ajout du mutateur de valeur.
@author Carole Fabeleu
2015-06-27 Ajout de l'attribut valeur, de la méthode compareTo() et des accesseurs de nbFaces et valeur.
*******************************************************/  

package framework;

/**
 * Cette classe abstraite représente un dé.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractDe implements Comparable<AbstractDe> {
	
	protected int nbFaces;
	protected int valeur;
	
	/**
	 * Compare les valeur de face de deux objets de la classe AbstractDe entre elles.
	 * @param unDe : Le dé avec lequel on désire comparer les valeurs.
	 * @return -1 si la valeur du dé actuel est plus petite que celle du dé entré en paramètre, 1 si celle-ci est supérieure
	 * 			à la valeur du deuxième dé et 0 si les deux valeurs sont égales.
	 */
	public int compareTo(AbstractDe unDe) {
		if(valeur < unDe.valeur) {
			return -1;
		}
		else if(valeur > unDe.valeur) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Accesseur du nombre de faces du dé.
	 * @return Le nombre de faces du dé.
	 */
	public int getNbFaces() {
		return nbFaces;
	}
	
	/**
	 * Accesseur de la valeur du dé. En d'autres mots la valeur numérique de la face supérieure du dé.
	 * @return La valeur du dé.
	 */
	public int getValeur() {
		return valeur;
	}
	
	/**
	 * Mutateur de la valeur du dé. En d'autres mots la valeur numérique de la face supérieure du dé.
	 * @param uneValeur : La nouvelle valeur du dé.
	 */
	public void setValeur(int uneValeur) {
		valeur = uneValeur;
	}
}
