# CatalogApp

Instructions can be found in G:\enriquezki\CS 5014\Exercise 05032018

Create a Library Catalogue System (Due May 10,Thu)

High-level Specifications:
-The system should have 4 functionalities: Add Catalog Card, 
Edit Catalog Card, Remove Catalog Card, View Catalog Card.
-User should have the option to view either a single catalog 
card or the entire catalogue (sorted).
-If a user selects the View option, user should be able to choose
among 3 options: View catalogue sorted by Card ID, sorted by
Year Published, and sorted by Date Added

Technical Specifications:
-There should be a class CatalogCard with the following 
attributes:
*cardID
*bookTitle
*bookAuthor
*yearPublished
*dateAdded
*dateUpdated
*addedBy
*updatedBy
-Every time a catalog is added, it should be sorted by Card ID and
stored in a list.
-The CatalogCard class and the class with the main() method must be in different packages.
-When a record is removed, it should be archived to separate list.
-Encapsulation should be implemented.
-Constructor Chaining may be implemented (incentives).
-GUI may be implemented (incentives)

# Might be helpful:
## ArrayList<CatalogCard> cat = new ArrayList<CatalogCard>();
## Collections.sort();

