package Solution;

/*
    Abstract class that stores accident data.

    This class implements the IRoadAccidents interface
    and provides the required getter methods.
*/
public abstract class RoadAccidents implements IRoadAccidents
{
    /*
        Variables to store accident information.
    */
    protected String vehicleType;
    protected String city;
    protected int accidentTotal;

    /*
        Constructor used to initialise accident data.
    */
    public RoadAccidents(String vehicleType, String city, int accidentTotal)
    {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    /*
        Returns the accident vehicle type.
    */
    @Override
    public String getAccidentVehicleType()
    {
        return vehicleType;
    }

    /*
        Returns the city where the accident occurred.
    */
    @Override
    public String getCity()
    {
        return city;
    }

    /*
        Returns the total number of accidents.
    */
    @Override
    public int getAccidentTotal()
    {
        return accidentTotal;
    }
}