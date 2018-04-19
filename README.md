# cardsGame

# User
  - int id => boolean existance : Existance utilisateur par son id
  - int idUser, int valeur => boolean soldeSuffisant : L'utilisateur a-t-il une valeur de solde supérieure à celle passée en param?
  - int id, boolean statut(1 => "achat" 0 => "vente")==> Mise à jour de solde de client


# Possessions
  - int idCarte, int idUser => boolean cartePossedee : L'utilisateur possède la carte?
  - int idCarte => boolean energieSuffisante : La carte a-t-elle suffisament d'énergie?
  

# Cards
  - int id => boolean existance : La carte existe dans le modèle?http://localhost:8080/cards/id =>renvoie rien si pas carte
  - int idCard => Card InfoCard : Renvoie toutes les infos d'une carte.
  http://localhost:8080/card/id
  - int idAttaquant, int idAttaqué => int valeurAttaque : L'attaque de la carte (lue dans le modèle) en fonction des familles
  http://localhost:8080/card/attack/{id1}/{id2}
# Room

# Interface - pas une priorité normalement
