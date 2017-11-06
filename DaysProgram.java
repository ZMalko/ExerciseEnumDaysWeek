package Exercies23;

//import java.lang.Object;

import java.util.Scanner;

/**
 * Created by Elev1 on 2017-10-30.
 */
public class DaysProgram {
    public static void main(String[] args) {
       // for(daysOfWeek myWeek: daysOfWeek.values()){
       //     System.out.printf("%s\t%s\t%s\n",myWeek,myWeek.getDaysWeek(),myWeek.getDaysNumber());
       // }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7: ");
        String myWeek=scan.nextLine();

        switch (myWeek.toLowerCase()){
            case "1":
                System.out.println("This day is Sunday ");
                break;
            case "2":
                System.out.println("This is Monday ");
                break;
            case "3":
                System.out.println("This is Tusday ");
                break;
            case "4":
                System.out.println("This is Wednsday ");
                break;
            case "5":
                System.out.println("This is Thursday ");
                break;
            case "6":
                System.out.println("This is Friday ");
                break;
            case "7":
                System.out.println("This is Saturday");
                break;
                default:
                    System.out.println("Finished");

        }


    }
}
