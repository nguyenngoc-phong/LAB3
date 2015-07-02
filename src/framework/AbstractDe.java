/******************************************************
Cours: LOG121
Session: E2015
Groupe: 01
Projet: Laboratoire #3
�tudiant(e)s: Carole Fabeleu, Dam-Hissey Kantchil et Ngoc-Phong Nguyen
              
              
Professeur: Francis Cardinal
Nom du fichier: AbstractDe.java
Date cr��: 2015-06-23
Date dern. modif.: 2015-06-29
*******************************************************
Historique des modifications
*******************************************************
@author Ngoc-Phong Nguyen
2015-06-23 Version initiale
2015-06-29 Ajout du mutateur de valeur.
@author Carole Fabeleu
2015-06-27 Ajout de l'attribut valeur, de la m�thode compareTo() et des accesseurs de nbFaces et valeur.
*******************************************************/  

package framework;

/**
 * Cette classe abstraite repr�sente un d�.
 * @author Carole Fabeleu et Ngoc-Phong Nguyen
 * @date 2015/06/23
 */
public abstract class AbstractDe implements Comparable<AbstractDe> {
	
	protected int nbFaces;
	protected int valeur;
	
	/**
	 * Compare les valeur de face de deux objets de la classe AbstractDe entre elles.
	 * @param unDe : Le d� avec lequel on d�sire comparer les valeurs.
	 * @return -1 si la valeur du d� actuel est plus petite que celle du d� entr� en param�tre, 1 si celle-ci est sup�rieure
	 * 			� la valeur du deuxi�me d� et 0 si les deux valeurs sont �gales.
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
	 * Accesseur du nombre de faces du d�.
	 * @return Le nombre de faces du d�.
	 */
	public int getNbFaces() {
		return nbFaces;
	}
	
	/**
	 * Accesseur de la valeur du d�. En d'autres mots la valeur num�rique de la face sup�rieure du d�.
	 * @return La valeur du d�.
	 */
	public int getValeur() {
		return valeur;
	}
	
	/**
	 * Mutateur de la valeur du d�. En d'autres mots la valeur num�rique de la face sup�rieure du d�.
	 * @param uneValeur : La nouvelle valeur du d�.
	 */
	public void setValeur(int uneValeur) {
		valeur = uneValeur;
	}
}
