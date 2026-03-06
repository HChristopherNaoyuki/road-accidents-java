package Solution;

/*
    Interface defining required getter methods
    for retrieving road accident information.
*/
public interface IRoadAccidents
{
    /*
        Returns the vehicle type involved in the accident.
    */
    String getAccidentVehicleType();

    /*
        Returns the city where the accident occurred.
    */
    String getCity();

    /*
        Returns the total number of accidents recorded.
    */
    int getAccidentTotal();
}