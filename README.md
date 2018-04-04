# cardsGame

# User
  - int id => boolean existance : Existance utilisateur par son id
  - int idUser, int price => boolean soldeSuffisant : L'utilisateur a-t-il assez d'argent pour acheter cette carte?
  - int id, String statut("achat" ou "vendeur")==> Mise à jour de solde de client


# Possessions
  - int idCarte, int idUser => boolean cartePossedee : L'utilisateur possède la carte?
  - int idCarte => boolean energieSuffisante : La carte a-t-elle suffisament d'énergie?
  

# Cards
  - int id => boolean existance : La carte existe dans le modèle?
  - int idCard => Card InfoCard : Renvoie toutes les infos d'une carte.

# Room

# Interface - pas une priorité normalement
