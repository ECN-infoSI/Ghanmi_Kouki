# Ghanmi_Kouki

# README - Implémentation du jeu Othello

## Introduction
Ce projet implémente le jeu **Othello** en Java. Il utilise **Maven** pour la gestion des dépendances et des plugins, et offre une intégration avec **SonarCloud** pour l'analyse de la qualité du code, ainsi qu'un rapport de couverture de tests avec **JaCoCo**.

## Configuration de l'Environnement

Avant de pouvoir utiliser ce projet, assurez-vous que votre environnement est correctement configuré :

1. **Java 17** doit être installé sur votre machine. Vous pouvez télécharger Java depuis [le site officiel d'Oracle](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).
2. **Maven** doit être installé pour pouvoir exécuter les commandes liées à la construction du projet. Vous pouvez installer Maven depuis [le site officiel de Maven](https://maven.apache.org/download.cgi).
3. **SonarCloud** est utilisé pour l'analyse de la qualité du code. Vous devez créer un compte sur [SonarCloud](https://sonarcloud.io/) et définir les variables d'environnement nécessaires :
   - `SONAR_ORG` : Nom de votre organisation sur SonarCloud.
   - `SONAR_TOKEN` : Token d'authentification pour accéder à SonarCloud.

Ces variables d'environnement peuvent être configurées comme suit :

```bash
export SONAR_ORG="votre_organisation"
export SONAR_TOKEN="votre_token"

