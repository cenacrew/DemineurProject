#Rapport Demineur

Sourdois Pajot Valentin S3A"

##Sommaire

[Etape 0](#0)

[Etape 1](#1)

[Etape 2](#2)

[Etape 3](#3)

[Etape 4](#4)


<div id="0"></div>

##Etape 0 : Vérifions l’affichage du plateau de jeu

0)  En Executant le code on se rend compte que le bas et la droite de la fenetre sont coupés, pour regler ca il faut se rendre dans la methode connecterPartie de Dfenetre et changer la ligne du ``this.setSize`` par ``this.setSize(20*nb_col + 6 +12, 20*nb_lgn + 50 + 23 + 25+8);``


<div id="1"></div>

##Etape 1 : Premier nettoyage du code

1) Non, la classe Onglet n'est pas utilisée

2) Non, la classe DButton n'est pas utilisée

3) Non, il n'est pas utile car jamais utilisé

4) Elle calcule si la partie est fini ou pas, mais elle n'est pas appelée

5) Non, il n'est pas utile car la fonction qui le met a true n'est jamais appelé et qu'il est initialisé a false

6) Non, ils ne sont pas utiles

7) Alors oui il est utilsé,mais il n'apporte rien

8) GetMenuPartie n'est pas utilisé, et il n'y a pas de getStats

<div id="2"></div>

##Étape 2 Première étape de la restructuration de la composante métier : « Gestion du jeu »

9) Oui ces 3 methodes sont appelées

10) Elle permet de gerer le déroulement de la partie via ses différents etats

11) Il suffit d'amener le contenue de DMatrice dans DPartie

12) Le changement de package se fait simplement


<div id="3"></div>

##Étape 3 Restructurer DPanneau et DImageur pour limiter les dépendances entre les classes 

13) DImageur depend des classe DPartie et DCase

14) Ce calcul doit etre réalisé dans la composante métier

15) Fait


<div id="4"></div>

##Étape 4 Restructuration : pas de données métier dans les classes de l’IHM

16) Fait