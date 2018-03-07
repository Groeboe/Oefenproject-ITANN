import java.util.HashMap;
import java.util.HashSet;
import java.util.Date;

public class ProgrammaOnderdeel {

	private String programmaTitel;
    private int aantalBenodigdeStoelen;
    //private HashMap< > aantalBeschikbareStoelen;      wat wil je hiermee bereiken?
	private boolean reserveerbaar;
	private double toegangsprijs;
    private boolean isActive;
    //private HashSet<> programmas;    wat wil je hier mee bereiken?
    private int programmaID;
    private Locatie locatie;
    private Genre genre;
    private Date begintijd;
    private Date eindtijd;

    public ProgrammaOnderdeel() {
		programmaTitel = "";
        aantalBenodigdeStoelen = 100;
        toegangsprijs = 10.00;
        reserveerbaar = true;
        isActive = true;
        programmaID = 1234;
        //locatie = "Podium Zuid";
        //genre = ;
		//begintijd =  ;
		//eindtijd =  ;

    }

public ProgrammaOnderdeel(String programmaTitel, int aantalBenodigdeStoelen, boolean reserveerbaar)
{

	this.programmaTitel =programmaTitel;
    this.aantalBenodigdeStoelen = aantalBenodigdeStoelen;
    this.reserveerbaar = true;
    setProgrammaID();
    isActive =true;

    // de persoon die de gegevens invult moet gevraagd worden het volgende te zetten:   toegangsprijs, locatie,

}

	private void setProgrammaID(){

    	// auto increment getal

	}

	private int getProgrammaID(){

    	return programmaID;

	}

	private String getProgrammaTitel() {
		return programmaTitel;
	}

	private void setProgrammaTitel(String programmaTitel) {
		this.programmaTitel = programmaTitel;
	}

	private int getAantalBenodigdeStoelen() {
		return aantalBenodigdeStoelen;
	}

	private void setAantalBenodigdeStoelen(int aantalBenodigdeStoelen) {
		this.aantalBenodigdeStoelen = aantalBenodigdeStoelen;
	}

	private double getToegangsprijs() {
		return toegangsprijs;
	}

	private void setToegangsprijs(double toegangsprijs) {
		this.toegangsprijs = toegangsprijs;
	}

	private Locatie getLocatie() {
		return locatie;
	}

	private void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	private Genre getGenre() {
		return genre;
	}

	private void setGenre(Genre genre) {
		this.genre = genre;
	}

	private Date getBegintijd() {
		return begintijd;
	}

	private void setBegintijd(Date begintijd) {
		this.begintijd = begintijd;
	}

	private Date getEindtijd() {
		return eindtijd;
	}

	private void setEindtijd(Date eindtijd) {
		this.eindtijd = eindtijd;
	}



}

/*Attributen/velden
        -	private Categorie categorie  (TS:  wat is het verschil tussen Genre en Categorie?)
        +	private Hashmap <Stoelnummer, Stoelstatus> aantalStoelen   (TS:   volgens mij moet dit anders, ben er nog niet uit hoe)
        +	private Hashset<ProgrammaOnderdeel>programmas (TS:   volgens mij moet dit anders, ben er nog niet uit hoe)
*/

/*Methoden (TS: deze horen volgens mij in de Abstract oid...)
        +	public ProgrammaOnderdeel()
        -	public void addProgrammaOnderdeel(…)
        -	public boolean deleteProgrammaOnderdeel(String naam)
        -	public ProgrammaOnderdeel getProgrammaOnderdeel(String naam)



