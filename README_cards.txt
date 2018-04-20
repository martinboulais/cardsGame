Ne pas oublier de changer le properties et de charger la BD fourni: cards pour phpmyadmin

http://localhost:8080/cards => envoie toutes les cartes en json
http://localhost:8080/card/id=> envoie la carte qui correspond à l'id


@RequestMapping(method=RequestMethod.POST,value="/cards") => ajout d'une carte

@RequestMapping(method=RequestMethod.PUT,value="/update_card/{id}")=>mise a jour de la carte id

@RequestMapping(method=RequestMethod.DELETE,value="/delete_card/{id}")
=>supprime la carte

@RequestMapping("/card/attack/{id1}/{id2}")
=> retourne la valeur de l'attaque en fonction de la famille cad des forces et faiblesse 


format du retour: 
{"id":1,"name":"myHERO","description":"NULL","family":"DC Comics","hp":3000,"attack":500,"defence":1,"energy":0,"imgUrl":"https://combien.io/wp-content/uploads/2017/02/super-hero-marvel-678x381.jpg","price":-1}

Contient des tests unitaires pour la methode GET /card/1
et Post /cards
fonctionne si on  il commente le autowired pour family service ligne24 de CardsRestController