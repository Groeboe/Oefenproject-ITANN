package com.festivall;

import java.sql.SQLOutput;
import java.util.Date;


public class Gebruiker {

	private int accountID;
	private String emailadres;
	private String password;
	private String userRole;  // TS voorstel: userRole doen middels ENUM types: BEZOEKER, ARTIEST,..
	private String gebruikersnaam;
	private char geslacht;
	private Date geboortedatum;  // dit was een Int leeftijd

	// TS voorstel:   gebruiker ook de mogelijkheid beiden een profielfoto te uploaden


	/*
	Contructor Gebruiker Object
	 */
	public Gebruiker() {

		accountID = 0; //dit moet een auto incremental technische sleutel worden uit de database
		password = "pw";  // dit moet voldoen aan eisen van lengte, getal, teken, hoofdletter
		userRole = "bezoeker";
		gebruikersnaam = "gebruiker1";  // dit moet een unieke waarde zijn == geen dubbele gebruikersnamen
		//geboortedatum = ... //   hier moet een type komen. Lijkt het handigste direct te koppelen met de database ivm format
		geslacht = 'v';

	}

	/*
	Methode die gebruiker gebruikt om zich in te schrijven als gebruiker
	@param emailadres, password, gebruikersnaam, geslacht, leeftijd
	@return bevestiging van inschrijving
	 */
	public void addAccount(String emailadres, String password, String gebruikersnaam, char geslacht, Date geboortedatum) {

		this.emailadres = emailadres;
		this.password = password;
		this.gebruikersnaam = gebruikersnaam
		this.geslacht = geslacht;
		this.geboortedatum = geboortedatum;

		accountID = setAccountID();
		userRole = setUserRole();   // dit moet anders ivm te bepalen veld type

		sendVerification(emailadres);
	}

    /*
    //verstuur een verificatie mail om het emailadres te bevestigen
     */

	public void sendVerification(String emailadres) {

		System.out.println("Beste " + gebruikersnaam + ",\n Dank voor je aanmelding bij Noorderzon! Dit zijn de gegevens die je hebt ingevoerd: ");
		System.out.println("Emailadres: " + emailadres);
		System.out.println("Gebruikersnaam: " + gebruikersnaam);
		System.out.println("Geslacht: " + geslacht);
		System.out.println("Geboortedatum: " + geboortedatum);
		System.out.println("\n Mocht je deze gegevens willen wijzigen klik dan hier.");
	}


	/*
	//een technische sleutel als ID vanuit/naar de database schrijven
	 */
	private int setAccountID() {


		return accountID;
	}


	/*
	//het opgegeven mailadres (uit het registratie/wijzigings formulier) naar de database schrijven
	 */
	private void setMailadress() {

	}

	private String getMailadress() {

		return emailadres;

	}


	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private String getUserRole() {
		return userRole;
	}

	private void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	private String getGebruikersnaam() {
		return gebruikersnaam;
	}

	private void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	private Date getGeboortedatum() {
		return geboortedatum;
	}

	private void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

}
