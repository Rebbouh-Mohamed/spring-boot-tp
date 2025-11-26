# Master 2 - Architecture Logicielle (Arch Log)  
Solutions des TPs - Spring Boot

Ce dépôt contient **les solutions complètes et fonctionnelles** des travaux pratiques du module **Architecture Logicielle** (M2 - 2ème année Master).

## Contenu du dépôt

| Dossier / Fichier           | Description                                                       |
|----------------------------|-------------------------------------------------------------------|
| **tp_pdfs/**               | Tous les énoncés originaux au format PDF fournis par le professeur |
| **tp_orm/**                | TP sur Spring Data JPA, Hibernate, relations, etc.                |
| **tp03/**                  | TP 03 (généralement Spring Security + JWT ou autre sujet avancé)  |
| **test-java/**             | Petits tests/exercices Java purs (hors Spring)                    |
| **test-spring-maven/**     | Projet Spring Boot de test (structure Maven classique)            |
| **README.md**              | Ce fichier                                                                |

### Lien direct vers les énoncés  
Tous les PDFs des TPs se trouvent ici → [**./tp_pdfs/**](./tp_pdfs/)

## Comment lancer les projets

Chaque dossier `tp_orm`, `tp03`, `test-spring-maven` est un projet Spring Boot autonome.

```bash
# Exemple pour le TP ORM
cd tp_orm
./mvnw spring-boot:run    # ou mvn spring-boot:run

# Exemple pour le TP03
cd tp03
./mvnw spring-boot:run