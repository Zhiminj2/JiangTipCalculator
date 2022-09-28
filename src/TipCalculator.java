import java.text.DecimalFormat;
import java.util.Scanner;
//Importing all the needed items for my further code
public class TipCalculator {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int percent = scan.nextInt();
        double total = 0;
        double num = 0;
        System.out.print("Enter a cost in dollars and cents,(-1 to end) : ");
        num = scan.nextDouble();
        //Asking user for input
        while (num != -1) {
            total = total + num;
            System.out.print("Enter a cost in dollars and cents,(-1 to end) : ");
            num = scan.nextDouble();
        }
        //Entering numbers until -1 is put for each item the user wants to buy
        System.out.println("----------------------------------");
        String formattedNum = formatter.format(total);
        System.out.println("Total Bill Before Tip : " + formattedNum );
        //Printing out the total bill before tip in correct format
        System.out.println("Tip Percentage : " + percent+"%");
        //Printing out the tip percentage user inputted earlier
        double totaltip = total*percent/100;
        String formattedtotaltip = formatter.format(totaltip);
        System.out.println("Total Tip : "+formattedtotaltip );
        //Printing out the total tip in correct format
        double totalbill = total + totaltip;
        String formattedtotalbill = formatter.format(totalbill);
        System.out.println("Total Bill With Tip: "+ formattedtotalbill );
        //Printing out the total bill with tip in correct format
        double costbeforetip = total/people;
        String formattedpeople = formatter.format(costbeforetip);
        System.out.println("Per Person Cost Before Tip: " +formattedpeople);
        //Printing out the per person cost before tip in correct format
        double TipPerPerson = totaltip/people;
        String formattedTPP = formatter.format(TipPerPerson);
        System.out.println("Tip Per Person: " + formattedTPP);
        //Printing out tip per person in correct format
        double TotalCostPerPerson = TipPerPerson+costbeforetip;
        String formattedTCPP = formatter.format(TotalCostPerPerson);
        System.out.println("Total Cost Per Person: " +formattedTCPP);
        //Printing out the total cost per person in correct format
    }
}

