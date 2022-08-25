# SRP
## Single Responsibility Principle (SRP)
Le principe ouvert-fermé exige que les classes soient ouvertes à l'extension et fermées à la modification.<br>

La modification signifie changer le code d'une classe existante, et l'extension signifie ajouter de nouvelles fonctionnalités.<br>

Donc, ce que ce principe veut dire, c'est : nous devrions être capables d'ajouter de nouvelles fonctionnalités sans toucher au code existant pour la classe. En effet, chaque fois que nous modifions le code existant, nous prenons le risque de créer des bugs potentiels. Nous devons donc éviter de toucher au code de production testé et fiable (principalement) si possible.<br>
### Exemple
Nous reprenons l'exemple de SRP et nous voulons ajouter deux autres fonctionnalités principales :
-l'enregistrement de nos factures dans une base de données
-le sauvgarde de nos factures sur des fichiers
Ainsi, dans la classe InvoicePersistence, nous allons ajouter deux méthodes :
* saveToFile(String filename) : sauvgarder notre facture sur un fichier
* saveToDatabase() : sauvgarder notre facture sur une base de donnée
#### Probleme
Le problème avec cette solution est que si nous voulons ajouter un autre type d'enregistrement à nos factures, nous devrons
modifier la classe InvoicePersistance et de cette façon nous volerons le principe de OC
#### Solution
Notre solution consiste à changer le type de InvoicePersistence en Interface et ajoutons une méthode de sauvegarde. Chaque classe de persistance implémentera cette méthode de sauvegarde.
