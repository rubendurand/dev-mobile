Question 1 : Ou se trouve ce fichier ? Donnez son nom et son emplacement dans l'arborescence du projet.

Le fichier s'appelle activity_main.xml et se trouve dans le main/res/activity_main.xml

Question 2 : Qu'avez vous modifié ?

J'ai changé le common attributes text dans le activity_main.xml

Question 3 : Qu'avez-vous modifié pour changer l'icône ?

Clic droit sur mipmap-anydpi-v26 -> new -> image asset et j'ai suivi les étapes en mettant mon image

Question 4 : Est-ce nécessaire de cliquer sur le bouton valider pour afficher le texte saisi sur la seconde activité ?

Non car il n'y a aucune vérification sur le fait que le bouton Valider a été utilisé avant de passer à la page suivante

Question 5 : Le comportement de la question 4 vous sembe-t-il normal ?

Non il faudrait avoir un texte a afficher sur la page suivante.

Question 6 Comment faire pour ne pas afficher le nouveau texte sur la deuxième activiter tant que le bouton validé n'a pas été cliqué ?

On peut ajouter une variable booléenne initialisée a false qui passe a true si le bouton Valider est cliqué, cette variable est ensuite utilisée comme condition pour aller sur la page suivante.