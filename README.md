# cardsGame

# User
  - int id => boolean existance : Existance utilisateur par son id
  - int idUser, int valeur => boolean soldeSuffisant : L'utilisateur a-t-il une valeur de solde supérieure à celle passée en param?
  - int id, boolean statut("achat" ou "vendeur")==> Mise à jour de solde de client


# Possessions
  - int idCarte, int idUser => boolean cartePossedee : L'utilisateur possède la carte?
  - int idCarte => boolean energieSuffisante : La carte a-t-elle suffisament d'énergie?
  

# Cards
  - int id => boolean existance : La carte existe dans le modèle?
  - int idCard => Card InfoCard : Renvoie toutes les infos d'une carte.
  - int idAttaquant, int idAttaqué => int valeurAttaque : L'attaque de la carte (lue dans le modèle) en fonction des familles

# Room

# Interface - pas une priorité normalement
