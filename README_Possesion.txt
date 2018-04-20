Ne pas oublier de changer le properties et de charger la BD fourni
utilisation du port 8081

http://localhost:8081/possession/{idcard} => 
 Cette fonction va faire appel au MicroService Card
	 * afin de récupérer toutes les informations qui
	 * corresspondent à la carte avec l'id : idcard.



http://localhost:8081/possession/user/{iduser}
 * Cette fonction permet de récupérer toutes les cartes que possède
'utilisateur avec l'id : iduser.
	

@RequestMapping("/havecard/{iduser}/{idcard}")
=> return true si l'iduser a la carte dans la BD 

http://localhost:8081/haveenergy/{idcard}
=> retourne l'energie de la carte

