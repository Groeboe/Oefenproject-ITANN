public class ProgrammaOnderdeel {

    private String naam;
    private Hashmap<> aantalStoelen;
    private double toegangsprijs;
    private boolean reserveerbaar;
    private boolean isActive;
    private hashset<int> programmas;

    public ProgrammaOnderdeel() {
        naam = "";
        aantalStoelen = new Hashmap<>();
        toegangsprijs = 0, 00;
        reserveerbaar = true;
        isActive = true;
        programmas = new hashset<>();
    }

public ProgrammaOnderdeel(String naam, int aantalStoelen)
{
    naam =naam;
    aantalStoelen =new Hashmap<aantalStoelen>();
    toegangsprijs =0,00;
    reserveerbaar =true;
    isActive =true;
    programmas =new hashset<>();
}
}

/*Attributen/velden
        -	private Locatie locatie
        -	private Genre genre
        -	private Categorie categorie
        +	private String naam = “”
        -	private Xxx begintijd
        -	private Xxx eindtijd
        +	private Hashmap <Stoelnummer, Stoelstatus> aantalStoelen
        +	private double toegangsPrijs
        +	private boolean reserveerbaar = true
        +	private boolean isActive = true
        +	private Hashset<ProgrammaOnderdeel>programmas*/

/*Methoden
        +	public ProgrammaOnderdeel()
        -	public void addProgrammaOnderdeel(…)
        -	public boolean deleteProgrammaOnderdeel(String naam)
        -	public ProgrammaOnderdeel getProgrammaOnderdeel(String naam)

        -	public getLocatie() en setLocatie()
        -	public getGenre() en setGenre()
        -	public getCategorie() en setCategorie()
        -	public getNaam() en setNaam()
        -	public getBegintijd() en setBegintijd()
        -	public getEindtijd() en setEindtijd()
        -	public getAantalstoelen() en setAantalstoelen()
        -	public getToegangsprijs() en setToegangsprijs
        -	public getReserveerbaar() en setReserveerbaar()*/

