# MISES À JOUR :
- 2015-06-23
  - Ajout du squelette du projet. Certaines modification ont été apportées au niveau des classes par rapport au                   diagramme de classes initial.
    - Paquets Framework et BungoPlus :
      - Modification des paramètres de type De et Joueur par AbstractDe et AbstractJoueur respectivement. Comme les classes De et Joueur héritent de ces classes et que les méthodes où se trouvent ces paramètres sont soit dans le Framework ou dans des classes qui héritent de celles du Framework, ce fut plus judicieux de les changer ainsi.
      - Suppression des méthodes compareTo(T o) de AbstractDe et AbstractJoueur puisque qu'on peut directement implémenter la méthode compareTo() avec le bon type d'objet en paramètre. Donc, pas besoin de surcharger deux fois la méthode. Aussi, suppression des méthodes compareTo() dans AbstractDe et AbstractJoueur puisqu'elles vont être seulement implémenté dans les versions concrètes des classes dans le jeu Bunco+ et non dans le framework directement.
      - Ajout de la méthode creerJeu() dans AbstractJeu ainsi que des méthodes initialiserNbTours(), creerCollectionDes() et creerCollectionJoueurs() dans AbstractJeu et Jeu. Ces méthodes servent à initialiser les attributs d'une nouvelle instance de Jeu qui respecte le patron de conception Méthode Template.
    - Paquet Framework :
      - Modification de l'interface Fabrique à la classe abstraite AbstractFabrique. Le fait que la classe créatrice soit une classe abstraite au lieu d'une interface ne change en rien l'implémentation de celle-ci. Aussi, c'est fait de cette façon dans les exemples du patron Méthode Fabrique.
      - Changement des paramètres des méthodes creerJoueur() et creerJeu() de AbstractFabrique pour initialiser les scores des joueurs. Aussi, comme l'initialisation des attributs du jeu est déjà fait dans la classe Jeu elle-même, il n'est pas nécéssaire de le faire lors de l'appel du constructeur de celle-ci.
    - Paquet BungoPlus :
      - Correction d'une erreur dans la méthode calculerScoreTour() dans Strategie qui est supposée retourner un tableau d'objets pour les valeurs des points plutôt qu'un tableau de joueurs.
      - Ajout des classes FenetrePrincipale, MenuFenetre et FenetreJeu dans le paquet du jeu Bunco+ pour représenter l'interface utilisateur. Inspirer-vous des fenêtres des laboratoires 1 et 2 pour le code. Aussi, la classe ApplicationBuncoPlus a été ajouté pour pouvoir lancer l'application.
      - Suppression de la méthode creerIterateur() de CollectionDes et CollectionJoueurs puisque qu'on peut directement implémenter la méthode dans les classes abstraites AbstractCollectionDes et AbstractCollectionJoueurs.
      - Suppression des attributs dans les classes du pacquet de Bungo+ puisque ces attributs sont déjà dans les classes abstraites du Framework.
    - Paquet Tests :
      - Suppression de la fenêtre FenetreTests dans le paquet Tests pour les tests unitaires. Eclipse offre déjà l'option de faire les tests unitaires dans l'IDE, faire une fenêtre pour ça serait simplement redondant.

# LAB3 : Laboratoire 3 du cours de LOG121

Message pour Carole et Richard :

C'est ici que nous allons sauvegarder le code pour le laboratoire 3 :

https://github.com/nguyenngoc-phong/LAB3.git

-
Tout premièrement, téléchargez et installez le logiciel de GitHub sur votre ordinateur :

https://windows.github.com/

Lorsque que le logiciel a fini d'installer, ouvrez-le et cliquez sur le button d'options (dessin d'engrenage) en haut à droite de la fenêtre puis sur l'onglets "Options" pour configurer GitHub avec votre compte en ligne (Entrez votre nom d'utilisateur et e-mail sur "Configure Git").

-
Pour téléchargez le laboratoire sur votre ordinateur :
  - Sous le bouton "+" en haut à gauche de la fenêtre, cliquez sur l'onglet "Clone" et sélectionnez "LAB3".
  - Cliquez sur le bouton "Clone LAB3" et donner le chemin du répertoire où sera enregistré le laboratoire.

Pour avoir la version la plus récente du laboratoire ou changer à celle-ci sur votre ordinateur :
  - Cliquez sur le bouton "Sync" en haut à droite de la fenêtre pour synchroniser votre laboratoire avec celui sur GitHub.
  - Cliquez sur la bouton des branches (normalement initialisé à "master") et sélectionnez la version la plus récente du projet en ligne dans le sous-menu.

  N.B. : Cela peut prendre du temps avant que la version la plus récente du projet apparaît dans votre fenêtre. Dans le pire   des cas, fermez GitHub et réouvrez-le pour que celui-ci apparaisse.

Avant de faire des modifications sur le projet:
  - Cliquez sur le bouton à gauche du bouton des branches pour créer une nouvelle branche (nouvelle version) du projet.
  - Entrez le nom de la nouvelle version et sélectionnez sur quelle branche elle se basera.

Pour envoyer une nouvelle version du projet avec vos modifications en ligne :
  - Écrivez le nom de la nouvelle version ainsi qu'une courte description des modifications faites dans les champs de textes en dessous de la liste des modifications.
  - Cliquez sur le bouton "Commit" juste en dessous puis sur le bouton "Publish" en haut à droite de la fenêtre.

Pour demander la copie des modification d'une branche sur une autre:
  - Sélectionnez d'abord la branche dont vous voulez qu'on copie les modifications dans le bouton des branches.
  - Cliquez sur le bouton "Pull Request" en haut à droite de la fenêtre (à gauche du bouton "Sync/Publish").
  - Dans le nouveau menu, sélectionnez la branche sur laquelle vous voulez qu'on apporte les modifications.
  - Écrivez les branches que vous voulez qu'on fusionne dans le champ de texte juste en dessous (dans le format "Copie de la Version_X_X sur la Version_Y_Y") ainsi que la raison de la modification dans le champ en dessous.
  - Finalement, cliquez sur le bouton "Send Pull Request" juste en dessous.
