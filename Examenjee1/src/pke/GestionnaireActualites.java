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
			listeActualites.add(new Actualite("1","CAF : Dates de la prochaine CAN et du prochain CHAN","Sport","Le Comité exécutif de La Confédération Africaine de Football, lors de sa réunion au Caire le 15 et 16 mai 2013, a approuvé la nomination des nouveaux membres des comités permanents de la CAF pour 2013-2015, suite à un nouveau mode de sélection."));
			listeActualites.add(new Actualite("2","Les Google Glasses commercialisées dès 2014","Technologie","Et si c'était la prochaine grande innovation? Les Google Glass vont être commercialisées dès 2014. Le cabinet d'étide IHS estime que 9,4 millions pourraient en être vendues d'ici 2016. À condition que leur prix ne rebute pas le grand public: 1500 euros."));
			listeActualites.add(new Actualite("3","Journée mondiale des télécommunications ","Economie","La journée mondiale des télécommunications et de la société de l’information, qui sera célébrée vendredi, est inscrite cette année sous le thème « Les technologies de l’information et de la communication (TIC) au service de l’amélioration de la sécurité routière », selon l’Union internationale des télécommunications (UIT)."));
		}
		return listeActualites;
	}
}
