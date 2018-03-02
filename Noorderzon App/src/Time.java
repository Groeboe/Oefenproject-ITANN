/*This is the class in which te current time will be displayed. It also has to be available for other classes*/

public class Time {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString; //simulates the display

    public Time(int hour, int minute)
    {
        hours = new NumberDiplay(24);
        minutes = new NumberDisplay(60);
//        setTime(hour, minute);
    }


}
