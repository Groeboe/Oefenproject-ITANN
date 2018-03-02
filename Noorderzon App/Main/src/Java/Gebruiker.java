package com.festivall;

public class Gebruiker {

    private int accountID;
    private String mailadress;

    private String password;
    private String userRole;

    private int leeftijd;
    private char geslacht;
    private String gebruikersnaam;


    public Gebruiker(){
        accountID = 0; //dit moet een technische sleutel worden uit de database
        password = "pw";
        userRole = "bezoeker";
        leeftijd = 30;
        geslacht = 'v';
        gebruikersnaam = "gebruiker1";

    }

    public void addAccount() {

    }

    //userRole naar de waarde 'bezoeker' zetten
    public void setUserRole(String s){

    }

    //een technische sleutel als ID naar de database schrijven
    private void setAccountID(){

    }

    //verstuur een verificatie mail om het emailadres te bevestigen
    public void sendVerification(){

    }

    //het opgegeven mailadres (uit het registratie/wijzigings formulier) naar de database schrijven
    public void setMailadress(){

    }

}
