import java.text.DecimalFormat;
import java.util.Scanner;

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
        while (num != -1) {
            total = total + num;
            System.out.print("Enter a cost in dollars and cents,(-1 to end) : ");
            num = scan.nextDouble();
        }
        System.out.println("----------------------------------");
        String formattedNum = formatter.format(total);
        System.out.println("Total Bill Before Tip : " + formattedNum );
        System.out.println("Tip Percentage : " + percent+"%");
        double totaltip = total*percent/100;
        String formattedtotaltip = formatter.format(totaltip);
        System.out.println("Total Tip : "+formattedtotaltip );
        double totalbill = total + totaltip;
        String formattedtotalbill = formatter.format(totalbill);
        System.out.println("Total Bill With Tip: "+ formattedtotalbill );
        double costbeforetip = total/people;
        String formattedpeople = formatter.format(costbeforetip);
        System.out.println("Per Person Cost Before Tip: " +formattedpeople);
        double TipPerPerson = totaltip/people;
        String formattedTPP = formatter.format(TipPerPerson);
        System.out.println("Tip Per Person: " + formattedTPP);
        double TotalCostPerPerson = TipPerPerson+costbeforetip;
        String formattedTCPP = formatter.format(TotalCostPerPerson);
        System.out.println("Total Cost Per Person: " +formattedTCPP);
    }
}

