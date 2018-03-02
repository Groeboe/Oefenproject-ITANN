public class DemoReserveringBoek {

    // op basis van Bluej AddressBook v3
    private ReserveringDatabase reserveringDatabase;



public DemoReserveringBoek(){
    ReserveringDetails[] reserveringDetails = {
    new ReserveringDetails("123", "DansTheater", "Podium Zuid", true, BETAALD)
    };
    reserveringDatabase = new ReserveringDatabase();
    for(ReserveringDetails reservering : reserveringDetails){
        ReserveringDatabase.addReservering(reservering);

    }

}

Rese

}
