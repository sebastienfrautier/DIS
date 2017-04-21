package de.dis2011;

import de.dis2011.data.Apartment;
import de.dis2011.data.Estate;
import de.dis2011.data.Makler;
import de.dis2011.data.Manages;

/**
 * Hauptklasse
 */
public class Main {
	/**
	 * Startet die Anwendung
	 */
	public static void main(String[] args) {
		showMainMenu();
	}
	
	/**
	 * Zeigt das Hauptmenü
	 */
	public static void showMainMenu() {
		//Menüoptionen
		final int MENU_MAKLER = 0;
		final int MENU_ESTATE = 2;
		final int MENU_MANAGES = 3;
		final int MENU_HOUSE = 4;
		final int MENU_APARTMENT = 5;
		final int QUIT = 1;
		
		//Erzeuge Menü
		Menu mainMenu = new Menu("Hauptmenü");
		mainMenu.addEntry("Makler-Verwaltung", MENU_MAKLER);
		mainMenu.addEntry("Estate-Verwaltung", MENU_ESTATE);
		mainMenu.addEntry("Manages-Verwaltung", MENU_MANAGES);
		mainMenu.addEntry("House-Verwaltung", MENU_HOUSE);
		mainMenu.addEntry("Appartment-Verwaltung", MENU_APARTMENT);
		mainMenu.addEntry("House-Verwaltung", MENU_MAKLER);
		mainMenu.addEntry("Beenden", QUIT);
		
		//Verarbeite Eingabe
		while(true) {
			int response = mainMenu.show();
			
			switch(response) {
				case MENU_MAKLER:
					showMaklerMenu();
					break;
				case MENU_ESTATE:
					showEstateMenu();
					break;
				case MENU_MANAGES:
					showManagesMenu();
					break;
				case MENU_HOUSE:
					showHouseMenu();
					break;
				case MENU_APARTMENT:
					showApartmentMenu();
					break;
				case QUIT:
					return;
			}
		}
	}




	public static void showHouseMenu() {
		//Menüoptionen
		final int NEW_HOUSE = 0;
		final int BACK = 1;

		//Maklerverwaltungsmenü
		Menu managesMenu = new Menu("Apartment-Manages");
		managesMenu.addEntry("Neuer Apartment", NEW_HOUSE);
		managesMenu.addEntry("Zurück zum Hauptmenü", BACK);

		//Verarbeite Eingabe
		while(true) {
			int response = managesMenu.show();

			switch(response) {
				case NEW_HOUSE:
					newHouse();
					break;
				case BACK:
					return;
			}
		}
	}


	public static void newHouse() {
		Apartment e = new Apartment();


		e.setEstate_id(FormUtil.readInt("estates_id"));
		e.setFloors(FormUtil.readString("floors"));
		e.setPrice(FormUtil.readString("price"));
		e.setGarden(FormUtil.readString("garden"));
		e.save();

		System.out.println("House mit estate "+e.getEstate_id()+" wurde erzeugt.");
	}




	public static void showApartmentMenu() {
		//Menüoptionen
		final int NEW_APARTMENT = 0;
		final int BACK = 1;

		//Maklerverwaltungsmenü
		Menu managesMenu = new Menu("Apartment-Manages");
		managesMenu.addEntry("Neuer Apartment", NEW_APARTMENT);
		managesMenu.addEntry("Zurück zum Hauptmenü", BACK);

		//Verarbeite Eingabe
		while(true) {
			int response = managesMenu.show();

			switch(response) {
				case NEW_APARTMENT:
					newApartment();
					break;
				case BACK:
					return;
			}
		}
	}


	public static void newApartment() {
		Apartment e = new Apartment();


		e.setEstate_id(FormUtil.readInt("estates_id"));
		e.setFloors(FormUtil.readString("floors"));
		e.setPrice(FormUtil.readString("price"));
		e.setGarden(FormUtil.readString("garden"));
		e.save();

		System.out.println("Apartment mit estate "+e.getEstate_id()+" wurde erzeugt.");
	}





	public static void showManagesMenu() {
		//Menüoptionen
		final int NEW_MANAGES = 0;
		final int BACK = 1;

		//Maklerverwaltungsmenü
		Menu managesMenu = new Menu("Estate-Manages");
		managesMenu.addEntry("Neuer Manages", NEW_MANAGES);
		managesMenu.addEntry("Zurück zum Hauptmenü", BACK);

		//Verarbeite Eingabe
		while(true) {
			int response = managesMenu.show();

			switch(response) {
				case NEW_MANAGES:
					newManages();
					break;
				case BACK:
					return;
			}
		}
	}


	public static void newManages() {
		Manages e = new Manages();

		e.setEstate_id(FormUtil.readInt("estates_id"));
		e.setMakler_id(FormUtil.readInt("makler_id"));
		e.save();

		System.out.println("Manages mit estate "+e.getEstate_id()+" und makler"+e.getMakler_id()+" wurde erzeugt.");
	}

	/**
	 * Zeigt die Maklerverwaltung
	 */
	public static void showEstateMenu() {
		//Menüoptionen
		final int NEW_ESTATE = 0;
		final int BACK = 1;

		//Maklerverwaltungsmenü
		Menu maklerMenu = new Menu("Estate-Verwaltung");
		maklerMenu.addEntry("Neuer Estate", NEW_ESTATE);
		maklerMenu.addEntry("Zurück zum Hauptmenü", BACK);

		//Verarbeite Eingabe
		while(true) {
			int response = maklerMenu.show();

			switch(response) {
				case NEW_ESTATE:
					newEstate();
					break;
				case BACK:
					return;
			}
		}
	}


	/**
	 * Legt einen neuen Makler an, nachdem der Benutzer
	 * die entprechenden Daten eingegeben hat.
	 */
	public static void newEstate() {
		Estate e = new Estate();

		e.setStreet(FormUtil.readString("Street"));
		e.setStreet_number(FormUtil.readString("street_number"));
		e.setCity(FormUtil.readString("city"));
		e.setSquare_area(FormUtil.readString("square_area"));
		e.save();

		System.out.println("Estate mit der ID "+e.getId()+" wurde erzeugt.");
	}


	/**
	 * Zeigt die Maklerverwaltung
	 */
	public static void showMaklerMenu() {
		//Menüoptionen
		final int NEW_MAKLER = 0;
		final int BACK = 1;
		
		//Maklerverwaltungsmenü
		Menu maklerMenu = new Menu("Makler-Verwaltung");
		maklerMenu.addEntry("Neuer Makler", NEW_MAKLER);
		maklerMenu.addEntry("Zurück zum Hauptmenü", BACK);
		
		//Verarbeite Eingabe
		while(true) {
			int response = maklerMenu.show();
			
			switch(response) {
				case NEW_MAKLER:
					newMakler();
					break;
				case BACK:
					return;
			}
		}
	}
	
	/**
	 * Legt einen neuen Makler an, nachdem der Benutzer
	 * die entprechenden Daten eingegeben hat.
	 */
	public static void newMakler() {
		Makler m = new Makler();
		
		m.setName(FormUtil.readString("Name"));
		m.setAddress(FormUtil.readString("Adresse"));
		m.setLogin(FormUtil.readString("Login"));
		m.setPassword(FormUtil.readString("Passwort"));
		m.save();
		
		System.out.println("Makler mit der ID "+m.getId()+" wurde erzeugt.");
	}
}
