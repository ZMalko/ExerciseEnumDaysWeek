package Exercies23;

/**
 * Created by Elev1 on 2017-10-30.
 */
public enum daysOfWeek {
    sunday("Sun","1"),
    monday("Mon","2"),
    tuesday("Tus","3"),
    wednsday("Wed","4"),
    thursday("Thu","5"),
    friday("Fri","6"),
    saturday("Sat","7");

    private final String daysWeek;
    private final String daysNumber;

    daysOfWeek(String myDays,String myDaysNum){
        daysWeek=myDays;
        daysNumber=myDaysNum;
    }

    public String getDaysWeek(){
        return daysWeek;
    }

    public String getDaysNumber(){
        return daysNumber;
    }

}
