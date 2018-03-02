import java.util.*;

public class ReserveringDetails {

    // Moeten we een Array oid maken waarin Reserveringen ge-add/put moeten worden  en/of een Object Reservering

private TreeMap<BezoekersID, ReserveringID, ProgrammaOnderdeel, Stoelnummer> reserveringen;
private String ReserveringID;
private PorgrammaOnderdeel programmaOnderdeel;
private Locatie locatie;
private Stoel stoelnummer;
private BezoekersID bezoekersID;
private boolean ReservingGratis;
private float Prijs;
private String StatusReservering;

//private int numberOfEntries;




public Reservering(ProgrammaOnderdeel programmaOnderdeel, Locatie locatie, Stoel stoelnummer, BezoekersId bezoekersId){

    this.programmaOnderdeel = programmaOnderdeel;
    this.locatie = locatie;
    this.stoelnummer = stoelnummer;
    this.bezoekersID = bezoekersId;
    ReservingGratis = true;
    Prijs = (programmaOnderdeel);
    StatusReservering =  betaald /  nog niet betaald;
}



    /**
     * De reserveringsgegevens afdrukken van een specifieke reserveringsnummer
     * @return alle reserveringsgegevens
     */
public Reservering reservering(String ReserveringsID){

}

    /**
     * Een reservering toevoegen voor een specifiek programmaOnderdeel met een uniek bezoekersID
     *
     */
public(){}


    /**
    * Een reservering verwijderen uit de database met Reserveringen => stoel weer vrij geven
    */
public(){}




    /**
    * Kunnen zien hoeveel Reserveringen zijn
    * @return aantal Reserveringen
    */
public int getNumberOfEntries(){

    return numberOfEntries;
}
}