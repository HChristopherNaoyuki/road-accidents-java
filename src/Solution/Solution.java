package Solution;

import java.util.Scanner;

/*
    Main application class.

    Responsible for collecting user input
    and generating the accident report.
*/
public class Solution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        /*
            Variables to store user input.
        */
        String vehicleType;
        String city;
        int accidentTotal;

        /*
            Prompt user for accident vehicle type.
        */
        System.out.print("Enter the accident vehicle type: ");
        vehicleType = input.nextLine();

        /*
            Prompt user for the city where the accident occurred.
        */
        System.out.print("Enter the city for the vehicle accidents: ");
        city = input.nextLine();

        /*
            Prompt user for the number of accidents.
        */
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        accidentTotal = input.nextInt();

        /*
            Create report object using user input.
        */
        RoadAccidentReport report =
                new RoadAccidentReport(vehicleType, city, accidentTotal);

        /*
            Print the accident report.
        */
        report.printAccidentReport();

        input.close();
    }
}