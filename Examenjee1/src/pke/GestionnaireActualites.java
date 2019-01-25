package pke;

import java.util.ArrayList;

public class GestionnaireActualites {

	private static ArrayList<Actualite> listeActualites = new ArrayList<Actualite>();

	public static void ajouterActualite (String code, String titre, String categorie, String description){
				Actualite a = new Actualite(code,titre,categorie,description);
				listeActualites.add(a);
	}
	
	public static void supprimerActualite(String code){
		Actualite a = new Actualite(code);
		listeActualites.remove(a);
	}
	
	public static ArrayList<Actualite> getListeActualites() {
		if(listeActualites.isEmpty()){
			listeActualites.add(new Actualite("1","CAF : Dates de la prochaine CAN et du prochain CHAN","Sport","Le Comit� ex�cutif de La Conf�d�ration Africaine de Football, lors de sa r�union au Caire le 15 et 16 mai 2013, a approuv� la nomination des nouveaux membres des comit�s permanents de la CAF pour 2013-2015, suite � un nouveau mode de s�lection."));
			listeActualites.add(new Actualite("2","Les Google Glasses commercialis�es d�s 2014","Technologie","Et si c'�tait la prochaine grande innovation? Les Google Glass vont �tre commercialis�es d�s 2014. Le cabinet d'�tide IHS estime que 9,4 millions pourraient en �tre vendues d'ici 2016. � condition que leur prix ne rebute pas le grand public: 1500 euros."));
			listeActualites.add(new Actualite("3","Journ�e mondiale des t�l�communications ","Economie","La journ�e mondiale des t�l�communications et de la soci�t� de l�information, qui sera c�l�br�e vendredi, est inscrite cette ann�e sous le th�me � Les technologies de l�information et de la communication (TIC) au service de l�am�lioration de la s�curit� routi�re �, selon l�Union internationale des t�l�communications (UIT)."));
		}
		return listeActualites;
	}
}
