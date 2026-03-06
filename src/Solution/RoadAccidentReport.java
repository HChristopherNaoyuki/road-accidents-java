package Solution;

/*
    Concrete subclass used to generate
    the accident report.
*/
public class RoadAccidentReport extends RoadAccidents
{
    /*
        Constructor that passes parameters
        to the superclass constructor.
    */
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal)
    {
        super(vehicleType, city, accidentTotal);
    }

    /*
        Prints the formatted accident report
        according to the required sample layout.
    */
    public void printAccidentReport()
    {
        System.out.println();
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("****************************");

        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());

        System.out.println("****************************");
    }
}