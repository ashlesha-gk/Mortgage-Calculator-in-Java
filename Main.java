import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal($1K - $1M): ");
        int principal = scanner.nextInt();
        while(principal<1000 || principal >1000000){
            System.out.println("Enter a number between between 1,000 and 1,000,000.");
            System.out.print("Principal($1K - $1M): ");
            principal = scanner.nextInt();
        }
        System.out.print("Annual Interest Rate: ");
        float annualinterestrate = scanner.nextFloat();
        while(annualinterestrate<=0 || annualinterestrate>30){
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.print("Annual Interest Rate: ");
            annualinterestrate = scanner.nextFloat();
        }
        System.out.print("Period(Years): ");
        int period = scanner.nextInt();
        while(period<=0 || period>30){
            System.out.println("Enter a value between 0 and 30.");
            System.out.print("Period(Years): ");
            period = scanner.nextInt();
        }
        float r = annualinterestrate/(100*12);
        int n = period*12;
        float pow = (float)Math.pow(1+r,n);
        float result = principal*((r*pow)/(pow-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        String mortgage = currency.format(result);
        System.out.print("Mortgage: "+mortgage);

    }
}